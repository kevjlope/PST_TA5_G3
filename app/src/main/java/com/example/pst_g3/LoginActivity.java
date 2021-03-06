package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LoginActivity extends AppCompatActivity {
    private ImageView imv_photo;
    private Button btn_login;
    private String photo;
    private EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            iniciarParametros();
    }

    public void iniciarParametros(){
        photo = "https://img.pngio.com/ebook-png-94-images-in-collection-page-1-ebook-png-300_318.png";
        imv_photo = findViewById(R.id.logo);
        Picasso.with(getApplicationContext()).load(photo).into(imv_photo);
        btn_login = findViewById(R.id.btn_login);
        usuario= findViewById(R.id.username);
    }

    public void onLogin(View view){
        Intent principalA = new Intent(this, PrincipalActivity.class);
        PrincipalActivity.setUser(usuario.getText().toString());
        //System.out.println("usuario en login: "+usuario.getText());
        startActivity(principalA);
        //finish();
    }

    public void goCreateAccount(View view){
        Intent nuevaCuenta = new Intent(this, NewAccountActivity.class);
        startActivity(nuevaCuenta);
        //finish();

    }

}