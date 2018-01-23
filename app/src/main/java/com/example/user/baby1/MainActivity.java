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

        //飲食的dao
       //Feed_Data feed_data = new Feed_Data(66,"2018/8/12",500,1000,100);

       //Feed_DataDAO dao = new Feed_DataDAO(MainActivity.this);
       //dao.deletefeed(66);


    }
}
