package com.example.prizrentouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    //Program Constants

    //Widget Variables
    Button  buttonCastle;
    Button  buttonPark;
    Button  buttonTheMosque;
    Button  buttonCityMuseum;
    Button  buttonRestaurants;
    Button  buttonHotels;
    Button  buttonComment;


    //Non-Widget Variables


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCastle       = findViewById(R.id.buttonCastle);
        buttonPark = findViewById(R.id.buttonPark);
        buttonTheMosque    = findViewById(R.id.buttonTheMosque);
        buttonCityMuseum = findViewById(R.id.buttonCityMuseum);
        buttonRestaurants    = findViewById(R.id.buttonRestaurants);
        buttonHotels   = findViewById(R.id.buttonHotels);
        buttonComment = findViewById(R.id.buttonComment);

        buttonComment.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), demo.class);
                startActivity(intent);
            }
        });

        buttonCastle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), Castle.class);
                startActivity(intent);
            }
        });

        buttonPark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), Park.class);
                startActivity(intent);
            }
        });

        buttonTheMosque.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), TheMosque.class);
                startActivity(intent);
            }
        });

        buttonCityMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), CityMuseum.class);
                startActivity(intent);
            }
        });


        buttonRestaurants.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), Restaurants.class);
                startActivity(intent);
            }
        });

        buttonHotels.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(), Hotels.class);
                startActivity(intent);
            }
        });

    }
}
