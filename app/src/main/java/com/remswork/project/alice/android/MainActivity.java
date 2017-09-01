package com.remswork.project.alice.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.remswork.project.alice.model.Activity;
import com.remswork.project.alice.service.ActivityService;
import com.remswork.project.alice.service.impl.ActivityServiceImpl;
import com.remswork.project.alice.service.impl.SubjectServiceImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            ActivityService activityService = new ActivityServiceImpl();
            Activity activity = activityService.addActivity(new Activity("TItle", "date", 12, 10), 87, 10101);
            Log.i("Title", activity.getTitle());
            //activity = activityService.updateActivityById(activity.getId(), new Activity("TItle", "date", 12, 10), 87, 10101);
            Log.i("Title", activity.getTitle());
            activity = activityService.getActivityById(activity.getId());
            Log.i("Title", activity.getTitle());
            int size = activityService.getActivityList().size();
            Log.i("Size", size + "");
            size = activityService.getActivityListByStudentAndSubjectId(87, 10101).size();
            Log.i("Size", size + "");
            size = activityService.getActivityListByStudentAndSubjectId(87, 10212).size();
            Log.i("Size", size + "");
            activityService.deleteActivityById(activity.getId());
            size = activityService.getActivityList().size();
            Log.i("Size", size + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
