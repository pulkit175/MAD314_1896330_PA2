package com.example.mad314;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {
    private LayoutInflater mInflater;
    private String[] mData = new ArrayList<>().toArray(new String[0]);
    public MyAdapter(Context context)
    {
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_main2, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        List<Student> animals = StudentRepository.getInstance().getAnimals();

        // set attributes to the item
        holder.name.setText(students.get(position).name);
        holder.id.setText(students.get(position).id);

    }

    @Override
    public int getItemCount() {
        return StudentRepository.getInstance().getAnimals().size();
    }
}
