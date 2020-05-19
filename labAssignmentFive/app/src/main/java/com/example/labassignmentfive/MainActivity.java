package com.example.labassignmentfive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.labassignmentfive.Course;

public class MainActivity extends AppCompatActivity {

    ArrayList<Course> courses= new ArrayList<>();
    public RecyclerViewAdapter recyclerViewAdapter;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.courseList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(this, courses);
        recyclerView.setAdapter(recyclerViewAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);

        Call<List<Course>> call = service.getCourses("clist");

        call.enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {
                courses = (ArrayList) response.body();
                recyclerViewAdapter.setCourses(courses);
                recyclerViewAdapter.notifyDataSetChanged();
                Log.e("Data Change", "onResponse: "+courses.size());

            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
            }
        });
    }
}
