package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    public ImageButton myButton;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);{

            BottomNavigationView bottomNavigationView = findViewById(R.id.botoom_navigation);

            bottomNavigationView.setSelectedItemId(R.id.dashbord);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.dashbord:

                            return true;
                        case R.id.home:
                            startActivities(new Intent[]{new Intent(getApplicationContext(), AudioActivity.class)});
                            overridePendingTransition(0,0);
                            return true;

                        case R.id.about:
                            startActivities(new Intent[]{new Intent(getApplicationContext(), LogoutActivity.class)});
                            overridePendingTransition(0,0);
                            return true;
                    }

                    return false;
                }
            });

        /*    TextView myTextView = findViewById(R.id.text);
            myTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Do something when the TextView is clicked
                    startActivities(new Intent[]{new Intent(HomeActivity.this, ActivityRecord.class)});
                    overridePendingTransition(0,0);

                }
            });*/


        }


        recyclerView = findViewById(R.id.recyclerview_1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        items.add("Hello teacher.");
        items.add("Hello boss.");
        items.add("You are welcome.");
        items.add("You are welcome.");
        items.add("Nice day.");
        items.add("Good idea.");items.add("Run fast.");
        items.add("No, I don’t know.");
        items.add("Hello teacher.");
        items.add("Hello boss.");
        items.add("You are welcome.");
        items.add("You are welcome.");
        items.add("Nice day.");
        items.add("Good idea.");items.add("Run fast.");
        items.add("No, I don’t know.");
        adapter = new myAdapter(items);
        recyclerView.setAdapter(adapter);
    }

}


class myAdapter<myButton> extends RecyclerView.Adapter<myAdapter.MyViewHolder> {

    private ArrayList<String> items;

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.text);
        }
    }

    myAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.waiting_list, parent, false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    }






