package com.example.insigame.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;


public interface ApiInterface {

     @POST("Read.php")
    Call<List<Contact>> getContacts();

}
