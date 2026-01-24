package com.bibek.mpassignment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Q3Activity extends AppCompatActivity {

    GridView gvFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q3);

        gvFruits = findViewById(R.id.gv_fruits);

        Integer[] images = {
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                R.drawable.img7,
                R.drawable.img8,
                R.drawable.img9,
                R.drawable.img10
        };

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(
                this,
                android.R.layout.simple_list_item_1,
                images
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                ImageView imageView;

                if (convertView == null) {
                    imageView = new ImageView(Q3Activity.this);
                    imageView.setLayoutParams(
                            new GridView.LayoutParams(
                                    ViewGroup.LayoutParams.MATCH_PARENT,
                                    350
                            )
                    );
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setPadding(8, 8, 8, 8);
                } else {
                    imageView = (ImageView) convertView;
                }

                imageView.setImageResource(images[position]);
                return imageView;
            }
        };

        gvFruits.setAdapter(adapter);
    }
}
