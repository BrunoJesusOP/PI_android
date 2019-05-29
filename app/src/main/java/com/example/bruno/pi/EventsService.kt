package com.example.bruno.pi

import retrofit2.Call
import retrofit2.http.*

interface EventsService {
    @GET("events")
    fun list(): Call<List<User>>

}