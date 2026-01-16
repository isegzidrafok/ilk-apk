package com.example.ilkapk;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("G");
        text.setTextSize(120);
        text.setTextColor(Color.YELLOW);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
