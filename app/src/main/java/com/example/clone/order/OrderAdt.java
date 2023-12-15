package com.example.clone.order;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clone.databinding.ItemOrderRecvBinding;
import com.example.clone.databinding.ItemYoutubeRecvBinding;
import com.example.clone.main.MainDTOs;

import java.util.ArrayList;

public class OrderAdt extends RecyclerView.Adapter<OrderAdt.ViewHolder> {
    private ArrayList<Integer> list;

    private OnItemClickListner listner;
    public interface OnItemClickListner{
        void onItemClick(View v, int position);
    }

    public void SetOnItemClickListner(OnItemClickListner listner){
        listner = this.listner;
    }
    public OrderAdt(ArrayList<Integer> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOrderRecvBinding binding =
                ItemOrderRecvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.imgvOrder.setImageResource(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOrderRecvBinding binding;
        public ViewHolder(@NonNull ItemOrderRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }
}
