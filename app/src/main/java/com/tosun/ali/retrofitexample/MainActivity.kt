package com.tosun.ali.retrofitexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.common.api.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    val channelId="UCwsdTtR9Lwl1TpoY2vPgjNw"
    val key ="AIzaSyBvz_csZrz3PS8IlyfXN8m_pVP3R-Lm80w"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        var apiCall = apiInterface?.tumListeleriGetir(channelId,45,key)

        apiCall?.enqueue(object : Callback<PlaylistData>{
            override fun onFailure(call: Call<PlaylistData>, t: Throwable) {

            }

            override fun onResponse(call: Call<PlaylistData>, response: Response<PlaylistData>) {
                Log.e("apiDeneme",call.request().url().toString())

                for(i in 0..response.body()?.items?.size!!-1){
                    Log.e("apiDeneme",""+response.body()?.items?.get(i)?.snippet?.title)
                }


            }

        })

    }
}
