package com.example.clone.dialog;

import android.app.Dialog;

import android.content.Context;
import com.example.clone.databinding.DialogHappyPointBinding;

public class DialogHappyPoint extends Dialog {

    DialogHappyPointBinding binding;

    public DialogHappyPoint(Context context) {
        super(context);
        binding=DialogHappyPointBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
