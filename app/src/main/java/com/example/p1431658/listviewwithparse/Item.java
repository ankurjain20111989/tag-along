package com.example.p1431658.listviewwithparse;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by P1431658 on 23/1/2016.
 */
@ParseClassName("Item")
public class Item  extends ParseObject {
    public Item(){

    }
    public void setName(String name){
        put("name",name);
    }
    public String getLong(){
        return getString("long");
    }
    public String getLat(){
        return getString("lat");
    }
    public String getName(){
        return getString("name");
    }

}
