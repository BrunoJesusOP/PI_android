package com.example.bruno.pi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer{

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.88.245:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

       fun userService() = retrofit.create(UserService::class.java)
       fun eventService() = retrofit.create(EventService::class.java)

}