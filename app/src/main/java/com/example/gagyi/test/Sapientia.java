package com.example.gagyi.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Sapientia extends AppCompatActivity {

    private DatabaseReference usersEndPoint;
    private DatabaseReference educatorsEndPoint;
    private DatabaseReference parentsEndPoint;
    private DatabaseReference gamesEndPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapientia);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        usersEndPoint = myRef.child("users");
        educatorsEndPoint = myRef.child("educators");
        parentsEndPoint = myRef.child("parents");
        gamesEndPoint = database.getReference("games");

        String key = gamesEndPoint.push().getKey();
        Game testGame = new Game(key,"A betu","com.test.test","http://google.com","Ez egy teszt jatek az adatbazishoz");
        gamesEndPoint.child(key).setValue(testGame);

    }
}
