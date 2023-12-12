package com.example.clone.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clone.databinding.ItemTopBannerRecvBinding;

public class MainTopBanAdt extends RecyclerView.Adapter<MainTopBanAdt.ViewHolder> {
    private int[] list;
    private MainFragment fragment;

    public MainTopBanAdt(int[] list, MainFragment fragment) {
        this.list = list;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTopBannerRecvBinding binding =
                ItemTopBannerRecvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        int idx = i% list.length;
        h.binding.imgvTopBanner.setImageResource(list[idx]);
        h.binding.tvTopBanner.setText((idx+1)+"");
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemTopBannerRecvBinding binding;
        public ViewHolder(@NonNull ItemTopBannerRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
