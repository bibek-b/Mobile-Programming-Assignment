package com.bibek.mpassignment;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Q17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ONCREATE", "On Create Method Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ONSTART", "On Start Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ONRESUME", "On Resume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ONPAUSE", "On Pause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ONSTOP", "On Stop Method Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ONRESTART", "On Restart Method Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ONDESTROY", "On Destroy Method Called");
    }
}