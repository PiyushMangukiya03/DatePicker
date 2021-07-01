package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

import mr.pm.datepicker.DateTimePickerView;

public class MainActivity extends AppCompatActivity {

    Button btnDatePicker;
    private DateTimePickerView dateTimePickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDatePicker = findViewById(R.id.btnDatePicker);

        btnDatePicker.setOnClickListener(v -> {
            dateTimePickerView = new DateTimePickerView.Builder(this, (date, v1) -> {//选中事件回调

            }).setType(new boolean[]{true, true, true, false, false, false})
                    .setCancelText("Cancel")
                    .setSubmitText("Sure")
                    .setContentSize(18)
                    .isCenterLabel(false)
                    .setDividerColor(Color.DKGRAY)
                    .setContentSize(21)
                    .setDecorView(null)
                    .isCyclic(true)
                    .build();

            dateTimePickerView.show();
        });
    }
}