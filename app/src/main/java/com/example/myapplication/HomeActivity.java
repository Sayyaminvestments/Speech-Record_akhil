package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

            ImageButton ImageButton = findViewById(R.id.tab_image);
            ImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, LogoutActivity.class);
                    startActivity(intent);
                }
            });





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


        adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);


    }





}



class MyAdapter<myButton> extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> items;

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.text);
        }
    }

    MyAdapter(ArrayList<String> items) {
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






