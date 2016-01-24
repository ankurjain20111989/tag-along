package com.example.p1431658.listviewwithparse;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by P1431658 on 23/1/2016.
 */
@ParseClassName("Activity")
public class Activity extends ParseObject{
    public Activity(){

    }
    public void setName(String name){
        put("ActivityName",name);
    }
    public String getName(){
        return getString("ActivityName");
    }


}
