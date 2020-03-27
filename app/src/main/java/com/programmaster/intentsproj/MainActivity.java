package com.programmaster.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText et1, et2;
    //int num1, num2;
    String num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";

        int duration = Toast.LENGTH_SHORT;
        // How long the toast message will lasts

        Toast toast = Toast.makeText(context, message, duration); toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        button = (Button) findViewById(R.id.button);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();

                i.putExtra("Value",num1);
                i.putExtra("Value1",num2);



                startActivity(i);
                finish();

            }
        });

    }

    public void displayMassage(View view) {
        Toast.makeText(MainActivity.this,"Sending Message...",Toast.LENGTH_SHORT).show();

    }
}
