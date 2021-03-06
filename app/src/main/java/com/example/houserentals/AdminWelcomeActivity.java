package com.example.houserentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AdminWelcomeActivity extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_welcome);


        firebaseAuth = FirebaseAuth.getInstance();


        Button viewAds = (Button) findViewById(R.id.button21);
        Button viewUsers = (Button) findViewById(R.id.button22);
        Button profile = (Button) findViewById(R.id.button24);
        Button logOut = (Button) findViewById(R.id.button23);

        viewAds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(AdminWelcomeActivity.this, ViewAdvertisementActivity.class);
                intent.putExtra("viewAds", "allAdsAdmin");
                startActivity(intent);

            }
        });

        viewUsers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                startActivity(new Intent(AdminWelcomeActivity.this, ViewUsersActivity.class));

            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                startActivity(new Intent(AdminWelcomeActivity.this, UserProfileActivity.class));

            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                firebaseAuth.signOut();

                finish();

                startActivity(new Intent(AdminWelcomeActivity.this, MainActivity.class));

            }
        });

    }
}
