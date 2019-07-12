package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//public class Textview extends AppCompatActivity implements View.OnClickListener {
public class Textview extends AppCompatActivity{
    private EditText editText;
    private ImageView imageV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        Button button = (Button) findViewById(R.id.btn_2);
        editText = (EditText) findViewById(R.id.et_1);
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String inputText = editText.getText().toString();
                  Toast.makeText(Textview.this ,inputText,Toast.LENGTH_SHORT).show();
                  }
              });

        Button button_img = (Button) findViewById(R.id.btn3);
        imageV = (ImageView) findViewById(R.id.img_1);
        button_img.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view){
                imageV.setImageResource(R.drawable.img_2);
             }
         });
    }

//    @Override
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.btn_2:
//                String inputText = editText.getText().toString();
//                Toast.makeText(Textview.this,inputText,Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                break;
//        }

//    }

}
