package com.example.p1431658.listviewwithparse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by P1431658 on 23/1/2016.
 */
public class ActivityAdapter extends ArrayAdapter<Activity>{

    private Context mContext;
    private List<Activity> mActivity;

    public ActivityAdapter(Context context, List<Activity> object) {
        super(context, R.layout.activity_row,object);
        this.mContext=context;
        this.mActivity=object;
    }
    public View getView(int position,View convertView,ViewGroup parent){
        if(convertView==null){//inflator= nested view
            LayoutInflater mLayoutInflater=LayoutInflater.from(mContext);
            convertView=mLayoutInflater.inflate(R.layout.activity_row,null);
        }
        Activity activity=mActivity.get(position);
        TextView roomNameView=(TextView) convertView.findViewById(R.id.activity_name);
        roomNameView.setText(activity.getName());

        return convertView;
    }



}
