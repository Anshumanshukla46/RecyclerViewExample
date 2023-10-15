package com.example.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list.add(new ContactModel(R.drawable.img1, "ABCD", "1223"));
        list.add(new ContactModel(R.drawable.img2, "AWQW", "2134"));
        list.add(new ContactModel(R.drawable.img3, "SDVA", "12246233"));
        list.add(new ContactModel(R.drawable.img4, "DSABA", "2463"));
        list.add(new ContactModel(R.drawable.img5, "FDSREGFA", "48612"));
        list.add(new ContactModel(R.drawable.img6, "EQWRWHRGA", "985869"));
        list.add(new ContactModel(R.drawable.img3, "SDVA", "12246233"));
        list.add(new ContactModel(R.drawable.img4, "DSABA", "2463"));
        list.add(new ContactModel(R.drawable.img5, "FDSREGFA", "48612"));
        list.add(new ContactModel(R.drawable.img3, "SDVA", "12246233"));
        list.add(new ContactModel(R.drawable.img4, "DSABA", "2463"));
        list.add(new ContactModel(R.drawable.img5, "FDSREGFA", "48612"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, list);
        recyclerView.setAdapter(adapter);

    }
}