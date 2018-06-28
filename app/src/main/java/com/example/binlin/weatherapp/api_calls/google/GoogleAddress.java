package com.example.binlin.weatherapp.api_calls.google;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GoogleAddress {

    @SerializedName("results")
    private List<Results> resultsList;

    public List<Results> getResultsList() {
        return resultsList;
    }

    public class Results {
        @SerializedName("formatted_address")
        private String formattedAddressName;
        @SerializedName("geometry")
        private Geometry placeGeometry;

        public String getFormattedAddressName() {
            return formattedAddressName;
        }

        public Geometry getPlaceGeometry() {
            return placeGeometry;
        }

        public class Geometry {

            @SerializedName("location")
            private GoogleLocation locationInfo;

            public GoogleLocation getLocationInfo() {
                return locationInfo;
            }


            public class GoogleLocation {
                @SerializedName("lat")
                private double latitude;
                @SerializedName("lng")
                private double longitude;

                public double getLatitude() {
                    return latitude;
                }

                public double getLongitude() {
                    return longitude;
                }
            }
        }
    }

}
