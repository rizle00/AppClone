package com.example.clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.clone.databinding.ActivityOrderBinding;
import com.example.clone.order.OrderAdt;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        binding.recvOrder.setAdapter(new OrderAdt(getList()));
        binding.recvOrder.setLayoutManager(new GridLayoutManager(this,5, LinearLayoutManager.HORIZONTAL, false));
        binding.bottomNav.setItemIconTintList(null);

        setContentView(binding.getRoot());
    }

    
//    임시 리시트 이미지 따고, 어떻게 할지 생각하기
    ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);
        list.add(R.drawable.logo);

        return list;
    }
}