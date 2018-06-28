package com.example.binlin.weatherapp.api_calls.dark_sky;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather implements Parcelable {
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;

    @SerializedName("currently")
    private CurrentWeather currentWeather;
    @SerializedName("daily")
    private DailyWeather dailyWeather;

    protected Weather(Parcel in) {
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Weather> CREATOR = new Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(latitude);
        parcel.writeDouble(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public DailyWeather getDailyWeather() {
        return dailyWeather;
    }

    public class CurrentWeather {
        @SerializedName("summary")
        private String summary;
        @SerializedName("icon")
        private String icon;
        @SerializedName("temperature")
        private double temperature;

        public String getSummary() {
            return summary;
        }

        public String getIcon() {
            return icon;
        }

        public double getTemperature() {
            return temperature;
        }
    }

    public class DailyWeather {
        @SerializedName("data")
        private List<DailyData> dailyDataList;

        public List<DailyData> getDailyDataList() {
            return dailyDataList;
        }

        public class DailyData {

            @SerializedName("temperatureHigh")
            private double tempHigh;
            @SerializedName("temperatureLow")
            private double tempLow;
            @SerializedName("precipProbability")
            private double precipChance;

            public double getTempHigh() {
                return tempHigh;
            }

            public double getTempLow() {
                return tempLow;
            }

            public double getPrecipChance() {
                return precipChance;
            }
        }
    }
}
