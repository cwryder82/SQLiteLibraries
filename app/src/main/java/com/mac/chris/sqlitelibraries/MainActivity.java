package com.mac.chris.sqlitelibraries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.orm.SugarRecord;

/*
This is an example of Using Sugar ORM for SQLite
*/
public class MainActivity extends AppCompatActivity {

    SugarRecord record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        record = new SugarRecord();
    }
}
