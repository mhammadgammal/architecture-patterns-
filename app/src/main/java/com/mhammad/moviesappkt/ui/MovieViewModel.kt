package com.mhammad.moviesappkt.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mhammad.moviesappkt.pojo.MovieModel

class MovieViewModel: ViewModel() {
    private var movieName = MutableLiveData<String>()
    fun getMovieName() : MutableLiveData<String>
    {
        movieName.value = getMovie().movieName
        return movieName
    }
    fun getMovie(): MovieModel{
        return MovieModel("CUKUR", 1, "17/9")
    }
}