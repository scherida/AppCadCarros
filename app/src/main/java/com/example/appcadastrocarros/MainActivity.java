package com.example.appcadastrocarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etMarca, etModelo, etAnoFab, etCor, etMotor, etCombustivel, etValorFipe;
    Button bCadastrar, bVerCarro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMarca = findViewById(R.id.etMarca);
        etModelo = findViewById(R.id.etModelo);
        etAnoFab = findViewById(R.id.etAnoFab);
        etCor = findViewById(R.id.etCor);
        etMotor = findViewById(R.id.etMotor);
        etCombustivel = findViewById(R.id.etCombustivel);
        etValorFipe = findViewById(R.id.etValorFipe);
        bCadastrar = findViewById(R.id.bCadastrar);
        bVerCarro = findViewById(R.id.bVerCarro);
        bVerCarro.setVisibility(View.GONE);
        bVerCarro.setOnClickListener(v -> {startActivity(new Intent(this, DetalhesActivity.class));
            etMarca.setText("");
            etModelo.setText("");
            etCor.setText("");
            etAnoFab.setText("");
            etCombustivel.setText("");
            etValorFipe.setText("");
            etMotor.setText("");}
        );

        bCadastrar.setOnClickListener(view ->{
            if(etMarca.getText().toString().isEmpty() ||
            etModelo.getText().toString().isEmpty() ||
            etAnoFab.getText().toString().isEmpty() ||
            etCor.getText().toString().isEmpty() ||
            etMotor.getText().toString().isEmpty() ||
            etCombustivel.getText().toString().isEmpty() ||
            etValorFipe.getText().toString().isEmpty()){
                Toast.makeText(this, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show();
            }else{
                final CarroDAO dao = new CarroDAO();
                Carro carro = new Carro(
                etMarca.getText().toString(),
                etModelo.getText().toString(),
                Integer.parseInt(etAnoFab.getText().toString()),
                etCor.getText().toString(),
                etMotor.getText().toString(),
                etCombustivel.getText().toString(),
                Double.parseDouble(etValorFipe.getText().toString())
                );
                dao.save(carro);
                Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                bVerCarro.setVisibility(View.VISIBLE);
            }
        });
    }
}