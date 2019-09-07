package com.example.lowerorhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void generateRandomNumber(){
        randomNumber = (int)(Math.random() * 20 + 1);
    }

    public void guessed_it(View view){
        String message;

        EditText guessed_number = (EditText) findViewById(R.id.guessed_number);
        int guessed_int = Integer.parseInt(guessed_number.getText().toString());
        if(guessed_int < randomNumber){
            message = "Higher";
        }else if(guessed_int > randomNumber) {
            message = "Lower";
        }else{
            message = "You got it!!!";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
