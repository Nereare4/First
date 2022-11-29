package com.nramos.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingupActivity extends AppCompatActivity {

    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarMain(view);
            }
        });
    }

    public void iniciarMain(View v)
    {
        Intent intent = new Intent(SingupActivity.this, MainActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
        startActivity(intent);
    }
}