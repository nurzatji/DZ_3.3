package com.example.dz_33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz_33.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private java.util.ArrayList<String> ArrayList;
    private ArrayList<String >listGame =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        GameAdapter adapter = new GameAdapter(listGame);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        listGame.add("PUBG");
        listGame.add("GTA5");
        listGame.add("FREE FAIR");
        listGame.add("SHADOWRUN");
        listGame.add("THUMPER");
        listGame.add("TITANFULL");
        listGame.add("FALLOUT");
        listGame.add("TEKKEN7");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
        listGame.add("PUBG");
    }
}