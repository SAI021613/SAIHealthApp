package com.health.tech;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        TextView textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCreateAcc = new Intent(Login.this, SignUp.class);
                startActivity(iCreateAcc);
            }
        });


        ImageButton imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSignUp = new Intent(Login.this, MainActivity.class);
                startActivity(iSignUp);
            }
        });
    }
}
