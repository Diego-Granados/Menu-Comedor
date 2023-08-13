package com.example.horario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Comidas extends AppCompatActivity {

    private TextView tvFecha;
    private TextView tvDesayuno;
    private TextView tvAlmuerzo;
    private TextView tvCafe;
    private TextView tvCena;
    private String [][] horarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas);

        tvFecha = (TextView) findViewById(R.id.fechaText);
        tvDesayuno = (TextView) findViewById(R.id.desayunoText);
        tvAlmuerzo = (TextView) findViewById(R.id.almuerzoText);
        tvCafe = (TextView) findViewById(R.id.cafeText);
        tvCena = (TextView) findViewById(R.id.cenaText);
        horarios = new String[7][4];
        llenarHorarios();
        llenarText(getIntent().getIntExtra("weekDay", 0),getIntent().getStringExtra("dateString"));
    }

    private void llenarHorarios(){
        horarios[0] = new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Queso \n" +
                "Picadillo de papa\n" +
                "Frutas", "Pollo al horno \n" +
                "Chayote con maíz \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco ", "Emparedado de frijol y queso amarillo", "Arroz con palmito"};
        horarios[1] = new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Queso \n" +
                "Picadillo de papa\n" +
                "Frutas", "Pollo al horno \n" +
                "Chayote con maíz \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco ", "Emparedado de frijol y queso amarillo", "Arroz con palmito"};
        horarios[2] =  new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Natilla\n" +
                "Chorreada\n" +
                "Frutas", "Frijoles tiernos con cerdo\n" +
                "Berenjena, tomate y queso \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco \n", "Perro caliente", "Pasta con pesto"};
        horarios[3] = new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Carne molida en salsa \n" +
                "Plátano maduro \n" +
                "Frutas", "Pollo con papas \n" +
                "Picadillo de papaya verde \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco ", "Torrijas", "Sopa de res, fideos y vegetales"};
        horarios[4] = new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Queso \n" +
                "Tostada de margarina y jalea\n" +
                "Frutas", "Chop suey seco\n" +
                "Zucchini asado\n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco", "Flauta de frijol y queso", "Garbanzos con tomate"};
        horarios[5] = new String[]{"Gallo pinto \n" +
                "Huevo picado\n" +
                "Salchicha en salsa \n" +
                "Plátano maduro \n" +
                "Frutas", "Torta de atún \n" +
                "Crema de ayote sazón \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco", "Queque de chocolate y maní", "Spaguetti a la boloñesa"};
        horarios[6] = new String[]{"Gallo pinto \n" +
                "Huevo con jamón \n" +
                "Queso frito\n" +
                "Atol de vitamaíz \n" +
                "Frutas", "Muslito de pollo caribeño \n" +
                "Picadillo de chayote \n" +
                "Arroz, frijoles \n" +
                "Ensalada\n" +
                "Fresco", "Queque de zanahoria", "Chifrijo"};
    }
    private void llenarText(int dia, String fecha){
        tvFecha.setText(fecha);
        tvDesayuno.setText(horarios[dia][0]);
        tvAlmuerzo.setText(horarios[dia][1]);
        tvCafe.setText(horarios[dia][2]);
        tvCena.setText(horarios[dia][3]);
    }

    public void regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}