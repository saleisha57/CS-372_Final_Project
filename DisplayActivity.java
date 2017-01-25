package com.randomfood.www.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    String food;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        food = intent.getStringExtra("Display");
        TextView text = (TextView)findViewById(R.id.Display);
        text.setText(String.format("The food choice is:\n" + "\n%s",food));
    }


}
