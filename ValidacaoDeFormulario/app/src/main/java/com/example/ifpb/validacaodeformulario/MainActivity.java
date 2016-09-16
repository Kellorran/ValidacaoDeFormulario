package com.example.ifpb.validacaodeformulario;

import android.app.AlertDialog;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ifpb.validacaodeformulario.Listeners.ValidarClickListener;
import com.example.ifpb.validacaodeformulario.Listeners.ValidarNomeListener;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText adress;
    private Button submit;
    public TextView validName;
    public TextView validAdress;

    public boolean validatedName = false;
    public boolean validatedAdress = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.nameEdit);
        TextView adress = (TextView) findViewById(R.id.adressEdit);
        TextView validName = (TextView) findViewById(R.id.validName);
        TextView validAdress = (TextView) findViewById(R.id.validAdress);

        Button submit = (Button) findViewById(R.id.submit);

        name.addTextChangedListener(new ValidarNomeListener(this));
        adress.addTextChangedListener(new ValidarNomeListener(this));

    }

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public EditText getAdress() {
        return adress;
    }

    public void setAdress(EditText adress) {
        this.adress = adress;
    }

    public Button getSubmit() {
        return submit;
    }

    public void setSubmit(Button submit) {
        this.submit = submit;
    }




    public TextView getValidName() {
        return validName;
    }

    public void setValidName(TextView validName) {
        this.validName = validName;
    }

    public TextView getValidAdress() {
        return validAdress;
    }

    public void setValidAdress(TextView validAdress) {
        this.validAdress = validAdress;
    }

    public void alert1(View v){
        AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
        alertDialog1.setTitle("O aplicativo informa");
        alertDialog1.setMessage("O formulário foi enviado com sucesso!");
        alertDialog1.show();
    }

    public void alert2(View v){
        AlertDialog alertDialog2 = new AlertDialog.Builder(this).create();
        alertDialog2.setTitle("O aplicativo informa");
        alertDialog2.setMessage("Todos os campos devem ser preenchidos corretamente!");
        alertDialog2.show();
    }
}
