package com.fenglei.weather.network.api

import com.fenglei.weather.network.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


interface WeatherApi {
    @GET("weather_mini")
    fun getWeather(@Query("city") city: String): Observable<WeatherResponse>
}

