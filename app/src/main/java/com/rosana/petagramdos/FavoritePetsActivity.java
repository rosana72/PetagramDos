package com.rosana.petagramdos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class FavoritePetsActivity extends AppCompatActivity {

    private List<PetModel> petModelList;

    private RecyclerView recyclerFavoritePets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);

        Toolbar toolbarFavoritePets = findViewById(R.id.toolbarFavoritePets);
        toolbarFavoritePets.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recyclerFavoritePets = findViewById(R.id.recyclerFavoritePets);
        recyclerFavoritePets.setLayoutManager(new LinearLayoutManager(this));

        generatePets();
        initPetAdapter();
    }

    private void initPetAdapter() {
        PetAdapter petAdapter = new PetAdapter(petModelList);
        recyclerFavoritePets.setAdapter(petAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList .add(new PetModel(R.drawable.zeus, "zeus", 15));
        petModelList .add(new PetModel(R.drawable.sasha, "sasha", 16));
        petModelList .add(new PetModel(R.drawable.nero, "nero", 5));
        petModelList .add(new PetModel(R.drawable.thor, "thor", 17));
        petModelList .add(new PetModel(R.drawable.firu, "firu", 20));
    }
}







