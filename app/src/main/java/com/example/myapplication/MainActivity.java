package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view;


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.view);
        view.setBackgroundColor(getResources().getColor(android.R.color.black));

        //Obtém a referência do GridLayout a partir do arquivo de layout
        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid_layout);

    // Cria e adiciona visualizações ao GridLayout
        Button button1 = new Button(this);
        button1.setText("Botão 1");
        gridLayout.addView(button1);

        Button button2 = new Button(this);
        button2.setText("Botão 2");
        gridLayout.addView(button2);

        Button button3 = new Button(this);
        button3.setText("Botão 3");
        gridLayout.addView(button3);



    }


}