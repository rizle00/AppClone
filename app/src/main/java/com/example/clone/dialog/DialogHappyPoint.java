package com.example.clone.dialog;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.clone.databinding.DialogHappyPointBinding;

public class DialogHappyPoint extends Dialog {

    DialogHappyPointBinding binding;

    public DialogHappyPoint(@NonNull Context context) {
        super(context);
        binding=DialogHappyPointBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
