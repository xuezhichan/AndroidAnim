package com.seno.androidanim;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ParallaxActivity extends AppCompatActivity {

    public static void start(Context context) {
        if (context != null)
            context.startActivity(new Intent(context, ParallaxActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallax);
    }
}
