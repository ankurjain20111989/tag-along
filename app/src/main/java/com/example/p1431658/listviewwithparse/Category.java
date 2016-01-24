package com.example.p1431658.listviewwithparse;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by P1431658 on 23/1/2016.
 */
@ParseClassName("Category")
public class Category extends ParseObject{
    public Category(){

    }

    public void setName(String name){
        put("CategoryName",name);
    }
    public String getName(){
        return getString("CategoryName");
    }

}
