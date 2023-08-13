package com.example.horario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    Calendar calendar;

    int dayOfWeek;
    String[] daysOfWeek = {
            "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
    };

    String[] months = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    String dateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        calendar = Calendar.getInstance();
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);

            }
        });
    }

    public void consultarFecha(View view){
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        dateString = daysOfWeek[dayOfWeek] + " " + calendar.get(Calendar.DAY_OF_MONTH) + " de " +
                months[calendar.get(Calendar.MONTH)] + " del " + calendar.get(Calendar.YEAR);

        Intent i = new Intent(this, Comidas.class);
        i.putExtra("dateString", dateString);
        i.putExtra("weekDay", dayOfWeek);
        startActivity(i);
    }
}