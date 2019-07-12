package com.example.helloworld;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class View_Top extends LinearLayout {

    private Button btn_back, btn_set;
    private TextView tv_title;

    public View_Top(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_top, this);
        btn_back = (Button) findViewById(R.id.bn_back);
        btn_set = (Button) findViewById(R.id.bn_set);
        tv_title = (TextView) findViewById(R.id.tv_title);

//        btn_back.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((Activity) getContext()).finish();
//            }
//        });
//
//        btn_set.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv_title.setText("设置标题");
//                Toast.makeText(getContext(), "设置成功", Toast.LENGTH_SHORT).show();
//            }
//        });
//

    }

    public void setOnclickBack(OnClickListener listener){
        btn_back.setOnClickListener(listener);
    }

    public void setTitle(String title){
        tv_title.setText(title);
    }

    public void setOnclicSet(OnClickListener listener){
        btn_set.setOnClickListener(listener);
    }


}
