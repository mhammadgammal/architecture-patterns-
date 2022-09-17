package com.mhammad.moviesappkt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.mhammad.moviesappkt.R
import com.mhammad.moviesappkt.databinding.ActivityMainBinding
import com.mhammad.moviesappkt.pojo.MovieModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel: MovieViewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        viewModel.getMovieName().observe(this, Observer {
            binding.movieNameTV.text = it
        })
        binding.getMovieBTN.setOnClickListener(View.OnClickListener {
            viewModel.getMovieName()
        })
    }
}