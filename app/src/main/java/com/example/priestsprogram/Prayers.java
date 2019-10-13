package com.example.priestsprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ListAdapter;

public class Prayers extends AppCompatActivity {

    Toolbar mToolbar;
    ListView mListView;

    String[] countryNames = {"Молитва про дари Святого Духа", "Молитва до Отця Небесного", "Молитва до Найсятішого Імені Ісуса", "Молитва до Пресвятої Богородиці", "Молитва матері, яка очікує дитину", "Молитва в безсиллі", "Молитва за ув'язнених", "Митарева молитва"
            , "Покаяна молитва", "Боже мій, прости!", "Молитва до ангела хоронителя", "Молитва до Божої матері", "Молитва від страху"};

    int[] countryFlags = {R.drawable.prayers1,
            R.drawable.prayers2,
            R.drawable.prayers3,
            R.drawable.prayers4,
            R.drawable.prayers5,
            R.drawable.prayers6,
            R.drawable.prayers7,
            R.drawable.prayers8,
            R.drawable.prayers9,
            R.drawable.prayers10,
            R.drawable.prayers11,
            R.drawable.prayers12,
            R.drawable.prayers13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayers);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(Prayers.this, countryNames, countryFlags);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(Prayers.this, DetailActivity.class);
                mIntent.putExtra("countryName", countryNames[i]);
                mIntent.putExtra("countryFlag", countryFlags[i]);
                startActivity(mIntent);
            }
        });
    }
}

