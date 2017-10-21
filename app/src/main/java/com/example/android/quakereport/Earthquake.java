package com.example.android.quakereport;

/**
 * Created by gagan on 21/10/17.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String Magnitude, String Location, String Date) {
        mMagnitude=Magnitude;
        mLocation=Location;
        mDate=Date;
    }
    public String getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public String getDate(){return mDate;}
}
