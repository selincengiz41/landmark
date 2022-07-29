package com.selincengiz.landmark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.selincengiz.landmark.databinding.ActivityDetailsBinding
import com.selincengiz.landmark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmark: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmark= ArrayList<Landmark>()
        val eyfel=Landmark("Eyfel Kulesi","Fransa",R.drawable.eyfel)
        val cinSeddi=Landmark("Cin Seddi","Cin",R.drawable.cinseddi)

        landmark.add(eyfel)
        landmark.add(cinSeddi)

 binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter =Adapter(landmark)
        binding.recyclerView.adapter=adapter


    }
}