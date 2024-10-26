package com.biniyam.predictthenumber;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    Random randomGenerator;
    public void buttonClicked(View view){
        EditText guessedNumber = findViewById(R.id.guessedNumber);
        int guessNumber = Integer.parseInt( guessedNumber.getText().toString() );
        String message = "";
        if( guessNumber > randomNumber){
            message = "Too high!";

        }else if( guessNumber < randomNumber){
            message = "Too low!";
        }else {
            message = "You got it!";
            randomNumber = randomGenerator.nextInt(21);
        }
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
}