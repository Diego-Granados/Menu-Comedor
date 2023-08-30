package com.example.horario;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.horario.databinding.ActivityMapsBinding;

import java.util.HashMap;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private ActivityMapsBinding binding;

    private HashMap<String, double[]> direcciones;
    private String restaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        restaurante = getIntent().getStringExtra("restaurante");
        direcciones = new HashMap<>();
        direcciones.put("Restaurante Institucional", new double[] {9.8553526,-83.912867});
        direcciones.put("Soda La Deportiva", new double[] {9.857415682570958, -83.91084224659505});
        direcciones.put("La Casita Forestal", new double[] {9.84958940232456, -83.91035123939892});
        direcciones.put("Comedor Estudiantil", new double[] {9.853975673670872, -83.90705014697787});
        direcciones.put("Soda El Lago", new double[] {9.854265010392519, -83.9103735041922});

     binding = ActivityMapsBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        double[] coordinates = direcciones.get(restaurante);
        LatLng restMarker = new LatLng(coordinates[0], coordinates[1]);
        mMap.addMarker(new MarkerOptions().position(restMarker).title(restaurante));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(restMarker));
    }
}