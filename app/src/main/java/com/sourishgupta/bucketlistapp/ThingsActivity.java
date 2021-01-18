package com.sourishgupta.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);
        RecyclerView thingsRecyclerView = findViewById(R.id.recycler_view_things);

        Item[] items = {
                new Item("Sky Diving", "Jump from a plane thousands of feet in the air!!"),
                new Item("kayaking", "Row a boat through turbid waters!!"),
                new Item("Fishing", "Catch some of the biggest fish in the ocean!!"),
                new Item("Guitar", "Learning to play the guitar by a campfire!!"),
                new Item("Camping", "Setting up camp under the vast night sky!!")
        };

        ItemsAdapter adapter = new ItemsAdapter(items);
        thingsRecyclerView.setAdapter(adapter);

    }
}