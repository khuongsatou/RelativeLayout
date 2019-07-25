package com.example.training.ListViewBasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.training.R;

public class SubActivity extends AppCompatActivity {

    private ListView lvStudent;
    private String[] students = {"Hoa","Nam","Việc","Hoa","Nam","Việc","Hoa","Nam","Việc","Hoa","Nam","Việc","Hoa","Nam","Việc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Radiation();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(SubActivity.this,android.R.layout.simple_list_item_1,students);
        lvStudent.setAdapter(arrayAdapter);
    }

    private  void Radiation(){
        lvStudent = (ListView) findViewById(R.id.lvStudent);
    }


}
