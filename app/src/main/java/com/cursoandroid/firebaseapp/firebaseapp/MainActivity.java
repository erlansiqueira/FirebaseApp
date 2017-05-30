package com.cursoandroid.firebaseapp.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReferencia.child("usuarios");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario usuario = new Usuario();
        usuario.setIdade(25);
        usuario.setNome("Helena");
        usuario.setSexo("Feminino");
        usuario.setSobrenome("Silva");

        usuarioReferencia.child("003").setValue(usuario);

    }
}
