package com.example.lab05;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private int idImage;
    private List<Donut> listDonut;
    private int positionSelect=-1;

    public DonutAdapter(Context context, int idImage, List<Donut> listDonut) {
        this.context = context;
        this.idImage = idImage;
        this.listDonut = listDonut;
    }

    @Override
    public int getCount() {
        if(listDonut.size()!=0 && !listDonut.isEmpty())
            return listDonut.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if(convertView==null)
            convertView= LayoutInflater.from(parent.getContext()).inflate(idImage,parent,false);

        TextView tvName= (TextView) convertView.findViewById(R.id.textView_Name);
        TextView tvDetail= (TextView) convertView.findViewById(R.id.textView_Detail);
        TextView tvPrice= (TextView) convertView.findViewById(R.id.textView_Price);
        ImageView imageView= (ImageView)  convertView.findViewById(R.id.imageView);

        final ConstraintLayout constraintLayout= (ConstraintLayout) convertView.findViewById(R.id.constraintlayout);
        final Donut donut = listDonut.get(position);

        if(listDonut!=null && !listDonut.isEmpty()){
            tvName.setText(donut.getName());
            tvDetail.setText(donut.getDetail());
            tvPrice.setText("$"+donut.getPrice());
            int idImage= donut.getId();
            switch (idImage){
                case 1: imageView.setImageResource(R.drawable.donut_yellow1);
                break;

                case 2: imageView.setImageResource(R.drawable.green_donut1);
                    break;

                case 3: imageView.setImageResource(R.drawable.donut_red1);
                    break;

                case 4: imageView.setImageResource(R.drawable.tasty_donut1);
                    break;
            }
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", donut.getId());
                bundle.putString("name", donut.getName());
                bundle.putString("detail", donut.getDetail());
                bundle.putString("price", donut.getPrice()+"$");
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });




        return convertView;
    }
}
