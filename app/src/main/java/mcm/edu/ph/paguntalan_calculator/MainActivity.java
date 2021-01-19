package mcm.edu.ph.paguntalan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonSCREEN, buttonDIV, buttonMUL, buttonPLUS, buttonCLEAR, buttonMIN, buttonEQUAL, buttonDOT, buttonDEL;
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonSCREEN = findViewById(R.id.buttonSCREEN);
        buttonDIV = findViewById(R.id.buttonDIV);
        buttonMUL = findViewById(R.id.buttonMUL);
        buttonPLUS = findViewById(R.id.buttonPLUS);
        buttonCLEAR = findViewById(R.id.buttonCLEAR);
        buttonMIN = findViewById(R.id.buttonMIN);
        buttonEQUAL = findViewById(R.id.buttonEQUAL);
        buttonDOT = findViewById(R.id.buttonDOT);
        buttonDEL = findViewById(R.id.buttonDEL);
    }
}