package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int pscore2 = 0 ;
    int cscore2 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Pchoice = findViewById(R.id.PSelection);
        TextView Cchoice = findViewById(R.id.Cselection);

        ImageView Pimage = findViewById(R.id.Pselectionimage);
        ImageView Cimage = findViewById(R.id.Cselectionimage);




        TextView Pscore = findViewById(R.id.Pscore);
        TextView Cscore= findViewById(R.id.Cscore);

        Button rock = findViewById(R.id.rocky);
        Button m89 = findViewById(R.id.m89);
        Button paper = findViewById(R.id.Paper);



        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Pchoice.setText("Rock");
                Pimage.setImageResource(R.drawable.the_rock__1_);
                Random int1 = new Random();

                int one = int1.nextInt(3);

                if (one == 0 ) {
                    Cchoice.setText("Rock");
                    Cimage.setImageResource(R.drawable.the_rock__1_);
                }else if (one ==1) {
                    Cchoice.setText("Paper");
                    Cimage.setImageResource(R.drawable.screenshot_1__1_);
                    cscore2++;
                }else {
                    Cchoice.setText("Scissors");
                    Cimage.setImageResource(R.drawable.m89__1_);
                    pscore2++;
                }
                Pscore.setText(String.valueOf(pscore2));
                Cscore.setText(String.valueOf(cscore2));
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Pchoice.setText("Paper");
                Pimage.setImageResource(R.drawable.screenshot_1__1_);
                Random int1 = new Random();

                int one = int1.nextInt(3);

                if (one == 0 ) {
                    Cchoice.setText("Rock");
                    Cimage.setImageResource(R.drawable.the_rock__1_);
                    pscore2++;
                }else if (one ==1) {
                    Cchoice.setText("Paper");
                    Cimage.setImageResource(R.drawable.screenshot_1__1_);

                }else {
                    Cchoice.setText("Scissors");
                    Cimage.setImageResource(R.drawable.m89__1_);
                    cscore2++;
                }
                Pscore.setText(String.valueOf(pscore2));
                Cscore.setText(String.valueOf(cscore2));
            }
        });
        m89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Pchoice.setText("Scissors");
                Pimage.setImageResource(R.drawable.m89__1_);
                Random int1 = new Random();

                int one = int1.nextInt(3);

                if (one == 0 ) {
                    Cchoice.setText("Rock");
                    Cimage.setImageResource(R.drawable.the_rock__1_);
                    cscore2++;
                }else if (one ==1) {
                    Cchoice.setText("Paper");
                    Cimage.setImageResource(R.drawable.screenshot_1__1_);
                    pscore2++;
                }else {
                    Cchoice.setText("Scissors");
                    Cimage.setImageResource(R.drawable.m89__1_);

                }
                Pscore.setText(String.valueOf(pscore2));
                Cscore.setText(String.valueOf(cscore2));

            }
        });


    }
}