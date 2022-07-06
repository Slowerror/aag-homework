package com.bignerdranch.android.aag_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.aag_homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.layout_container, FragmentMoviesList())
                .commit()
        }
    }

}