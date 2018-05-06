package `in`.blogspot.kmvignesh.googlemapexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {


    lateinit var mapFragment : SupportMapFragment
    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it
            googleMap.isMyLocationEnabled = true
            val location1 = LatLng(31.415137, 51.568327)
            googleMap.addMarker(MarkerOptions().position(location1).title("مکان من"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,9f))

//            val location2 = LatLng(9.89,78.11)
//            googleMap.addMarker(MarkerOptions().position(location2).title("مکان دوم"))
//
//
//            val location3 = LatLng(13.00,77.00)
//            googleMap.addMarker(MarkerOptions().position(location3).title("مکان سوم"))

        })
    }
}
