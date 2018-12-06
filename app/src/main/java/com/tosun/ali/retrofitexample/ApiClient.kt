package com.tosun.ali.retrofitexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    val BASE_URL = "https://www.googleapis.com/youtube/v3/"
    var retrofit: Retrofit? = null



    val client: Retrofit?
        get() {
            if (retrofit == null) {

                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()


            }

            return retrofit
        }
}