package notufy.thapar.com.notufy.GCM;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {
	   

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
        Log.e("inside ", "onrecieve");
		// Explicitly specify that GcmIntentService will handle the intent.
        ComponentName comp = new ComponentName(arg0.getPackageName(),
                GcmIntentService.class.getName());
        // Start the service, keeping the device awake while it is launching.
        startWakefulService(arg0, (arg1.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
		
	}
}

