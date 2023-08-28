package com.example.horario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class Comidas extends AppCompatActivity {

    private TextView tvFecha;
    private TextView tvDesayuno;
    private TextView tvAlmuerzo;
    private TextView tvCafe;
    private TextView tvCena;

    private TextView tvRestaurante;
    // private String [][] horarios;

    private String restaurante;

    private HashMap<String, String [][]> restHorarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas);
        restHorarios = new HashMap<>();
        tvRestaurante = (TextView) findViewById(R.id.restauranteText);
        tvFecha = (TextView) findViewById(R.id.fechaText);
        tvDesayuno = (TextView) findViewById(R.id.desayunoText);
        tvAlmuerzo = (TextView) findViewById(R.id.almuerzoText);
        tvCafe = (TextView) findViewById(R.id.cafeText);
        tvCena = (TextView) findViewById(R.id.cenaText);
        // horarios = new String[7][4];
        llenarHorarios();
        llenarText(getIntent().getIntExtra("weekDay", 0),getIntent().getStringExtra("dateString"),
                getIntent().getStringExtra("restaurante"));
    }

    private void llenarHorarios(){
        String [][] horarios = new String[7][4];
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

        restHorarios.put("Restaurante Institucional", horarios);

        horarios = new String[7][4];
        horarios[0] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, guarnición, ensalada, refresco\n" +
                        "1 Carne: pollo en salsa de tomate, spaghetti\na la boloñesa, garbanzos con pollo",
                "Repostería y helados", "No hay"};
        horarios[1] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, guarnición, ensalada, refresco\n" +
                "1 Carne: arroz con pollo, pastel de yuca con carne",
                "Repostería y helados", "No hay"};
        horarios[2] =  new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, \nguarnición, ensalada, refresco\n" +
                        "1 Carne: tortas de carne, \ncarne en salsa y vegetales",
                "Repostería y helados", "No hay"};
        horarios[3] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, \nguarnición, ensalada, refresco\n" +
                        "1 Carne: chuleta, gratín de pollo\ny brocoli, zuquini\nrelleno de carne y queso",
                "Repostería y helados", "No hay"};
        horarios[4] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, \nguarnición, ensalada, refresco\n" +
                        "1 Carne: chuleta BBQ, spaghetti\na la boloñesa, pollo al horno",
                "Repostería y helados", "No hay"};
        horarios[5] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón",
                "Incluye: arroz, frijoles, \nguarnición, ensalada, refresco\n" +
                        "1 Carne: filet de pollo \na la plancha, arroz con pollo,\ncarne en salsa y vegetales",
                "Repostería y helados", "No hay"};
        horarios[6] = new String[]{"Incluye: pinto, huevo al gusto,\nplátano maduro, pan, café/té/fresco\n" +
                "adicionales: Jamón, queso, natilla,\nomelette al gusto, empanadas,\nsalchichón\n",
                "Incluye: arroz, frijoles,\nguarnición, ensalada, refresco\n" +
                        "1 Carne: costilla BBQ, frijoles\nblancos con pollo, quesadilla\nde carne",
                "Repostería y helados", "No hay"};

        restHorarios.put("Soda La Deportiva", horarios);

        horarios = new String[7][4];
        horarios[0] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, salchichón\n" +
                "Otros: burritos de pinto"
                , "Incluye: arroz, frijoles, ensalada, fresco\n" +
                "1 Guarnición: maduro frito, picadillo de papa\n" +
                "1 Carne: pollo en salsa, carne mechada\n" +
                "Vegetariano: barbudos", "No hay", "No hay"};
        horarios[1] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, salchichón\n" +
                "Otros: burritos de pinto",
                "Incluye: arroz, frijoles, ensalada, fresco\n" +
                "1 Guarnición: maduro frito, papas salteadas\n" +
                "1 Carne: pollo dorado, tortas de carne\n" +
                "Vegetariano: chancletas",
                "No hay", "No hay"};
        horarios[2] =  new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso,\nsalchichas en salsa\n" +
                "Otros: empanadas de queso \ny empanadas de frijol",
                "Incluye: arroz, frijoles, ensalada, fresco\n" +
                        "1 Guarnición: maduro frito, picadillo\nde chayote con maíz, pure de papa\n" +
                        "1 Carne: bistec encebollado, fajitas\nde pollo, pescado empanizado\n" +
                        "Vegetariano: garbanzos con verduritas",
                "No hay", "No hay"};
        horarios[3] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, chorizo",
                "Incluye: arroz, frijoles, ensalada, fresco\n" +
                        "1 Guarnición: maduro frito, picadillo de chayote con maíz\n" +
                        "1 Carne: bistec encebollado, fajitas de pollo\n" +
                        "Vegetariano: garbanzos con verduritas", "No hay", "No hay"};
        horarios[4] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, salchichón\n" +
                "Otros: tortas de huevo con cebolla",
                "Incluye: arroz, frijoles, ensalada, fresco\n" +
                        "1 Guarnición: maduro frito, frijoles\nmolidos, papitas saltaeadas\n" +
                        "1 Carne: bistec encebollado, arroz con pollo\n" +
                        "Vegetariano: spaghetti con salsa de tomate y queso", "No hay", "No hay"};
        horarios[5] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, chorizo\n" +
                "Otros: empanadas de queso, empanadas de frijol",
                "Incluye: arroz, frijoles, ensalada, fresco\n" +
                        "1 Guarnición: maduro frito, picadillo\nde vainica con zanahoria\n" +
                        "1 Carne: pollo dorado. canelones de carne\n" +
                        "Vegetariano: canelones de queso",
                "No hay",
                "No hay"};
        horarios[6] = new String[]{"Incluye: pinto, pan, café/fresco\n" +
                "2 acompañamientos: Maduro, Huevo picado\no frito, Natilla, queso, salchichas en salsa\n" +
                "Otros: burros de pinto", "Incluye: arroz, frijoles, ensalada, fresco\n" +
                "1 Guarnición: maduro frito\n" +
                "1 Carne: pescado empanizado, tortas de carne\n" +
                "Vegetariano: tortas de yuca con queso",
                "No hay",
                "No hay"};

        restHorarios.put("La Casita Forestal", horarios);
    }
    private void llenarText(int dia, String fecha, String pRestaurante){
        restaurante = pRestaurante;
        tvRestaurante.setText(restaurante);
        tvFecha.setText(fecha);
        tvDesayuno.setText(restHorarios.get(restaurante)[dia][0]);
        tvAlmuerzo.setText(restHorarios.get(restaurante)[dia][1]);
        tvCafe.setText(restHorarios.get(restaurante)[dia][2]);
        tvCena.setText(restHorarios.get(restaurante)[dia][3]);
    }

    public void regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void ubicacion(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}