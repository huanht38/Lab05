package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.LauncherActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Donut> listDonut;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDonut= findViewById(R.id.button);
        Button btnPinkDonut= findViewById(R.id.button2);
        Button btnFloating= findViewById(R.id.button3);
        listView=(ListView) findViewById(R.id.listView);
        listDonut= new ArrayList<>();
        listDonut.add(new Donut(1,"Tasty Donut","Spicy tasty donut family",20));
        listDonut.add(new Donut(2,"Pink Donut","Spicy tasty donut family",30));
        listDonut.add(new Donut(3,"Floating Donut","Spicy tasty donut family",15));
        listDonut.add(new Donut(4,"Tasty Donut","Spicy tasty donut family",20));
        DonutAdapter adapter = new DonutAdapter(this,R.layout.item, listDonut);
        listView.setAdapter(adapter);

        btnDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activeButton(btnDonut,btnPinkDonut,btnFloating);
            }
        });
        btnPinkDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activeButton(btnPinkDonut,btnDonut,btnFloating);
            }
        });
        btnFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activeButton(btnFloating,btnPinkDonut,btnDonut);
            }
        });
    }

    public void activeButton(Button btnActive, Button btn1, Button btn2){
        btnActive.setBackgroundColor(Color.parseColor("#F1B000"));
        btn1.setBackgroundColor(Color.parseColor("#D3D3D3"));
        btn2.setBackgroundColor(Color.parseColor("#D3D3D3"));
    }
}