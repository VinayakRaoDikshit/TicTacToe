package com.example.tictactoe_201b308_vinayakraodikshit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int player =1; //player 1
    public void load(View view) {
        ImageView v=(ImageView) view;

        if(player==1) {
            v.setImageResource(R.drawable.cross);
            player=0;
        }

        else {
            v.setImageResource(R.drawable.zero);
            player = 1;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}