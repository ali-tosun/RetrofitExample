package com.tosun.ali.retrofitexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.google.android.gms.common.api.Api
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    val channelId = "UCwsdTtR9Lwl1TpoY2vPgjNw"
    val key = "AIzaSyBvz_csZrz3PS8IlyfXN8m_pVP3R-Lm80w"

    var gelenVeri: PlaylistData? = null
    var tumPlayListItemler: List<PlaylistData.Items>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        var apiCall = apiInterface?.tumListeleriGetir(channelId, 45, key)

        apiCall?.enqueue(object : Callback<PlaylistData> {
            override fun onFailure(call: Call<PlaylistData>, t: Throwable) {

            }

            override fun onResponse(call: Call<PlaylistData>, response: Response<PlaylistData>) {


                gelenVeri = response.body()
                tumPlayListItemler = gelenVeri?.items

                supportActionBar!!.subtitle = "Tüm Oynatma Listeleri:" + tumPlayListItemler!!.size.toString()

                adapteriHazırla(tumPlayListItemler)


            }

        })

    }

    private fun adapteriHazırla(tumPlayListItemler: List<PlaylistData.Items>?) {

        var myAdapter = PlayListAdapter(tumPlayListItemler!!)

        rvPlayList.adapter = myAdapter
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvPlayList.layoutManager = layoutManager


    }


}
