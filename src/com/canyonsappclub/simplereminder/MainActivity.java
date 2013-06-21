package com.canyonsappclub.simplereminder;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/** First off, we're gonna create a thread that will check our device's registration status with GCM. If we are properly registered.
		 * We do this on a separate thread so the application can continue to run.
		 **/
		Thread checkGcmThread = new Thread(ManageGCM.checkGcmStatus);
		checkGcmThread.start();
		//All done with GCM

		Log.d("Data Log","Application started");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
