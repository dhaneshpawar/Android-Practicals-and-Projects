package com.example.labassignmentfive;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.labassignmentfive.Course;

public interface APIService {
    @GET("course")
    Call<Course> getCourse(@Query("action")String action,
                          @Query("cid")String cid);
    @GET("course")
    Call<List<Course>> getCourses(@Query("action")String action);
}
