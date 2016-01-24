package com.example.p1431658.listviewwithparse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ParseGeoPoint point=new ParseGeoPoint(1.296726, 103.773224);//int
//        ParseObject Location=new ParseObject("Location");
//        Location.put("Location",point);
//        Location.saveInBackground();



//        ParseObject object = new ParseObject("Category");
//        object.put("CategoryName", "Close by");
//        object.saveInBackground();

//        List<String> arrayList = new ArrayList<>();
//        List<String> array1 = new ArrayList<>();
//        String value = "1.301043, 103.838502, (313@somerset)\n" +
//                "1.299500, 103.855703, (bugis +)\n" +
//
//        arrayList = Arrays.asList(value.split(","));
//        ParseObject object= new ParseObject("Item");
//        for(String a: arrayList){
//            int i=0;
//
//            a=a.replaceAll("\\p{P}","");
//
//
//            if(i==0){
//                object.put("Long",a);
//            }
//            else if(i==1){
//                object.put("Lat",a);
//            }
//            else if(i==2){
//                System.out.println(a);
//                object.put("Name",a);
//                object.put("parent",object.createWithoutData("Category","KPqzVkfuM4"));
//                object.saveInBackground();
//                i = 0;
//            }


  //      }

//        ParseObject object= new ParseObject("Item");
// //       object.put("a","a");
//        object.put("long","1.299500");
//        object.put("lat","103.855703");
//        object.put("name","bugis +");
//        object.put("parent",object.createWithoutData("Category","GNfbNAgMjC"));
//        object.saveInBackground();
        View btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i=new Intent(this,LeftRight.class);
                startActivity(i);
        }

    }
}
