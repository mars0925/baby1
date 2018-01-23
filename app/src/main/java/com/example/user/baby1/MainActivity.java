package com.example.user.baby1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //個人資料的dao
       Personal_DataDAO dao = new Personal_DataDAO(MainActivity.this);
       Personal_Data personal_data = new Personal_Data(17,"CHANG",1,"2016/05/9");
       //dao.alterbabydata(personal_data)
       //dao.deletebaby(4);
        dao.addbaby(personal_data);
    }
}
