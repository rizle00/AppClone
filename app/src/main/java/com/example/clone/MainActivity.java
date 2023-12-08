package com.example.clone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.clone.databinding.ActivityMainBinding;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        //바텀 네비게이션에 이미지가 안보여서 처리해줌!!
        binding.bottomNav.setItemIconTintList(null);
        binding.topActionMenu1.setItemIconTintList(null);
        binding.topActionMenu2.setItemIconTintList(null);

        setContentView(binding.getRoot());
        ActionBar actionBar = getSupportActionBar();
    }
    }
