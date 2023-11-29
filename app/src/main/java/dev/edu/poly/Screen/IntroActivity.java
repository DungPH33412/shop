package dev.edu.poly.Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dev.edu.poly.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void login(View view) {
        startActivity(new Intent(this,LoginActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(this,SignupActivity.class));
    }
}