package com.health.tech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


        TextView textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCreateAcc = new Intent(SignUp.this, Login.class);
                startActivity(iCreateAcc);
            }
        });


        ImageButton imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSignUp = new Intent(SignUp.this, MainActivity.class);
                startActivity(iSignUp);
            }
        });


    }
}
