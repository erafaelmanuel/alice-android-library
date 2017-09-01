package com.remswork.project.alice.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.remswork.project.alice.service.impl.SubjectServiceImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            int size = new SubjectServiceImpl().getSubjectListByTeacherId(124345).size();
            Log.i("myTAG", size + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
