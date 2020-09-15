package com.example.critroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer diceRoll;
    private MediaPlayer oof;
    private MediaPlayer yah;
    private TextView critMsg;
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        critMsg = findViewById(R.id.diceMsg);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();

            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt( 20) + 1;
        diceRoll = MediaPlayer.create(this, R.raw.diceroll);
        diceRoll.start();

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                critMsg.setText("Critical Fail!");
                oof = MediaPlayer.create(this, R.raw.oof);
                oof.start();

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                critMsg.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                critMsg.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                critMsg.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                critMsg.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                critMsg.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                critMsg.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                critMsg.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                critMsg.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                critMsg.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                critMsg.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                critMsg.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                critMsg.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                critMsg.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                critMsg.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                critMsg.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                critMsg.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                critMsg.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                critMsg.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                critMsg.setText("Critical Success!");
                yah = MediaPlayer.create(this, R.raw.yah);
                yah.start();
                break;
        }
    }
}