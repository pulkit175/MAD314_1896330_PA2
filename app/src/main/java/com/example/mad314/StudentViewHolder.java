package com.example.mad314;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    public TextView nameofStudent, IDofStudent;

    public StudentViewHolder(View itemView) {
        super(itemView);
        nameofStudent = itemView.findViewById(R.id.studentNameET);
        IDofStudent = itemView.findViewById(R.id.studentIdET);

    }

}

