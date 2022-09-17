package com.mhammad.movieapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mhammad.movieapp.pojo.MovieModel;

public class MovieViewModel extends ViewModel {
    public MutableLiveData<String> movieNameMLV = new MutableLiveData<>();
    public LiveData<String> getMovieName(){
        movieNameMLV.setValue(getMovieFromDB().movieName);
        return movieNameMLV;
    }

    private MovieModel getMovieFromDB()
    {
        return new MovieModel(1, "CUKUR", "17/9");
    }

}
