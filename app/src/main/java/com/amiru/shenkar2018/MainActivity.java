package com.amiru.shenkar2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calcScreen;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, bminus ,bmolty , bdiv , bequal, bclear;
    int var1, var2;
    boolean plus,minus,mol,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        bplus = (Button) findViewById(R.id.buttonPlus);
        bminus = (Button) findViewById(R.id.buttonMinus);
        bmolty = (Button) findViewById(R.id.buttonMultiplication);
        bdiv = (Button) findViewById(R.id.buttonDivide);
        bequal = (Button) findViewById(R.id.buttonEqual);
        bclear = (Button) findViewById(R.id.buttonClear);

        calcScreen = (TextView) findViewById(R.id.calcScreen);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"7");

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText(calcScreen.getText()+"0");

            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Integer.parseInt((calcScreen.getText()+""));
                plus = true;
                calcScreen.setText(null);
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Integer.parseInt((calcScreen.getText() + ""));
                minus = true;
                calcScreen.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Integer.parseInt((calcScreen.getText()+""));
                 div = true;
                calcScreen.setText(null);
            }
        });
        bmolty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Integer.parseInt((calcScreen.getText()+""));
                mol = true;
                calcScreen.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Integer.parseInt((calcScreen.getText()+""));
                if (plus == true){
                    calcScreen.setText(var1+var2+"");
                    plus=false;
                }
                if (minus == true){
                    calcScreen.setText(var1-var2+"");
                    minus=false;
                }
                if (div == true){
                    calcScreen.setText(var1/var2+"");
                    div=false;
                }
                if (mol == true){
                    calcScreen.setText(var1*var2+"");
                    mol=false;
                }
            }
        });
        bclear.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("");
            }
        }));

    }

    public void onDigitClicked(View view) {

        // "tag" is an optional string you can add to any view to use if you need
        // here I set it in the layout file, to make sure I don't try to cast operators to Integer
        Object tag = view.getTag();

        if ("num".equals(tag)) {
            String digitClicked = (String) ((Button) view).getText();
            String currentText = (String) calcScreen.getText();
            int currentValue = Integer.parseInt(currentText);
            int newValue = 10 * currentValue + Integer.parseInt(digitClicked);
            calcScreen.setText(String.valueOf(newValue));
        }
    }
}
