package com.example.bruno.pi

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EventWebClient {

    fun list(eventResponse: EventResponse<List<Event>>){
        val call = RetrofitInitializer().eventService().list()
        call.enqueue(object: Callback<List<Event>?> {
            override fun onResponse(call: Call<List<Event>?>, response: Response<List<Event>?>) {
                response?.body()?.let {
                    val events: List<Event> = it
                    eventResponse.success(events)
                }
            }
            override fun onFailure(call: Call<List<Event>?>, t: Throwable) {
                Log.e("error:", t?.message)
            }
        })
    }

}