package com.example.gagyi.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.buttonreg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent RegisterIntent = new Intent(MainActivity.this, Register.class);
                startActivity(RegisterIntent);
                finish();
            }
        });

        Button loginButton = (Button)findViewById(R.id.buttonlog);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent RegisterIntent = new Intent(MainActivity.this, Login.class);
                startActivity(RegisterIntent);
                finish();
            }
        });
    }
}
