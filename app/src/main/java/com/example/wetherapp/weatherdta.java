package com.example.wetherapp;

import org.json.JSONException;

public class weatherdta {

    private String mTemperature, micon,mcity, mileatherType;
    private int mCondition;

    public static weatherdta fromJson (JSONObject jsonObject)
    {
        try
        {

            weatherdta weatherrr= new weatherdta();
            weatherrr.mcity=jsonObject.getString("name");
            weatherrr.mCondition=jsonObject.getJSONAArray("weather").getJSONObject(0).getInt("id");
            weatherrr.mWeatherType=jsonObject.getJSONAArray("weather").getJSONObject(0).getInt("main");
            weatherrr.micon=updateWeatherIcon(weatherrr.mCondition);
            double tempResult=jsonObject.getJSONObject("main).getDouble"("temp")-274.14;
            int roundedValue=(int) Math.rint(tempResult);
            weatherrr.mTemperature=Integer.toString(roundedValue);
            return weatherrr;

        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }
    private static String updateWeatherIcon(int rule)
    {
        if (rule>=0 && rule<=300)
        {
            return "hulaga";

        }
        else if (rule>=300 && rule<=500)
        {
            return "smlrain";

        }
        else if (rule>=500 && rule<=600)
        {
            return "thundr";

        }
        else if (rule>=600 && rule<=700)
        {
            return "moon";

        }
        else if (rule>=701 && rule<=771)
        {
            return "cloud2";

        }
        else if (rule>=772 && rule<=800)
        {
            return " clouds";

        }
       else if (rule==800)
        {
            return "sunny";

        }
        if (rule>=801 && rule<=804)
        {
            return "cloudy";

        }
        if (rule>=900 && rule<=902)
        {
            return "hulaga";

        }
        if (rule>=903)
        {
            return "cloud";

        }
        if (rule>=904)
        {
            return "sunny";
        }
        if (rule>=905 && rule<=1000)
        {
            return "bigthunder";

        }
        return "none";




    }

    public String getmTemperature() {
        return mTemperature+"°C";
    }

    public String getMcity() {
        return mcity;
    }

    public String getMicon() {
        return micon;
    }

    public String getMileatherType() {
        return mileatherType;
    }
}
