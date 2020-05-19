package com.example.labassignmentfive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import com.example.labassignmentfive.Course;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<Course> courses;

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

    public RecyclerViewAdapter(Context context, ArrayList<Course> courses) {
    this.context = context;
    this.courses = courses;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position){
        holder.bind(position);
    }

    public int getItemCount() { return courses.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView cname;
        public TextView abbr;
        public TextView code;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            cname = itemView.findViewById(R.id.courseName);
            abbr = itemView.findViewById(R.id.courseAbbr);
            code = itemView.findViewById(R.id.courseCode);

        }

        public void bind(int pos)
        {
            Course c = courses.get(pos);
            cname.setText(c.cname);
            abbr.setText(c.abbr);
            code.setText(c.cid);
        }

    }
}
