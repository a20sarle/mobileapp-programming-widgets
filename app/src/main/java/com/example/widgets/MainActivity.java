package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button
        Button id_button = (Button) findViewById(R.id.id_button);//get id of button
        id_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've clicked the button", Toast.LENGTH_LONG).show();//display the text of button
            }
        });
    }
}



