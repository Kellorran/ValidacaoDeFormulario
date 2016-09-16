package com.example.ifpb.validacaodeformulario.Listeners;

import android.text.Editable;
import android.text.TextWatcher;

import com.example.ifpb.validacaodeformulario.MainActivity;

/**
 * Created by IFPB on 16/09/2016.
 */
public class ValidarEndListener implements TextWatcher {

    MainActivity mainActivity;

    public ValidarEndListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String s1 = String.valueOf(s);
        if (s1.split("//s+").length>1){
            mainActivity.validatedAdress = true;
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
