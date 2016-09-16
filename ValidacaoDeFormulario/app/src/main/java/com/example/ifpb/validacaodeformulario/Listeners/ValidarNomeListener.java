package com.example.ifpb.validacaodeformulario.Listeners;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ifpb.validacaodeformulario.MainActivity;

/**
 * Created by IFPB on 16/09/2016.
 */
public class ValidarNomeListener implements TextWatcher{

    MainActivity mainActivity;

    public ValidarNomeListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String s1 = String.valueOf(s);
        EditText name = mainActivity.getName();
        Button submit = mainActivity.getSubmit();

        if (s1.split("//s+").length>1){
            mainActivity.validatedName = true;
        }
        else{
            if(s1.split("//s+").length<=1) {
                mainActivity.validatedName = false;
                mainActivity.validName.setText("Digite o seu nome completo");
                mainActivity.validName.setTextColor(Color.parseColor("#ff0000"));
            }
            if (s1.equals(".")){
                mainActivity.validatedName = false;
                mainActivity.validName.setText("Você não deve abreviar o nome");
                mainActivity.validName.setTextColor(Color.parseColor("#ff0000"));
            }
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

}
