package com.example.frist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int myValue = 0;
    TextView myText;
    Button myButton;
    Button btPlus, btMinus;
    TextView txCount, txReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMinus = findViewById(R.id.btMinus);
        btPlus = findViewById(R.id.btPlus);
        txCount = findViewById(R.id.txCount);
        txReset = findViewById(R.id.txReset);

        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(myValue <=0){
                    txCount.setText("0");
                }
                else{
                    myValue = myValue -1;
                    txCount.setText(myValue +"");
                }


            }
        });
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myValue = myValue +1;
                txCount.setText(myValue +"");

            }
        });
        txReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myValue = 0;
                txCount.setText(myValue +"");
            }
        });

//        myButton = findViewById(R.id.button2);
//        myText = findViewById(R.id.mytext);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myText.setText("Wlocome Ankit");
////                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}