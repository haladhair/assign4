package com.haladhair.assignment4hala;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements MainFragment.OnFragmentInteractionListener,FragmentMap.OnFragmentInteractionListener,FragmentPicture.OnFragmentInteractionListener
        {static FragmentManager fm;static FragmentTransaction ft;

            private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment Main= new MainFragment();

        // get fragment manager
        fm = getSupportFragmentManager();

// add
        ft = fm.beginTransaction();
        ft.add(R.id.container, Main);

        ft.commit();
    }
            @Override
            public void onFragmentInteraction(Uri uri) {

            }

            public static void startMapFragment(){
                FragmentMap  mapFragment= new  FragmentMap();

                ft = fm.beginTransaction();
                ft.replace(R.id.container, mapFragment);
                ft.commit();
            }

            public static void startPICFragment(){
                FragmentPicture   picFragment= new FragmentPicture();

                ft = fm.beginTransaction();
                ft.replace(R.id.container, picFragment);
                ft.commit();
            }


            public static void startmainFragment(){
                MainFragment    mainFragment= new MainFragment();

                ft = fm.beginTransaction();
                ft.replace(R.id.container, mainFragment);
                ft.commit();
            }
        }