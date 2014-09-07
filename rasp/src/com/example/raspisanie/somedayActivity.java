package com.example.raspisanie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by woqpw on 02.09.14.
 */
public class somedayActivity extends Activity {
    TextView tvTitle,tvfor8,tvfor10,tvfor12,tvfor14,tvfor16,tvTimeMon,tvTimeMon2,tvfor18,tvWeek;
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.someday);
        tvfor10 = (TextView)findViewById(R.id.tvfor10);
        tvfor12 = (TextView)findViewById(R.id.tvfor12);
        tvfor14 = (TextView)findViewById(R.id.tvfor14);
        tvfor16 = (TextView)findViewById(R.id.tvfor16);
        tvfor8 = (TextView)findViewById(R.id.tvfor8);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvTimeMon = (TextView)findViewById(R.id.tvTimeMon);
        tvTimeMon2 = (TextView)findViewById(R.id.tvTimeMon2);
        tvfor18 = (TextView)findViewById(R.id.tvfor18);
        tvWeek = (TextView)findViewById(R.id.tvWeek);
        int week = 5;
        try {
            Date dt = new Date();
            Calendar cl = Calendar.getInstance();
            cl.setTime(dt);
            week = cl.get(Calendar.WEEK_OF_YEAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String wee = "";
        if (week%2==0)
        {
            wee = "first";
        }
        else
        {
            wee ="second";
        }
        Intent intent = getIntent();
        if (wee=="first")
        {
            tvWeek.setText("(Первая неделя)");
        }
        else { tvWeek.setText("(Вторая неделя)");}
        if (intent.getStringExtra("day").equals("mon"))
        {
            tvTitle.setText("Понедельник");
            tvTimeMon.setText("8:00-9:00");
            tvTimeMon2.setText("9:00-12:00");
            tvfor8.setText("Ничего нет!");
            tvfor10.setText("Математика\n235 Гл. зд.");
            tvfor12.setText("Философия (Упражнения)\n406 Гидрак");
            tvfor14.setText("Теор. основы электротехники\n406 Гидрак");
            tvfor16.setText("Ничего нет!");
            tvfor18.setText("Ничего нет!");
        }
        else if (intent.getStringExtra("day").equals("tue"))
        {
            tvTitle.setText("Вторник");
            tvfor8.setText("Ничего нет!");
            tvfor10.setText("Теор. основы электротехники (лаб)\n" +
                    "271 Гл. Зд.");
            tvfor12.setText("Философия (Лекция)\n235 Гл. Зд");
            tvfor14.setText("Теоретическая механика\n406 Гидрак");
            tvfor16.setText("Математика (упражнения)\n505 9");
            tvfor18.setText("Ничего нет!");
        }
        else if (intent.getStringExtra("day").equals("wen"))
        {
            tvTitle.setText("Среда");
            tvfor8.setText("Ничего нет!");
            if (wee =="first")
            {
                tvfor10.setText("Теор. основы электротехники (упр)\n" +
                        "214 Гидрак");
            }
            else
            {
                tvfor10.setText("Теор. основы электротехники (лекции)\n" +
                        "214 Гидрак");
            }
            tvfor12.setText("Физра");
            tvfor14.setText("Вычислительная математика (лекция)\n359 2");
            tvfor16.setText("Английский\n501 9");
            tvfor18.setText("Ничего нет!");
        }
        else if (intent.getStringExtra("day").equals("thu"))
        {
            tvTitle.setText("Четверг");
            tvfor8.setText("Ничего нет!");
            tvfor10.setText("Ничего нет!");
            tvfor12.setText("Ничего нет!");
            tvfor14.setText("Ничего нет!");
            tvfor16.setText("Ничего нет!");
            tvfor18.setText("Ничего нет!");
        }
        else if (intent.getStringExtra("day").equals("fri"))
        {
            tvTitle.setText("Пятница");
            tvfor8.setText("Ничего нет!");
            tvfor10.setText("Ничего нет!");
            if (wee == "first")
            {
                tvfor12.setText("Ничего нет!");
            }
            else {
                tvfor12.setText("Информатика (упражнения)\n309 НУК");
            }
            tvfor12.setText("Информатика (упражнения)\n309 НУК");
            tvfor14.setText("Практикум по проге\n313 НУК");
            tvfor16.setText("Теоретическая механика\n214 Гидрак");
            tvfor18.setText("Теормех \n214 Гидрак");
        }
        else if (intent.getStringExtra("day").equals("sat"))
        {
            tvTitle.setText("Суббота");
            if (wee == "first")
            {
                tvfor8.setText("Информатика (кр+лаб)\n 210 ИМОП");
                tvfor12.setText("Информатика (лекция) \n210 ИМОП");
            }
            else
            {
                tvfor8.setText("Практикум по программированию (упры)\n331 Нук");
                tvfor12.setText("Ничего нет");
            }
            tvfor10.setText("Вычислительная математика (Упражнения)\n313 НУК");
            tvfor14.setText("Физра");
            tvfor16.setText("Ничего нет!");
            tvfor18.setText("Ничего нет!");
        }
    }
}
