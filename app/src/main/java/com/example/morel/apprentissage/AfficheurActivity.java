package com.example.morel.apprentissage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AfficheurActivity extends AppCompatActivity {

    TextView afficherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficheur);

        Intent i = getIntent();
        String nom = i.getStringExtra("nom");
        String prenom = i.getStringExtra("prenom");
        afficherTextView = (TextView) findViewById(R.id.afficherTextView);
        afficherTextView.setText("Bonjour "+ nom + " " + prenom);

    }
}
