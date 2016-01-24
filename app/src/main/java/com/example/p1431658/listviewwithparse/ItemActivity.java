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
import java.util.Random;

/**
 * Created by P1431658 on 23/1/2016.
 */
public class ItemActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private ItemAdapter mAdapter;
    private Item clickedActivity;
    private String Id;
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.itemlist);

        ParseObject.registerSubclass(Item.class);

        mListView=(ListView)findViewById(R.id.listItem);
        mListView.setOnItemClickListener(this);
//        mListView.setOnClickListener(this);

        mAdapter=new ItemAdapter(this,new ArrayList<Item>());
        mListView.setAdapter(mAdapter);

        updateData();
        Bundle extras=getIntent().getExtras();
        Id=extras.getString("ID");


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
        Category category=new Category();
        category.setObjectId(Id);

        ParseQuery<Item> query=ParseQuery.getQuery(Item.class);
        query.setCachePolicy(ParseQuery.CachePolicy.CACHE_THEN_NETWORK);
        query.whereEqualTo("parent",category);
        query.findInBackground(new FindCallback<Item>() {//cache
            @Override
            public void done(List<Item> objects, ParseException e) {
                if (objects != null) {
                    int[]random = new int[3];
                    if(objects.size()<3){

                    }
                    else{

                        for(int i=0;i<random.length;i++){
                            Random rand=new Random();
                            int randomNum=rand.nextInt((objects.size()-3))+3;
                            random[i]=randomNum;

                        }

                    }

                    mAdapter.clear();
                    mAdapter.addAll(objects);
                }
            }
        });
    }

    //this onclick for listview items
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item item = mAdapter.getItem(position);
        redirectToMainActivity(item.getLong(),item.getLat());

    }


    public void redirectToMainActivity(String longs,String lat){
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("long", longs);
        i.putExtra("lat", lat);
        startActivity(i);
    }



}
