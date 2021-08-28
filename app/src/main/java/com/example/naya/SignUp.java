package com.example.naya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView loginnn;
    TextView policy_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        loginnn = findViewById(R.id.loginnn);
        policy_text = findViewById(R.id.policy_text);

        String text = "By signing up you accept the Terms of Service and Privacy Policy";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan blue = new ForegroundColorSpan(Color.BLUE);
        ForegroundColorSpan bluee = new ForegroundColorSpan(Color.BLUE);

        ss.setSpan(blue,29,45, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(bluee,50,64, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        policy_text.setText(ss);

        loginnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this, LogIn.class));
            }
        });
    }

}