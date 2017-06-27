package com.fenglei.weather.network;

import com.fenglei.weather.network.api.WeatherApi;
import com.fenglei.weather.network.model.WeatherResponse;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;


/**
 * Created by jifenglei on 17-6-27.
 */
public class WeatherHelper {

    private WeatherApi mQueryApi;

    public static WeatherHelper getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static WeatherHelper INSTANCE = new WeatherHelper();
    }

    private WeatherHelper () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(" http://wthrcdn.etouch.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        mQueryApi = retrofit.create(WeatherApi.class);
    }

    public Observable<WeatherResponse> getWeather(String city) {
        return mQueryApi.getWeather(city);
    }


}
