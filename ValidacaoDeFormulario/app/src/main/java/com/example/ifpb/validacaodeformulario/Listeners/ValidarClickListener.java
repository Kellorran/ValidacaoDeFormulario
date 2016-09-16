package com.example.ifpb.validacaodeformulario.Listeners;

import android.app.AlertDialog;
import android.view.View;

import com.example.ifpb.validacaodeformulario.MainActivity;

/**
 * Created by IFPB on 16/09/2016.
 */
public class ValidarClickListener implements View.OnClickListener {

    MainActivity mainActivity;

    public ValidarClickListener (MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if ((mainActivity.validatedName = true) && (mainActivity.validatedAdress = true)) {
            mainActivity.alert1(v);
        }
        else {
            if((mainActivity.validatedName = false) || (mainActivity.validatedAdress = false)){
                mainActivity.alert2(v);
            }
        }
    }
}
