package com.fenglei.weather.network.model


class WeatherResponse : JsonBean {

    var data: Data? = null
    var status: Int? = null
    var desc: String? = null


    class Data : JsonBean {
        var yesterday: Yesterday? = null
        var city: String? = null
        var aqi: String? = null
        var forecast: List<Forecast>? = null
        var ganmao: String? = null
        var wendu: String? = null

    }

    class Forecast : JsonBean {
        var date: String? = null
        var high: String? = null
        var fengli: String? = null
        var low: String? = null
        var fengxiang: String? = null
        var type: String? = null
    }

    class Yesterday : JsonBean {
        var date: String? = null
        var high: String? = null
        var fx: String? = null
        var low: String? = null
        var fl: String? = null
        var type: String? = null
    }


}