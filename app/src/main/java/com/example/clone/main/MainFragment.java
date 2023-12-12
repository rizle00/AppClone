package com.example.clone.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clone.R;
import com.example.clone.databinding.FragmentMainBinding;
import com.google.android.material.chip.ChipGroup;


public class MainFragment extends Fragment {

    FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        MainDAO dao = new MainDAO();
       binding.recvBanner.setAdapter(new MainTopBanAdt(dao.getBannerList(),this));
//        binding.recvBanner.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.recvRec.setAdapter(new MainRecAdt(dao.getRecoList(),this));

        binding.recvRec.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recvRanking.setAdapter(new MainRankingAdt(dao.getSweetRankList()));
        binding.recvRanking.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.chipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener(){
//          랭킹 리사이클러뷰
            @Override
            public void onCheckedChanged(@NonNull ChipGroup group, int checkedId) {

                if(checkedId == R.id.chip_1){
                    binding.recvRanking.setAdapter(new MainRankingAdt(dao.getSweetRankList()));

                } else if (checkedId == R.id.chip_2) {
                    binding.recvRanking.setAdapter(new MainRankingAdt(dao.getCakeRankList()));
                } else if (checkedId == R.id.chip_3) {
                    binding.recvRanking.setAdapter(new MainRankingAdt(dao.getPariRankList()));
                } else if (checkedId == R.id.chip_4) {
                    binding.recvRanking.setAdapter(new MainRankingAdt(dao.getIngiRankList()));
                } else if (checkedId == R.id.chip_5) {
                    binding.recvRanking.setAdapter(new MainRankingAdt(dao.getHealthRankList()));
                }
                binding.recvRanking.setLayoutManager(new LinearLayoutManager(getContext()));
            }
        });


        return binding.getRoot();
    }
}