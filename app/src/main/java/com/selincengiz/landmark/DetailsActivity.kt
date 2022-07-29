package com.selincengiz.landmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.selincengiz.landmark.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent=intent
val landmark =intent.getSerializableExtra("landmark") as Landmark
         binding.textView.text=landmark.name
        binding.textView2.text=landmark.country
        binding.imageView.setImageResource(landmark.image)

    }
}