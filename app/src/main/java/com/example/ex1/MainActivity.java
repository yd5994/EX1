package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
    }
    public void next(View View){
        Random rn =new Random();
        int num=rn.nextInt(3)+1;
        button.setText("Click num: "+num);
        switch (num){
            case 1:
                imageView.setImageResource(R.drawable.picture2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.p2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.p3);

        }
    }

}