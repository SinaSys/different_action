package com.sriyanksiddhartha.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

	private static final String TAG = MyFirstReceiver.class.getSimpleName();

	@Override
	public void onReceive(Context context, Intent intent) {

		String name = intent.getStringExtra("name");
		int age = intent.getIntExtra("age", 0);
		Log.i(TAG, name + ", " + age);

		Toast.makeText(context, "Hello from 1st Receiver", Toast.LENGTH_LONG).show();
	}
}
