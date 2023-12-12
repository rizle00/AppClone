package com.example.clone.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clone.R;
import com.example.clone.databinding.FragmentYoutubeBinding;

public class YoutubeFragment extends Fragment {

    FragmentYoutubeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainDAO dao = new MainDAO();
        binding = FragmentYoutubeBinding.inflate(inflater, container, false);
        binding.recvYoutube.setAdapter(new YoutubeAdt(dao.getYouList()));
        binding.recvYoutube.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
        return binding.getRoot();
    }
}