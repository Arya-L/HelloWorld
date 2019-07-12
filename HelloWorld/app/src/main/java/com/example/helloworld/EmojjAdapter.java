package com.example.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EmojjAdapter extends ArrayAdapter<DATA> {

    private int resourceId;

    public EmojjAdapter(Context context, int textViewResourceId, List<DATA> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        DATA emojj = getItem(position);
//        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        View view;
        ViewHolder viewHolder;

        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.emojjImag = (ImageView) view.findViewById(R.id.emojj_img);
            viewHolder.emojjName = (TextView) view.findViewById(R.id.emojj_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.emojjImag.setImageResource(emojj.getImageId());
        viewHolder.emojjName.setText(emojj.getName());

//        ImageView emojjImag = (ImageView) view.findViewById(R.id.emojj_img);
//        TextView emojjName = (TextView) view.findViewById(R.id.emojj_name);
//        emojjImag.setImageResource(emojj.getImageId());
//        emojjName.setText(emojj.getName());

        return view;
    }

    class ViewHolder{
        ImageView emojjImag;
        TextView emojjName;
    }

}