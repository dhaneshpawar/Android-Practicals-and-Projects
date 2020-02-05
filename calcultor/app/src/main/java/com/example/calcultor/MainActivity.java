package com.example.calcultor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, buttonDot;
    TextView crunchifyEditText, myanswer;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;


    @SuppressWarnings("RedundantCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);

        buttonAdd = (Button) findViewById(R.id.buttonPlus);
        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonMul = (Button) findViewById(R.id.buttonMultiply);
        buttonDivision = (Button) findViewById(R.id.buttonDivide);
        buttonC = (Button) findViewById(R.id.buttonDelete);
        buttonEqual = (Button) findViewById(R.id.buttonequals);

        crunchifyEditText = (TextView) findViewById(R.id.mytextview);
        myanswer = (TextView) findViewById(R.id.myanswer);


        crunchifyEditText.setText("0");
        myanswer.setText("0");

        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText(".");
                }
                else
                {
                    crunchifyEditText.setText(crunchifyEditText.getText() + ".");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("0");
                }
                else
                {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "0");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("1");
                }
                else {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("2");
                }
                else {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("3");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("4");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("5");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("6");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("7");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("8");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("9");
                }
                else {

                    crunchifyEditText.setText(crunchifyEditText.getText() + "9");
                }
            }
        });



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("0");
                }
                else if(crunchifyAddition == false)
                {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(crunchifyEditText.getText() + " + ");
                }
                else
                {

                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("-");
                } else if(mSubtract == false) {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mSubtract = true;
                    crunchifyEditText.setText(crunchifyEditText.getText() + " - ");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("0");
                } else {

                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);}
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText.getText() == "0") {
                    crunchifyEditText.setText("0");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyDivision = true;
                    crunchifyEditText.setText(null);
                }}
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    String mystr = crunchifyEditText.getText().toString();
                    String[] myvals = mystr.split(" ");
                    int addtiond = Integer.parseInt(myvals[0])+Integer.parseInt(myvals[2]);
                    crunchifyEditText.setText(""+addtiond);
                    myanswer.setText(""+addtiond);
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    String mystr = crunchifyEditText.getText().toString();
                    String[] myvals = mystr.split(" ");
                    int addtiond = Integer.parseInt(myvals[0])-Integer.parseInt(myvals[2]);
                    crunchifyEditText.setText(""+addtiond);
                    myanswer.setText(""+addtiond);
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("0");
                myanswer.setText("0");
            }
        });


    }
}
