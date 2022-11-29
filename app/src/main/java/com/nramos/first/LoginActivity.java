package com.nramos.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

    TextView texto;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        texto = findViewById(R.id.texto);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarMain(view);
            }
        });
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });


        //Objeto sobre el que creamos la animación
        ImageView logo = findViewById(R.id.loginGirl);

        //Creamos un objeto animacion que incorpora la animacion descrita en el xml
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        logo.startAnimation(myanim);

        ImageView mLogo = findViewById(R.id.loginGirl);
        ImageView mFondo = findViewById(R.id.fondo);

        Glide.with(this)
                //.load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                //.load("https://images.unsplash.com/photo-1500817487388-039e623edc21?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=389&q=80")
                //.load("https://images.unsplash.com/photo-1541661538396-53ba2d051eed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80")
                .load("https://images.unsplash.com/photo-1610069302033-6fee1f5791d2?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=465&q=80")
                //.load(R.drawable.img)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                //.centerCrop()
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .circleCrop()
                .into(mLogo);
        Glide.with(this)
                //.load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                //.load("https://images.unsplash.com/photo-1500817487388-039e623edc21?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=389&q=80")
                //.load("https://images.unsplash.com/photo-1541661538396-53ba2d051eed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80")
                //.load("https://images.unsplash.com/photo-1620503374956-c942862f0372?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80")
                .load("https://images.unsplash.com/photo-1620503346949-774aad4af2b9?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(mFondo);
    }
    public void openSignup(){
        Intent intent = new Intent(this, SingupActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void iniciarMain(View v)
    {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
        startActivity(intent);
    }
}