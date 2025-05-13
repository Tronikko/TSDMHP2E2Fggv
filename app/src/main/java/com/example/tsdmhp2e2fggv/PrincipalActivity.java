package com.example.tsdmhp2e2fggv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo;
    Button btnenvia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
        btnenvia = findViewById(R.id.btnenvia);

        btnenvia.setOnClickListener( v -> {
            UsrDatos usrDatos = new UsrDatos(txtnombre.getText().toString(),txtcorreo.getText().toString(),Integer.parseInt(txtedad.getText().toString()));
            Intent intent = new Intent(PrincipalActivity.this,RecibeActivity.class);
            intent.putExtra("usrdatos",usrDatos);
            startActivity(intent);
            finish();

        });




    }
}