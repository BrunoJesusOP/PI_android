package com.example.bruno.pi

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EventsWebClient {

    fun list(eventsResponse: EventsResponse<List<Events>>){
        val call = RetrofitInitializer().eventsService().list()
        call.enqueue(object: Callback<List<Events>?> {
            override fun onResponse(call: Call<List<Events>?>, response: Response<List<Events>?>) {
                response?.body()?.let {
                    val eventos: List<Events> = it
                    eventsResponse.success(eventos)
                }
            }
            override fun onFailure(call: Call<List<Events>?>, t: Throwable) {
                Log.e("error:", t?.message)
            }
        })
    }

}