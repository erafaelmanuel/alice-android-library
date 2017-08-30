package com.remswork.project.alice.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.remswork.project.alice.exception.SectionException;
import com.remswork.project.alice.exception.StudentException;
import com.remswork.project.alice.model.Section;
import com.remswork.project.alice.model.Student;
import com.remswork.project.alice.service.impl.SectionServiceImpl;
import com.remswork.project.alice.service.impl.StudentServiceImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionServiceImpl sectionService = new SectionServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        try {
            //TEST SECTION
            Section newSec = new Section();
            newSec.setName("1-C");
            sectionService.updateSectionById(28, newSec, 11);
            sectionService.deleteSectionById(28);

            Section section = sectionService.getSectionById(12);
            List<Section> sectionList = sectionService.getSectionList();


            Log.i("MyTAG", section.getName());
            Log.i("MyTAG", sectionList.size() + "");

            //TEST SECTION
            Student newStud = new Student(12133L, "Trainer","101","Manuel","Male",15,"");
//            sectionService.updateSectionById(28, newSec, 11);
//            sectionService.deleteSectionById(28);
            studentService.addStudent(newStud, 12);

        } catch (SectionException | StudentException e) {
            e.printStackTrace();
        }
    }


}
