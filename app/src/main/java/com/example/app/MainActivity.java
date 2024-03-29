package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button mClickMeButton = findViewById(R.id.click_me);
        final TextView mTextView =  findViewById(R.id.main_text_view);

        mClickMeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mTextView.setText(R.string.on_click_text);
            }
        });
    }
}
