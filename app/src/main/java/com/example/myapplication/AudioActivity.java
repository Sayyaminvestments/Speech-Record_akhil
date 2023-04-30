package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class AudioActivity extends AppCompatActivity {

    public ImageButton myButton;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        {

            BottomNavigationView bottomNavigationView = findViewById(R.id.botoom_navigation);

            bottomNavigationView.setSelectedItemId(R.id.home);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.dashbord:
                            startActivities(new Intent[]{new Intent(getApplicationContext(), HomeActivity.class)});
                            overridePendingTransition(0,0);
                            return true;
                        case R.id.home:

                            return true;

                        case R.id.about:
                            startActivities(new Intent[]{new Intent(getApplicationContext(), LogoutActivity.class)});
                            overridePendingTransition(0,0);
                            return true;
                    }

                    return false;
                }
            });

        }

        recyclerView = findViewById(R.id.recyclerview_2);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        items.add("20221111-content2.wav");
        items.add("20221111-content3.wav");
        items.add("20221111-content4.wav");
        items.add("20221111-content5.wav");
        items.add("20221111-content6.wav");
        items.add("20221111-content7.wav");items.add("20221111-content8.wav");
        items.add("20221111-content9.wav");
        items.add("20221111-content10.wav");
        items.add("20221111-content11.wav");
        items.add("20221111-content12.wav");
        items.add("20221111-content13.wav");
        items.add("20221111-content14.wav");
        items.add("20221111-content15.wav");items.add("20221111-content16.wav");
        items.add("20221111-content217.wav");
        adapter = new myAdapter(items);
        recyclerView.setAdapter(adapter);
    }

}
class MyAdapter<myButton> extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> items;

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.text1);
        }
    }
    MyAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.audio_list, parent, false);

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



























