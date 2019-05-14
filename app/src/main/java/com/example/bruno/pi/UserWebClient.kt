package com.example.bruno.pi

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserWebClient {

    fun list(userResponse: UserResponse<List<User>>){
        val call = RetrofitInitializer().userService().list()
        call.enqueue(object: Callback<List<User>?> {
            override fun onResponse(call: Call<List<User>?>, response: Response<List<User>?>) {
                response?.body()?.let {
                    val users: List<User> = it
                    userResponse.success(users)
                }
            }
            override fun onFailure(call: Call<List<User>?>, t: Throwable) {
                Log.e("error:", t?.message)
            }
        })
    }

}