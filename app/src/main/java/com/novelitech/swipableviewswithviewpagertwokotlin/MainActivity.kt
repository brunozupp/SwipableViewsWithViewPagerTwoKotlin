package com.novelitech.swipableviewswithviewpagertwokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.novelitech.swipableviewswithviewpagertwokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val images = listOf(
            R.drawable.naruto1,
            R.drawable.naruto2,
            R.drawable.naruto3,
            R.drawable.naruto4,
            R.drawable.naruto5,
            R.drawable.naruto6,
        )

        val adapter = ViewPagerAdapter(images)

        binding.viewPager.adapter = adapter

        // Change the orientation from scrolling
        //binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        // Fake drag -> do the movement programmatically.
        binding.viewPager.beginFakeDrag()
        binding.viewPager.fakeDragBy(-10f)
        binding.viewPager.endFakeDrag()
    }
}