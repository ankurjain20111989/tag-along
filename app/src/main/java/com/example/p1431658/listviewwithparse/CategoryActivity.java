package com.example.p1431658.listviewwithparse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by P1431658 on 23/1/2016.
 */

public class CategoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {//implements AdapterView.OnClickListener, View.OnClickListener{

    private ListView mListView;
    private CategoryAdapter mAdapter;
    private Category clickedActivity;
    private String id;

    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.categorylist);

        ParseObject.registerSubclass(Category.class);

        mListView=(ListView)findViewById(R.id.listCat);
//        mListView.setOnClickListener(this);

        mListView.setOnItemClickListener(this);

        mAdapter=new CategoryAdapter(this,new ArrayList<Category>());
        mListView.setAdapter(mAdapter);

        updateData();

    }


    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),
                "On Resume",
                Toast.LENGTH_LONG).show();
        updateData();

    }

    public void updateData(){
        ParseQuery<Category> query=ParseQuery.getQuery(Category.class);
        query.setCachePolicy(ParseQuery.CachePolicy.CACHE_THEN_NETWORK);

        query.findInBackground(new FindCallback<Category>() {//cache
            @Override
            public void done(List<Category> objects, ParseException e) {
                if (objects != null) {
                    mAdapter.clear();
                    mAdapter.addAll(objects);
                }
            }
        });
    }

    //this onclick for listview items
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Category category = mAdapter.getItem(position);
        String roomId=category.getObjectId();
        redirectToNextActivity(roomId);

    }


    public void redirectToNextActivity(String id){
        Intent i=new Intent(this,ItemActivity.class);
        i.putExtra("ID", id);
        startActivity(i);
    }

}
