package com.yournews.app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //Interface to get news from newsapi.org
    //Basically calling the API
    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey

    );


    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey

    );



}
