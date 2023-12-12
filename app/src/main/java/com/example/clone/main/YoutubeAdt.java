package com.example.clone.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clone.databinding.ItemTopBannerRecvBinding;
import com.example.clone.databinding.ItemYoutubeRecvBinding;

import java.util.ArrayList;

public class YoutubeAdt extends RecyclerView.Adapter<YoutubeAdt.ViewHolder> {
    private ArrayList<MainDTOs.YoutubeDTO> list;

    public YoutubeAdt(ArrayList<MainDTOs.YoutubeDTO> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemYoutubeRecvBinding binding =
                ItemYoutubeRecvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.imgvYoutube.setImageResource(list.get(i).getThumnailRes());
        h.binding.imgvYoutubeText.setImageResource(list.get(i).getTextRes());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemYoutubeRecvBinding binding;
        public ViewHolder(@NonNull ItemYoutubeRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
