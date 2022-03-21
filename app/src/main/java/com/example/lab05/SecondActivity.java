package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle= getIntent().getExtras();
        int id = bundle.getInt("id", 1);
        String name = bundle.getString("name", "test1");
        String detail = bundle.getString("detail", "test1");
        String price = bundle.getString("price", "test1");
        TextView tv_name= (TextView) findViewById(R.id.textView_name);
        TextView tv_detail= (TextView) findViewById(R.id.textView_detail);
        TextView tv_price= (TextView) findViewById(R.id.textView_price);
        ImageView img=  (ImageView) findViewById(R.id.imageDonut);


        tv_name.setText(name);
        tv_detail.setText(detail);
        tv_price.setText(price);
        switch (id){
            case 1:
                img.setImageResource(R.drawable.donut_yellow1);
                break;
            case 2:
                img.setImageResource(R.drawable.green_donut1);
                break;
            case 3:
                img.setImageResource(R.drawable.donut_red1);
                break;
            case 4:
                img.setImageResource(R.drawable.tasty_donut1);
                break;
            default: break;

        }

        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                finish();
            }
        });

    }
}