package com.example.prizrentouristguide;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TheMosque extends AppCompatActivity
{
    //Widget Variables
    TextView        textViewStuffToDo;
    TextView        textViewLink;
    ImageButton     imageButtonMap;
    Button          buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_mosque);

        textViewStuffToDo   = findViewById(R.id.textViewStuffToDo);
        textViewLink        = findViewById(R.id.textViewLink);
        imageButtonMap      = findViewById(R.id.imageButtonMap);
        buttonReturn        = findViewById(R.id.buttonReturn);

        textViewLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Prizren/@42.2234138,20.6995781,13z/data=!3m1!4b1!4m5!3m4!1s0x1353950a12f4301f:0xda0e2e9b8d3d5850!8m2!3d42.2171438!4d20.7436495"));
                startActivity(browserIntent);
            }
        });



        buttonReturn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }
}
