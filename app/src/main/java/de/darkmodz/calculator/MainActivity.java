package de.darkmodz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *
         * Inizalisierung & Deklerazion
         *
         */
        // TextView
        TextView tErg = findViewById(R.id.textViewErg);

        // EditText
        EditText inZ1 = findViewById(R.id.inZ1);
        EditText inZ2 = findViewById(R.id.inZ2);

        // Button
        Button btnAddieren = findViewById(R.id.buttonAddieren);
        Button btnSubtrahieren = findViewById(R.id.buttonSubtrahieren);
        Button btnMultiplizieren = findViewById(R.id.buttonMultiplizieren);
        Button btnDividieren = findViewById(R.id.buttonDividieren);

        /**
         *
         * OnClickListeners
         *
         */

        btnAddieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double zahl1, zahl2, erg;
                zahl1 = Double.parseDouble(inZ1.getText().toString());
                zahl2 = Double.parseDouble(inZ2.getText().toString());

                erg = zahl1 + zahl2; // Berechnet die zwei Zahlen

                erg = erg * 100;
                erg = Math.round(erg); // Löscht die Nachkommazahlen
                erg = erg / 100;

                tErg.setText("Die Summe der beiden Zahlen ergeben: \n" + erg);
            }
        });

        btnSubtrahieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double zahl1, zahl2, erg;
                zahl1 = Double.parseDouble(inZ1.getText().toString());
                zahl2 = Double.parseDouble(inZ2.getText().toString());

                erg = zahl1 - zahl2; // Berechnet die zwei Zahlen

                erg = erg * 100;
                erg = Math.round(erg); // Löscht die Nachkommazahlen
                erg = erg / 100;

                tErg.setText("Die Differenz der beiden Zahlen ergeben: \n" + erg);
            }
        });

        btnMultiplizieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double zahl1, zahl2, erg;
                zahl1 = Double.parseDouble(inZ1.getText().toString());
                zahl2 = Double.parseDouble(inZ2.getText().toString());

                erg = zahl1 * zahl2; // Berechnet die zwei Zahlen

                erg = erg * 100;
                erg = Math.round(erg); // Löscht die Nachkommazahlen
                erg = erg / 100;

                tErg.setText("Die Produkt der beiden Zahlen ergeben: \n" + erg);
            }
        });

        btnDividieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double zahl1, zahl2, erg;
                zahl1 = Double.parseDouble(inZ1.getText().toString());
                zahl2 = Double.parseDouble(inZ2.getText().toString());

                erg = zahl1 / zahl2; // Berechnet die zwei Zahlen

                erg = erg * 100;
                erg = Math.round(erg); // Löscht die Nachkommazahlen
                erg = erg / 100;

                tErg.setText("Die Quotient der beiden Zahlen ergeben: \n" + erg);
            }
        });

    }
}