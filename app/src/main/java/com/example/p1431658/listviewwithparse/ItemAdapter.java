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


public class ItemAdapter extends ArrayAdapter<Item>{

    private Context mContext;
    private List<Item> mItem;

    public ItemAdapter(Context context,List<Item> objects) {
        super(context, R.layout.item_row,objects);
        this.mContext=context;
        this.mItem=objects;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        if(convertView==null){//inflator= nested view
            LayoutInflater mLayoutInflater=LayoutInflater.from(mContext);
            convertView=mLayoutInflater.inflate(R.layout.item_row,null);
        }
        Item item=mItem.get(position);
        TextView roomNameView=(TextView) convertView.findViewById(R.id.item_name);
        roomNameView.setText(item.getName());

        return convertView;
    }
}
