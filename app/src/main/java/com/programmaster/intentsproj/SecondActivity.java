package com.programmaster.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView result;
    Button addBtn, divBtn, multiBtn, aduBtn;
    String num1, num2;
    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1 = findViewById(R.id.editText3);
        et2 = findViewById(R.id.editText4);

        result = findViewById(R.id.textView5);

        addBtn = findViewById(R.id.button2);
        aduBtn = findViewById(R.id.button3);
        divBtn = findViewById(R.id.button4);
        multiBtn = findViewById(R.id.button5);

        num1 = getIntent().getExtras().getString("Value");
        num2 = getIntent().getExtras().getString("Value1");

        et1.setText(num1);
        et2.setText(num2);

        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = number1 + number2;
                String text = num1+" + "+num2+" = "+String.valueOf(sum);
                result.setText(text);
            }
        });

        aduBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1 > number2){
                    int sum = number1 - number2;
                    String text = num1+" - "+num2+" = "+String.valueOf(sum);
                    result.setText(text);
                }else{
                    int sum = number2 - number1;
                    String text = num2+" - "+num1+" = "+String.valueOf(sum);
                    result.setText(text);
                }

            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1 > number2){
                    float sum = (float)number1 / number2;
                    String text = num1+" / "+num2+" = "+String.valueOf(sum);
                    result.setText(text);
                }else{
                    float sum = (float)number2 / number1;
                    String text = num2+" / "+num1+" = "+String.valueOf(sum);
                    result.setText(text);
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = number1 * number2;
                String text = num1+" * "+num2+" = "+String.valueOf(sum);
                result.setText(text);
            }
        });

    }

}
