package com.example.bruno.pi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("activity: ", "entrando na acitvity")

        UserWebClient(). list(object: UserResponse<List<User>>{
            override fun success(response: List<User>) {
                Log.i("Dados: ", "dadosrecuperados")
                for (user in response){
                    Log.i("user: ", user.name + " - " + user.email)
                }
            }
        })

    }
}
