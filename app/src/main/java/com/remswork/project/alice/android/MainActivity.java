package com.remswork.project.alice.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.remswork.project.alice.exception.ScheduleException;
import com.remswork.project.alice.service.impl.ScheduleServiceImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            int size = new ScheduleServiceImpl().getScheduleListByTeacherId(1).size();
            Log.i("myTAG", size + "");
        } catch (ScheduleException e) {
            e.printStackTrace();
        }
    }


}
