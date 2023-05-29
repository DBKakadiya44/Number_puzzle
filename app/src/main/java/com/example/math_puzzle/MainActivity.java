package com.example.math_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView t[] = new TextView[9];
    TextView r,ttt;
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();

    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.r);
        ttt = findViewById(R.id.ttt);

        for (int i = 0; i < t.length; i++) {
            int id = getResources().getIdentifier("t" + i, "id", getPackageName());
            t[i] = findViewById(id);
        }

        t[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[1].getText().equals("")){
                    t[1].setText(t[0].getText());
                    t[0].setText("");
                    win();
                }
                if(t[3].getText().equals("")){
                    t[3].setText(t[0].getText());
                    t[0].setText("");
                    win();
                }
            }
        });
        t[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[0].getText().equals("")){
                    t[0].setText(t[1].getText());
                    t[1].setText("");
                    win();
                }
                if(t[2].getText().equals("")){
                    t[2].setText(t[1].getText());
                    t[1].setText("");
                    win();
                }
                if(t[4].getText().equals("")){
                    t[4].setText(t[1].getText());
                    t[1].setText("");
                    win();
                }
            }
        });
        t[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[1].getText().equals("")){
                    t[1].setText(t[2].getText());
                    t[2].setText("");
                    win();
                }
                if(t[5].getText().equals("")){
                    t[5].setText(t[2].getText());
                    t[2].setText("");
                    win();
                }
            }
        });
        t[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[0].getText().equals("")){
                    t[0].setText(t[3].getText());
                    t[3].setText("");
                    win();
                }
                if(t[4].getText().equals("")){
                    t[4].setText(t[3].getText());
                    t[3].setText("");
                    win();
                }
                if(t[6].getText().equals("")){
                    t[6].setText(t[3].getText());
                    t[3].setText("");
                    win();
                }
            }
        });
        t[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[1].getText().equals("")){
                    t[1].setText(t[4].getText());
                    t[4].setText("");
                    win();
                }
                if(t[3].getText().equals("")){
                    t[3].setText(t[4].getText());
                    t[4].setText("");
                    win();
                }
                if(t[5].getText().equals("")){
                    t[5].setText(t[4].getText());
                    t[4].setText("");
                    win();
                }
                if(t[7].getText().equals("")){
                    t[7].setText(t[4].getText());
                    t[4].setText("");
                    win();
                }
            }
        });
        t[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[2].getText().equals("")){
                    t[2].setText(t[5].getText());
                    t[5].setText("");
                    win();
                }
                if(t[4].getText().equals("")){
                    t[4].setText(t[5].getText());
                    t[5].setText("");
                    win();
                }
                if(t[8].getText().equals("")){
                    t[8].setText(t[5].getText());
                    t[5].setText("");
                    win();
                }
            }
        });
        t[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[3].getText().equals("")){
                    t[3].setText(t[6].getText());
                    t[6].setText("");
                    win();
                }
                if(t[7].getText().equals("")){
                    t[7].setText(t[6].getText());
                    t[6].setText("");
                    win();
                }
            }
        });
        t[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[6].getText().equals("")){
                    t[6].setText(t[7].getText());
                    t[7].setText("");
                    win();
                }
                if(t[4].getText().equals("")){
                    t[4].setText(t[7].getText());
                    t[7].setText("");
                    win();
                }
                if(t[8].getText().equals("")){
                    t[8].setText(t[7].getText());
                    t[7].setText("");
                    win();
                }
            }
        });
        t[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t[6].getText().equals("")){
                    t[6].setText(t[8].getText());
                    t[8].setText("");
                    win();
                }
                if(t[7].getText().equals("")){
                    t[7].setText(t[8].getText());
                    t[8].setText("");
                    win();
                }
            }
        });


        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttt.setText("");

                t[0].setEnabled(true);
                t[1].setEnabled(true);
                t[2].setEnabled(true);
                t[3].setEnabled(true);
                t[4].setEnabled(true);
                t[5].setEnabled(true);
                t[6].setEnabled(true);
                t[7].setEnabled(true);
                t[8].setEnabled(true);

                cnt = 0;
                list.clear();
                for (int i = 0; i < t.length; i++) {
                    if (cnt < 9) {
                        while (true) {
                            int max = 10, min = 1;
                            int r = new Random().nextInt(max - min) + min;
                            if(list.isEmpty())
                            {
                                list.add(r);
                                cnt++;
                            }
                            //int r1 = new Random().nextInt(max - min) + min;
                            if (!list.contains(r)) {
                                list.add(r);
                                cnt++;
                                break;
                            }
                        }
                    }
                }
                for (int i=0;i<list.size();i++)
                {

                    System.out.println("List"+list.get(i));
                    t[i].setText(""+list.get(i));
                    if(list.get(i)==9)
                    {
                        t[i].setText("");
                    }
                }

            }
        });
    }

    private void win() {

        if(t[0].getText().equals(1)&&t[1].getText().equals(2)&&t[2].getText().equals(3)&&t[3].getText().equals(4)&&t[4].getText().equals(5)&&t[5].getText().equals(6)&&t[6].getText().equals(7)&&t[7].getText().equals(8));
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);

            ttt.setText("Congratulations ! You Win...");
    }
}