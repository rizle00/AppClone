package com.example.clone.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clone.R;
import com.example.clone.databinding.FragmentInstaBinding;

public class InstaFragment extends Fragment {

    FragmentInstaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInstaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}