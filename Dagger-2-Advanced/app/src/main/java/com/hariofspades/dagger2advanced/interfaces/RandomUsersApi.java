package com.hariofspades.dagger2advanced.interfaces;

import com.hariofspades.dagger2advanced.model.RandomUsers;
import com.hariofspades.dagger2advanced.models.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Hari on 20/11/17.
 */

public interface RandomUsersApi {
    @GET("api/?inc=gender,name,picture")
    Call<Response> getRandomUsers(@Query("results") int size);
}