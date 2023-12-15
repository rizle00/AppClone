package com.example.clone.main;

import android.annotation.SuppressLint;
import android.graphics.Color;
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


public class MainFragment extends Fragment implements View.OnClickListener {

    FragmentMainBinding binding;

    @SuppressLint("ResourceAsColor")
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
        
        
        
        changeFragment(new YoutubeFragment());
//        텍스트 색상 안바뀜..
//        온클릭 리스너 바깥으로 빼기
        binding.btnYoutube.setOnClickListener(v -> {
            changeFragment(new YoutubeFragment());
            binding.btnYoutube.setTextColor(Color.parseColor("#FFFFFFFF"));
            binding.btnYoutube.setBackgroundResource(R.drawable.btn_content_sel);
            binding.btnInsta.setTextColor(Color.parseColor("#FF595757"));
            binding.btnInsta.setBackgroundResource(R.drawable.btn_content_unsel);
        });
        binding.btnInsta.setOnClickListener(v -> {
            changeFragment(new InstaFragment());
            binding.btnYoutube.setTextColor(Color.parseColor("#FF595757"));
            binding.btnYoutube.setBackgroundResource(R.drawable.btn_content_unsel);
            binding.btnInsta.setTextColor(Color.parseColor("#FFFFFFFF"));
            binding.btnInsta.setBackgroundResource(R.drawable.btn_content_sel);
        });
        binding.llItemMore.setOnClickListener(v -> {
//            채크 필요
            binding.llBtnBelow.setVisibility(View.VISIBLE);
           binding.llItemBadge.setVisibility(View.VISIBLE);
           binding.llItemMore.setVisibility(View.GONE);
        });

        return binding.getRoot();
    }

    public void changeFragment(Fragment fragment){
        getChildFragmentManager().beginTransaction().replace(R.id.inner_contatiner, fragment).commit();
    }

    @Override
    public void onClick(View v) {
        
    }
}