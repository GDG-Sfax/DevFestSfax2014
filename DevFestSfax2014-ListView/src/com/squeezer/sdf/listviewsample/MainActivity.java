package com.squeezer.sdf.listviewsample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListItemWrapper> objectListList = new ArrayList<ListItemWrapper>();
        for (int i = 0; i < 1000; i++) {
            ListItemWrapper wrapper = new ListItemWrapper("item n° " + i,
                    "item n° " + i + " description", R.drawable.ic_launcher);
            objectListList.add(wrapper);
        }

        mListView = (ListView) findViewById(R.id.list_view);

        CustomAdapter customAdapter = new CustomAdapter(
                getApplicationContext(), objectListList);

        mListView.setAdapter(customAdapter);

    }

}
