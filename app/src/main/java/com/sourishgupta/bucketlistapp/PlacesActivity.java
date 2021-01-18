package com.sourishgupta.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        RecyclerView placesRecyclerView = findViewById(R.id.recycler_view_places);

        Item[] items = {
                new Item("Taj Mahal", "Witness the love of Shah Jahan firsthand!!"),
                new Item("Burj Khalifa", "Watch the view from the tallest tower in the world!!"),
                new Item("Las Vegas", "Have a night to remember (Or forget!!)"),
                new Item("Paris", "Roam about in the city of LOVE!!"),
                new Item("New York", "Admire the busy city of New York!!")
        };

        ItemsAdapter adapter = new ItemsAdapter(items);
        placesRecyclerView.setAdapter(adapter);
    }
}