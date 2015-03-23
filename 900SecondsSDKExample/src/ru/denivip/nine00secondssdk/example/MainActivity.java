package ru.denivip.nine00secondssdk.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onMapClick(View v){
      Intent intent = new Intent(MainActivity.this, MapActivity.class);
      startActivity(intent);
	}
	
	public void onStreamingClick(View v){
		Intent intent = new Intent(MainActivity.this, CameraStreamingActivity.class);
		startActivity(intent);
	}

}
