package com.example.retro.network;

import com.example.retro.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GeoDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
