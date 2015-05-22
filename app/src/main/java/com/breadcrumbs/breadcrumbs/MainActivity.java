package com.breadcrumbs.breadcrumbs;

import android.app.Dialog;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.gimbal.android.Gimbal;
import com.gimbal.android.PlaceManager;
import com.gimbal.android.PlaceEventListener;
import com.gimbal.android.Place;
import com.gimbal.android.Visit;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends FragmentActivity {

    double lat = 41.838703;
    double lon = -87.627349;
    double lat1 = 41.838674;
    double lon1 = -87.627737;
    double lat2 = 41.838674;
    double lon2 = -87.627337;
    Marker mr1;
    Marker mr2;

    private PlaceEventListener placeEventListener;
 MapsActivity mpa;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


if(isokchk()) {
   setContentView(R.layout.activity_maps);

    if(initmap())
    {


        //SystemClock.sleep(10000);
        //Delay(5);
        loc(lat, lon);
        
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        loc1(lat1, lon1);
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }




        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for( int i =0 ; i < 1000000 ; i++)
        {
            for(  i =0 ; i < 1000000 ; i++)
            {
                for(  i =0 ; i < 1000000 ; i++)
                {
                    for(  i =0 ; i < 1000000 ; i++)
                    {
                        for(  i =0 ; i < 1000000 ; i++)
                        {
                            for(  i =0 ; i < 1000000 ; i++)
                            {
                                for(  i =0 ; i < 1000000 ; i++)
                                {
                                    for(  i =0 ; i < 1000000 ; i++)
                                    {
                                        for(  i =0 ; i < 1000000 ; i++)
                                        {
                                            for(  i =0 ; i < 1000000 ; i++)
                                            {
                                                for(  i =0 ; i < 1000000 ; i++)
                                                {
                                                    for(  i =0 ; i < 1000000 ; i++)
                                                    {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        loc2(lat2, lon2);
        //loc(lat,lon);




    }
  //
}
        else
    setContentView(R.layout.activity_main);
       // Gimbal.setApiKey(this.getApplication(), "bfaab116-88c2-41e0-bb83-5bc0824d55fb");
        //placeEventListener = new PlaceEventListener() {
           // @Override
          //  public void onVisitStart(Visit visit) {
                // This will be invoked when a place is entered. Example below shows a simple log upon enter
             ///   Log.i("Info:", "Enter: " + visit.getPlace().getName() + ", at: " + new Date(visit.getArrivalTimeInMillis()));
            //}

            //@Override
            //public void onVisitEnd(Visit visit) {
                // This will be invoked when a place is exited. Example below shows a simple log upon exit
              //  Log.i("Info:", "Exit: " + visit.getPlace().getName() + ", at: " + new Date(visit.getDepartureTimeInMillis()));
            //}
        };
        //PlaceManager.getInstance().addListener(placeEventListener);


       //     String display = Gimbal.getApplicationInstanceIdentifier();
         //   Toast.makeText(this,display,Toast.LENGTH_LONG).show();






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean isokchk()
    {
      int isavail = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if(isavail == ConnectionResult.SUCCESS)
        {
            return true;
        }else if(GooglePlayServicesUtil.isUserRecoverableError(isavail))
        {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(isavail,this,1000);
            dialog.show();


        }else
        {
            Toast.makeText(this,"unable to connect", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;
    }
     public boolean initmap()
     {
         if(map == null)
         {
          SupportMapFragment supportMapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
             map = supportMapFragment.getMap();
         }
         return (map != null);
     }

    public void loc(double lat, double lon)
    {
        float zoom = 20;
        LatLng latLng = new LatLng(lat,lon);
        CameraUpdate cupd = CameraUpdateFactory.newLatLngZoom(latLng, zoom);
        map.moveCamera(cupd);
        Toast.makeText(this,"Searching for beacons ",Toast.LENGTH_LONG).show();
    }
    public void loc1(double lt1,double lon1)
    {

        MarkerOptions markerOptions = new MarkerOptions()
                .title("loc1")
                .visible(true)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .position(new LatLng(lt1, lon1));


         mr1= map.addMarker(markerOptions);
        Toast.makeText(this,"location 1 found",Toast.LENGTH_LONG).show();

    }
    public void loc2(double lt1,double lon1)
    {

        MarkerOptions markerOptions = new MarkerOptions()
                .title("loc1")
                .visible(true)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .position(new LatLng(lt1, lon1));


        mr2 = map.addMarker(markerOptions);
        Toast.makeText(this,"location 2 found",Toast.LENGTH_LONG).show();
        PolylineOptions polylineOptions = new PolylineOptions()
                .add(mr1.getPosition())
                .add(mr2.getPosition());

        map.addPolyline(polylineOptions);

    }
    void Delay(int Seconds)
    {
        long Time = 0;
        Time = System.currentTimeMillis();
        while(System.currentTimeMillis() < Time+(Seconds*1000));
    }

}
