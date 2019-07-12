package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {

    private List<DATA> emojjList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        initEmojj();
        EmojjAdapter adapter = new EmojjAdapter(
                ListviewActivity.this, R.layout.expression_item,emojjList
        );
        ListView listView = ((ListView) findViewById(R.id.list_view));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                DATA emojj = emojjList.get(position);
                Toast.makeText(ListviewActivity.this, emojj.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initEmojj(){
        DATA momo = new DATA("摸摸", R.drawable.momo);
        emojjList.add(momo);
        DATA call = new DATA("打call", R.drawable.call);
        emojjList.add(call);
        DATA cool = new DATA("帅", R.drawable.cool);
        emojjList.add(cool);
        DATA drink = new DATA("喝可乐", R.drawable.drink);
        emojjList.add(drink);
        DATA fly = new DATA("飞", R.drawable.fly);
        emojjList.add(fly);
        DATA jump = new DATA("跳", R.drawable.jump);
        emojjList.add(jump);
        DATA unknown = new DATA("不知所措", R.drawable.unknown);
        emojjList.add(unknown);
        DATA wow = new DATA("哇", R.drawable.wow);
        emojjList.add(wow);
        DATA zb = new DATA("大佬", R.drawable.zb);
        emojjList.add(zb);

    }
}
