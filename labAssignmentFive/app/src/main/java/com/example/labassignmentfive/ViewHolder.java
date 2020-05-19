package com.example.labassignmentfive;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.labassignmentfive.Course;

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

}
