package com.sunnyweather.android.logic.model

//天气类,封装Realtime和Daily对象

class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)