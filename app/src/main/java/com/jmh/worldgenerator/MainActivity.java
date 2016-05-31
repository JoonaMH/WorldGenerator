package com.jmh.worldgenerator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View.OnClickListener;
import java.util.Random;
import java.math.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
                Random r1 = new Random();
                double area = r1.nextInt(100000);
                Random r2 = new Random();
                double water = r2.nextInt(100);
                Random r3 = new Random();
                int air = r3.nextInt(2);
                Random r4 = new Random();
                int temperature = r4.nextInt(9);
                BigInteger inhabit1 = new BigInteger(25, new Random());
                BigInteger inhabit2 = new BigInteger(0, new Random());
                BigInteger inhabit3;
                BigInteger inhabit4;
                BigInteger inhabit5;
                BigInteger inhabit6;
                BigInteger inhabit7;


                BigInteger zero;
                zero = BigInteger.valueOf(0);
                BigInteger two;
                two = BigInteger.valueOf(2);
                BigInteger three;
                three = BigInteger.valueOf(3);
                BigInteger four;
                four = BigInteger.valueOf(4);
                BigInteger five;
                five = BigInteger.valueOf(5);
                BigInteger six;
                six = BigInteger.valueOf(6);
                BigInteger seven;
                seven = BigInteger.valueOf(7);
                BigInteger eight;
                eight = BigInteger.valueOf(8);
                BigInteger nine;
                nine = BigInteger.valueOf(9);
                BigInteger ten;
                ten = BigInteger.valueOf(10);

                TextView tv1 = (TextView) findViewById(R.id.textView);
                EditText et1 = (EditText) findViewById(R.id.editText);

                String p1 = getString(R.string.part1);
                String p2 = getString(R.string.part2);
                String p3 = getString(R.string.part3);
                String p4 = getString(R.string.part4);
                String p5 = getString(R.string.part5);
                String p6 = getString(R.string.part6);
                String p7 = getString(R.string.part7);

                double lArea = Math.round(area - area * (water / 100));

                String air2;
                String temperature2;
                String square = getString(R.string.square);
                String name = et1.getText().toString();
                String name2;

                if (air == 1) {
                    air2 = getString(R.string.breath1);
                } else {
                    air2 = getString(R.string.breath2);
                }
                if (air == 1) {
                    inhabit3 = inhabit1;
                } else {
                    inhabit3 = inhabit2;

                }
                inhabit4 = inhabit3.divide(ten);

                if (temperature == 0) {
                    temperature2 = getString(R.string.weather9);
                    inhabit5 = inhabit4;
                } else if (temperature == 1) {
                    temperature2 = getString(R.string.weather8);
                    inhabit5 = inhabit4.multiply(nine);
                } else if (temperature == 2) {
                    temperature2 = getString(R.string.weather7);
                    inhabit5 = inhabit4.multiply(eight);
                } else if (temperature == 3) {
                    temperature2 = getString(R.string.weather6);
                    inhabit5 = inhabit4.multiply(seven);
                } else if (temperature == 4) {
                    temperature2 = getString(R.string.weather5);
                    inhabit5 = inhabit4.multiply(six);
                } else if (temperature == 5) {
                    temperature2 = getString(R.string.weather4);
                    inhabit5 = inhabit4.multiply(five);
                } else if (temperature == 6) {
                    temperature2 = getString(R.string.weather3);
                    inhabit5 = inhabit4.multiply(four);
                } else if (temperature == 7) {
                    temperature2 = getString(R.string.weather2);
                    inhabit5 = inhabit4.multiply(three);
                } else {
                    temperature2 = getString(R.string.weather1);
                    inhabit5 = inhabit4.multiply(two);
                }

                inhabit6 = inhabit5.divide(ten);

                if (lArea == 0){
                    inhabit7 = inhabit6.multiply(zero);
                }   else if (lArea < 10000) {
                    inhabit7 = inhabit6.multiply(two);
                } else if (lArea < 20000) {
                    inhabit7 = inhabit6.multiply(three);
                } else if (lArea < 30000) {
                    inhabit7 = inhabit6.multiply(four);
                } else if (lArea < 40000) {
                    inhabit7 = inhabit6.multiply(five);
                } else if (lArea < 50000) {
                    inhabit7 = inhabit6.multiply(six);
                } else if (lArea < 60000) {
                    inhabit7 = inhabit6.multiply(seven);
                } else if (lArea < 70000) {
                    inhabit7 = inhabit6.multiply(eight);
                } else if (lArea < 80000) {
                    inhabit7 = inhabit6.multiply(nine);
                } else {
                    inhabit7 = inhabit5;
                }

                int area2 = (int) area;
                int water2 = (int) water;
                int lArea2 = (int) lArea;


                if (name.matches("")) {
                    name2 = getString(R.string.no_name);
                }else {
                    name2 = name.substring(0, 1).toUpperCase() + name.substring(1);
                }

                tv1.setText(p1+ " " +name2+ "\r\n" +p2+ " " +area2+ "" +square+ "\r\n" +p3+ " " +water2+ "\r\n" +p4+  " " +lArea2+ "" +square+ "\r\n" +p5+ " " +air2+ "\r\n" +p6+ " " +temperature2 + "\r\n" +p7+ " " +inhabit7);

        }

        });
        }

        }