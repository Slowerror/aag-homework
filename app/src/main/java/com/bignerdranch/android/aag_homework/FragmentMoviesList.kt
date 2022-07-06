package com.bignerdranch.android.aag_homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.aag_homework.databinding.FragmentMoviesListBinding

class FragmentMoviesList: Fragment() {

    private lateinit var binding: FragmentMoviesListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesListBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.movieCard.setOnClickListener { launchFragmentMovieDetails() }
    }

    private fun launchFragmentMovieDetails() {
        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.layout_container, FragmentMoviesDetails())
            .commit()
    }
}