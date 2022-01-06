package uas.rifaldo.cafeapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uas.rifaldo.cafeapp.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Detail Menu");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Food> list = FoodData.getData(getApplicationContext());
        Food food = list.get(id);

        if (food != null) {
            TextView judul = findViewById(R.id.detail_judul);
            TextView deskripsi = findViewById(R.id.detail_deskripsi);
            ImageView image = findViewById(R.id.detail_photo);

            image.setImageDrawable(food.image);
            judul.setText(food.judul);
            deskripsi.setText(food.deskripsi);
        }
    }
}