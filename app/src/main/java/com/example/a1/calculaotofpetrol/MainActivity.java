package com.example.a1.calculaotofpetrol;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private AutoCompleteTextView actv;
    private String [] cars = new String[] {            //Массив с моделями машин
            "VAZ 2107",
            "Kia Rio",
            "Porsche Cayenne",
            "Toyota Prius",
            "Honda Civic Hybrid",
            "Audi Q7",
            "BMW M3 Coupe",
            "BMW X3",
            "BMW X5",
            "Ford Focus ST",
            "Jeep Wrangler",
            "Land Rover Freelander",
            "Mercedes S 600",
            "Mercedes A 150",
            "Mercedes C 350",
            "Lexus RX 400h",
            "Lexus RX 450h",
            "Nissan X-Trail",
            "Opel Meriva 1.6",
            "Peugeot 207",
            "Peugeot 407",
            "Auto"
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actv = findViewById(R.id.AutoCar);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, cars);       //Окно для ввода названия модели машины
        actv.setThreshold(0);
        actv.setAdapter(adapter);

    }


    public double operate(String a, double d, double s)         //Расчет расхода топлива
    {
        switch (a){
            case "VAZ 2107":
                if(s<=50)
                    return 0.05 * Double.valueOf(d);
                else
                    if(s<=75) return 0.065 * Double.valueOf(d);
                else
                    if(s<=100) return 0.08 * Double.valueOf(d);
                else
                    if(s<=150) return 0.11 * Double.valueOf(d);
                else
                    return  0.15 * Double.valueOf(d);


            case "Kia Rio":
                if(s<=50)
                    return 0.032 * Double.valueOf(d);
                else
                    if(s<=75) return 0.047 * Double.valueOf(d);
                else
                    if(s<=100) return 0.065 * Double.valueOf(d);
                else
                    if(s<=150) return 0.075 * Double.valueOf(d);
                else
                    return  0.09 * Double.valueOf(d);


            case "Porsche Cayenne":
                if(s<=50)
                    return 0.045 * Double.valueOf(d);
                 else
                     if(s<=75) return 0.055 * Double.valueOf(d);
                 else
                     if(s<=100) return 0.09 * Double.valueOf(d);
                 else
                     if(s<=150) return 0.12 * Double.valueOf(d);
                 else
                     return  0.17 * Double.valueOf(d);


            case  "Toyota Prius":
                if (s<=50) return  0.021 * Double.valueOf(d);
                else if (s<=75) return 0.043 * Double.valueOf(d);
                else if (s<=100) return 0.052 * Double.valueOf(d);
                else if (s<=150) return 0.06 * Double.valueOf(d);
                else return 0.069 * Double.valueOf(d);


            case "Honda Civic Hybrid":
                if (s<=50) return 0.025 * Double.valueOf(d);
                else if (s<=75) return 0.046 * Double.valueOf(d);
                else if (s<=100) return 0.055 * Double.valueOf(d);
                else if (s<=150) return 0.063 * Double.valueOf(d);
                else return 0.071* Double.valueOf(d);


            case "Audi Q7":
                if (s<=50) return 0.05 * Double.valueOf(d);
                else if (s<=75) return 0.08 * Double.valueOf(d);
                else if (s<=100) return 0.111 * Double.valueOf(d);
                else if (s<=150) return 0.15 * Double.valueOf(d);
                else return 0.19 * Double.valueOf(d);

            case "BMW M3 Coupe":
                if (s<=50) return 0.06 * Double.valueOf(d);
                else if (s<=75) return 0.09 * Double.valueOf(d);
                else if (s<=100) return 0.124 * Double.valueOf(d);
                else if (s<=150) return 0.16 * Double.valueOf(d);
                else return 0.20 * Double.valueOf(d);


            case "BMW X3":
                if (s<=50) return 0.045 * Double.valueOf(d);
                else if (s<=75) return 0.05 * Double.valueOf(d);
                else if (s<=100) return 0.09 * Double.valueOf(d);
                else if (s<=150) return 0.11 * Double.valueOf(d);
                else return 0.15 * Double.valueOf(d);


            case "BMW X5":
                if (s<=50) return 0.055 * Double.valueOf(d);
                else if (s<=75) return 0.062 * Double.valueOf(d);
                else if (s<=100) return 0.082 * Double.valueOf(d);
                else if (s<=150) return 0.122 * Double.valueOf(d);
                else return 0.16 * Double.valueOf(d);


            case "Ford Focus ST":
                if (s<=50) return 0.04 * Double.valueOf(d);
                else if (s<=75) return 0.047 * Double.valueOf(d);
                else if (s<=100) return 0.07 * Double.valueOf(d);
                else if (s<=150) return 0.09 * Double.valueOf(d);
                else return 0.12 * Double.valueOf(d);


            case "Jeep Wrangler":
                if (s<=50) return 0.075 * Double.valueOf(d);
                else if (s<=75) return 0.09 * Double.valueOf(d);
                else if (s<=100) return 0.115 * Double.valueOf(d);
                else if (s<=150) return 0.15 * Double.valueOf(d);
                else return 0.21 * Double.valueOf(d);


            case "Land Rover Freelander":
                if (s<=50) return 0.05 * Double.valueOf(d);
                else if (s<=75) return 0.058 * Double.valueOf(d);
                else if (s<=100) return 0.078 * Double.valueOf(d);
                else if (s<=150) return 0.9 * Double.valueOf(d);
                else return 0.12 * Double.valueOf(d);


            case "Mercedes S 600":
                if (s<=50) return 0.095 * Double.valueOf(d);
                else if (s<=75) return 0.11 * Double.valueOf(d);
                else if (s<=100) return 0.16 * Double.valueOf(d);
                else if (s<=150) return 0.185 * Double.valueOf(d);
                else return 0.23 * Double.valueOf(d);


            case "Mercedes A 150":
                if (s<=50) return 0.055 * Double.valueOf(d);
                else if (s<=75) return 0.06 * Double.valueOf(d);
                else if (s<=100) return 0.072 * Double.valueOf(d);
                else if (s<=150) return 0.09 * Double.valueOf(d);
                else return 0.115 * Double.valueOf(d);


            case "Mercedes C 350":
                if (s<=50) return 0.08 * Double.valueOf(d);
                else if (s<=75) return 0.9 * Double.valueOf(d);
                else if (s<=100) return 0.11 * Double.valueOf(d);
                else if (s<=150) return 0.135 * Double.valueOf(d);
                else return 0.16 * Double.valueOf(d);


            case "Lexus RX 400h":
                if (s<=50) return 0.089 * Double.valueOf(d);
                else if (s<=75) return 0.10 * Double.valueOf(d);
                else if (s<=100) return 0.12 * Double.valueOf(d);
                else if (s<=150) return 0.14 * Double.valueOf(d);
                else return 0.175 * Double.valueOf(d);


            case "Lexus RX 450h":
                if (s<=50) return 0.055 * Double.valueOf(d);
                else if (s<=75) return 0.059 * Double.valueOf(d);
                else if (s<=100) return 0.0631 * Double.valueOf(d);
                else if (s<=150) return 0.08 * Double.valueOf(d);
                else return 0.095 * Double.valueOf(d);


            case "Nissan X-Trail":
                if (s<=50) return 0.05 * Double.valueOf(d);
                else if (s<=75) return 0.06 * Double.valueOf(d);
                else if (s<=100) return 0.072 * Double.valueOf(d);
                else if (s<=150) return 0.09 * Double.valueOf(d);
                else return 0.115 * Double.valueOf(d);


            case "Opel Meriva 1.6":
                if (s<=50) return 0.057 * Double.valueOf(d);
                else if (s<=75) return 0.65 * Double.valueOf(d);
                else if (s<=100) return 0.075 * Double.valueOf(d);
                else if (s<=150) return 0.095 * Double.valueOf(d);
                else return 0.12 * Double.valueOf(d);


            case "Peugeot 207":
                if (s<=50) return 0.055 * Double.valueOf(d);
                else if (s<=75) return 0.061 * Double.valueOf(d);
                else if (s<=100) return 0.071 * Double.valueOf(d);
                else if (s<=150) return 0.08 * Double.valueOf(d);
                else return 0.097 * Double.valueOf(d);


            case "Peugeot 308":
                if (s<=50) return 0.045 * Double.valueOf(d);
                else if (s<=75) return 0.05 * Double.valueOf(d);
                else if (s<=100) return 0.059 * Double.valueOf(d);
                else if (s<=150) return 0.07 * Double.valueOf(d);
                else return 0.9 * Double.valueOf(d);


            case "Peugeot 407":
                if (s<=50) return 0.063 * Double.valueOf(d);
                else if (s<=75) return 0.075 * Double.valueOf(d);
                else if (s<=100) return 0.085 * Double.valueOf(d);
                else if (s<=150) return 0.103 * Double.valueOf(d);
                else return 0.133 * Double.valueOf(d);

                default: return -1;
        }

    }



    public void onClickResult (View v){

        TextView Result = (TextView)findViewById(R.id.textResult);
        EditText Distance = (EditText)findViewById(R.id.TextDistance);
        EditText Speed = (EditText)findViewById(R.id.TextSpeed);
        TextView Contents = (TextView)findViewById(R.id.TextContents);

        double el_d = Double.parseDouble(Distance.getText().toString());
        double el_s = Double.parseDouble(Speed.getText().toString());
        String el_a = actv.getText().toString();

        Double _result = operate(el_a, el_d, el_s);
        if(_result == -1) {
            Result.setTextSize(18);
            Result.setText("Возможно некорректно введено название автомобиля \nИли этот автомобиль еще не добавлен в базу");
        }
        else{
        Result.setTextSize(32);
        if(_result < 1) Result.setText(String.format("%.2f", _result) + " Литров");
        else if(_result == 1) Result.setText(String.format("%.2f", _result) + " Литр");
        else if(_result <= 4) Result.setText(String.format("%.2f", _result) + " Литра");
        else Result.setText(String.format("%.2f", _result) + " Литров");
        }

        if(_result == 0) Contents.setText("Вы не потратите ничего :) \nПопробуйте поменять вводимые данные" );           //Заголовок результата
        else if(_result == -1) Contents.setText(" ");
        else Contents.setText("Расход вашего топлива составит");
    }
}
