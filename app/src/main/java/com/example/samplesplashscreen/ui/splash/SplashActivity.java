package com.example.samplesplashscreen.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.samplesplashscreen.R;
import com.example.samplesplashscreen.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.textView);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        textView.startAnimation(anim);
        anim.setAnimationListener(listener);
    }

    private Animation.AnimationListener listener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            // TODO open next activity
            textView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }, 1000);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
}
