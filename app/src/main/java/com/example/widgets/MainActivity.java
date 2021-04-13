package com.example.widgets;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            final EditText MyEditText = (EditText) findViewById(R.id.edit_text);//get the id for edit text
            Button displayText = (Button) findViewById(R.id.id_button);//get the id for button
            displayText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (MyEditText.getText().toString() != null)//check whether the entered text is not null
                    {
                        Toast.makeText(getApplicationContext(), MyEditText.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                    }
                }
            });
        }

        //button
        //Button id_button = (Button) findViewById(R.id.id_button);//get id of button
        //id_button.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Toast.makeText(getApplicationContext(), "You've clicked the button", Toast.LENGTH_LONG).show();//display the text of button
        //    }
        //});
}


