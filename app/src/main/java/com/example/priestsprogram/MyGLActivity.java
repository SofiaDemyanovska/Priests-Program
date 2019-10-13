package com.example.priestsprogram;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MyGLActivity extends Activity  {

    private GLSurfaceView glView;                   // use GLSurfaceView
    private MediaPlayer mp;
    // Call back when the activity is started, to initialize the view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glView = new GLSurfaceView(this);           // Allocate a GLSurfaceView
        glView.setRenderer(new MyGLRenderer(this)); // Use a custom renderer
        this.setContentView(glView);                // This activity sets to GLSurfaceView

        glView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MyGLActivity.this, R.raw.sound);
                mp.start();
            }
        });
    }

    // Call back when the activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
        mp.release();
    }

    // Call back after onPause()
    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    }
}