package com.mhammad.movieapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mhammad.movieapp.R;
import com.mhammad.movieapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{
    MovieViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

    }




}