package com.example.gagyi.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;
import java.util.Map;

public class EducatorInterface extends AppCompatActivity {

    private Button addGameButton;
    private Map<Game,Object> gamesToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educator_interface);
        addGameButton = (Button) findViewById(R.id.button9);

        addGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducatorInterface.this, ListApplications.class);
                startActivity(intent);
                finish();
            }
        });
        
    }
}
