package com.example.clone.main;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clone.R;
import com.example.clone.databinding.ItemRecRecvBinding;

import java.util.ArrayList;

public class MainRecAdt extends RecyclerView.Adapter<MainRecAdt.ViewHolder> {
    ArrayList<MainDTOs.RecoDTO> list;
    private MainFragment fragment;



    public MainRecAdt(ArrayList<MainDTOs.RecoDTO> list, MainFragment fragment) {
        this.list = list;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecRecvBinding binding =
                ItemRecRecvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }



    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
            View vL = fragment.binding.vRecLeft;
            View vR = fragment.binding.vRecRight;
//      넘어가는 부분이 이상함 확인 필요
        if(i>10){
            fragment.binding.tvRecBanner.setTextColor(Color.parseColor("#FF808080"));
            fragment.binding.tvYrecBanner.setTextColor(Color.parseColor("#FF013780"));
            vL.setAlpha(0.4f);
            LinearLayout.LayoutParams vRH = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
            vR.setLayoutParams(vRH);
            LinearLayout.LayoutParams vLH = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 3);
            vR.setLayoutParams(vLH);
//            추후 처리 질문할것 레이아웃 변경.
//            ViewGroup.LayoutParams vLH = vL.getLayoutParams();
//            vLH.width = ViewGroup.LayoutParams.MATCH_PARENT;
//            vLH.height =1;
//            vL.requestLayout();
//            ViewGroup.LayoutParams vRH = vR.getLayoutParams();
//            vRH.height =3;
//            vR.setLayoutParams(vRH);



//            vR.setLayoutParams(new ViewGroup.LayoutParams(vL.getWidth(),vL.getHeight()));
//            vL.setLayoutParams(new ViewGroup.LayoutParams(vR.getWidth(),vR.getHeight()));
//            vL.getLayoutParams().height = vR.getHeight();
//            vR.getLayoutParams().height = vL.getHeight();
//            vL.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1));
            vL.setBackgroundColor(Color.parseColor("#FFDCDBDB"));
            vR.setAlpha(1);
//            vR.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,3));
            vR.setBackgroundColor(Color.parseColor("#FF01265f"));
        } else if(i<=8) {
            fragment.binding.tvRecBanner.setTextColor(Color.parseColor("#FF013780"));
            fragment.binding.tvYrecBanner.setTextColor(Color.parseColor("#FF808080"));
            vL.setAlpha(1);
            ViewGroup.LayoutParams vLH = vR.getLayoutParams();
            vLH.height = 9;
            vR.setLayoutParams(vLH);
            vL.setBackgroundColor(Color.parseColor("#FF01265f"));
            vR.setAlpha(0.4f);
            vR.setBackgroundColor(Color.parseColor("#FFDCDBDB"));
        }
        h.binding.imgvRec.setImageResource(list.get(i).getImgRes());
        h.binding.tvRecName.setText(list.get(i).getName());
        h.binding.tvRecQuan.setText(list.get(i).getQuan());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRecRecvBinding binding;
        public ViewHolder(@NonNull ItemRecRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
