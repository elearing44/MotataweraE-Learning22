package com.example.motatawerae_learning.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.motatawerae_learning.R;

public class SplashActivity extends AppCompatActivity {

    Animation anim_ivg , anim_text , anim_takea;
    TextView tv;
    ImageView iv_t,iv_takea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);

        tv=findViewById(R.id.splash_tv_app_address);
        iv_t=findViewById(R.id.splash_iv_t);
        iv_takea=findViewById(R.id.splash_iv_takea);

        anim_ivg = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        anim_text = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text_address_app);
        anim_takea = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_tckea);

        tv.setAnimation(anim_text);
        iv_t.setAnimation(anim_ivg);
        iv_takea.setAnimation(anim_takea);


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                    tv.setAnimation(anim_text);
                    iv_t.setAnimation(anim_ivg);
                    Intent i = new Intent(getApplication(),Login.class);
                    startActivity(i);
                    finish();
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }


            }

        });
        t.start();

    }
}