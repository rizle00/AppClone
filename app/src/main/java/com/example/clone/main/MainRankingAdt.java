package com.example.clone.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clone.R;
import com.example.clone.databinding.ItemRankingRecvBinding;
import com.example.clone.databinding.ItemRecRecvBinding;

import java.util.ArrayList;

public class MainRankingAdt extends RecyclerView.Adapter<MainRankingAdt.ViewHolder> {
    ArrayList<MainDTOs.RankingDTO> list;

    public MainRankingAdt(ArrayList<MainDTOs.RankingDTO> list) {
        this.list = list;
    }

//    아이템 처리
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
// 여기까지
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRankingRecvBinding binding =
                ItemRankingRecvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvRankingNum.setText(list.get(i).getRank()+"");
        h.binding.imgvRanking.setImageResource(list.get(i).getImgRes());
        h.binding.tvRankingName.setText(list.get(i).getName());
        if(list.get(i).getQuan() == 0){
            h.binding.imgvBest.setVisibility(View.GONE);
        } else if(list.get(i).getQuan() == 300){
            h.binding.imgvBest.setImageResource(R.drawable.best_300);
        } else if(list.get(i).getQuan() == 500){
            h.binding.imgvBest.setImageResource(R.drawable.best_500);
        } else if(list.get(i).getQuan() == 1000){
            h.binding.imgvBest.setImageResource(R.drawable.best_1000);
        }
//        switch (list.get(i).getQuan()){
//
//            case 300 :
//                h.binding.imgvBest.setImageResource(R.drawable.best_300);
//                break;
//            case 500 :
//                h.binding.imgvBest.setImageResource(R.drawable.best_500);
//                break;
//            case 1000 :
//                h.binding.imgvBest.setImageResource(R.drawable.best_1000);
//                break;
//            default:
//                h.binding.imgvBest.setVisibility(View.GONE);
//        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRankingRecvBinding binding;
        public ViewHolder(@NonNull ItemRankingRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
