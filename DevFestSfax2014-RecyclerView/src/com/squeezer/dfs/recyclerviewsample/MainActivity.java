package com.squeezer.dfs.recyclerviewsample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter<CustomAdapter.ViewHolder> mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new CustomAdapter(objectListList);
        mRecyclerView.setAdapter(mAdapter);
    }

}
