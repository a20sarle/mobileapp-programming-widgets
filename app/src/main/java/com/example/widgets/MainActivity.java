package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button MyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.id_edittext);

        //button - ver2
        MyButton = (Button) findViewById(R.id.id_button);//get id of button
        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "You wrote:  " + editText.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*
        //button - ver1
        Button id_button = (Button) findViewById(R.id.id_button);//get id of button
        id_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've clicked the button", Toast.LENGTH_LONG).show();//display the text of button
            }
        });*/
    }
}



