package com.example.p1431658.listviewwithparse;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

/**
 * Created by P1431658 on 24/1/2016.
 */
@ParseClassName("Posts")
public class PostGeo extends ParseObject {
    public ParseGeoPoint getLocation() {
        return getParseGeoPoint("location");
    }

    public void setLocation(ParseGeoPoint value) {
        put("location", value);
    }
}
