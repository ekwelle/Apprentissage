package com.example.morel.apprentissage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nomEditText;
    EditText prenomEditText;
    Button boutonVider;
    Button boutonValider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomEditText = (EditText) findViewById(R.id.nomEditText);
        prenomEditText = (EditText) findViewById(R.id.prenomEditText);
        boutonVider = (Button) findViewById(R.id.viderBouton);
        boutonValider = (Button) findViewById(R.id.validerBouton);

        boutonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allerAfficheurActIntent = new Intent(MainActivity.this, AfficheurActivity.class);
                String nom = nomEditText.getText().toString();
                String prenom = prenomEditText.getText().toString();
                allerAfficheurActIntent.putExtra("nom",nom);
                allerAfficheurActIntent.putExtra("prenom",prenom);
                startActivity(allerAfficheurActIntent);
            }
        });
    }
}
