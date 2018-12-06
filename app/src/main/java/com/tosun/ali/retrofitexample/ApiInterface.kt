package com.tosun.ali.retrofitexample

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    // GET https://www.googleapis.com/youtube/v3/playlists?part=snippet&channelId=UCwsdTtR9Lwl1TpoY2vPgjNw&maxResults=25&key={YOUR_API_KEY}

    @GET("playlists?part=snippet")
    fun tumListeleriGetir(@Query("channelId") channelId: String, @Query("maxResults") limit:Int, @Query("key") key: String): Call<PlaylistData>

}