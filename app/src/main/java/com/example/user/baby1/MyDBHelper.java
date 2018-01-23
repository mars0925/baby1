package com.example.user.baby1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2018/1/23.
 */

public class MyDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "badydaily.sqlite";
    final static int VERSION = 1;
    public MyDBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE `personal_data` ( `_personalid` INTEGER, `name` TEXT, `gender` INTEGER, `birthday` TEXT, PRIMARY KEY(`_personalid`) )");
            sqLiteDatabase.execSQL("CREATE TABLE `feed_data` ( `_feednum` INTEGER, `recordtime` TEXT, `mothermilk` INTEGER, `formula` INTEGER, `weaning` INTEGER , PRIMARY KEY(`_feednum`) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
