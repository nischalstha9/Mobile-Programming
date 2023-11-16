package com.nischalstha9.lab16googlemap;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class main extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap mMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mF = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mF.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng location = new LatLng(27.7246874, 85.2962965);
        mMap.addMarker(new MarkerOptions().position(location)).setTitle("My Location");
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12.0f));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12.0f));
    }
}
