package com.example.checkboxandradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox mCbAndroid,mCbIos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCbAndroid = findViewById(R.id.checkboxAndroid);
        mCbIos = findViewById(R.id.checkboxIos);


        mCbIos.setOnCheckedChangeListener(onCheckedChangeListener);
        mCbAndroid.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            String message = "";
            switch (compoundButton.getId()){
                case R.id.checkboxAndroid :
                    if (b) message = "Đã chọn Android";
                    else message = "Bỏ chọn Android";
                    break;
                case R.id.checkboxIos :
                    if (b) message = "Đã chọn Ios";
                    else message = "Bỏ chọn Ios";
                    break;
            }
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }
    };
}