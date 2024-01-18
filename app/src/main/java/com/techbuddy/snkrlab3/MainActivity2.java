package com.techbuddy.snkrlab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    CardView nikeCard;
    CardView adidasCard;
    CardView converseCard;
    CardView newbalanceCard;
    CardView sketchersCard;
    CardView rebookCard;

    ImageView back;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        nikeCard = findViewById(R.id.nikeCard);
        adidasCard = findViewById(R.id.adidasCard);
        converseCard = findViewById(R.id.converseCard);
        sketchersCard = findViewById(R.id.sketchersCard);
        newbalanceCard = findViewById(R.id.newbalanceCard);
        rebookCard = findViewById(R.id.rebookCard);

        // Initialize SearchView
        searchView = findViewById(R.id.editText);

        // Set up search functionality
        setupSearch();

        // Handle brand card click events
        handleBrandCardClickEvents();
    }

    private void setupSearch() {
        // Set a query listener for the search view
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle the search query submission (if needed)
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle the search query change
                filterBrands(newText);
                return true;
            }
        });
    }

    private void filterBrands(String query) {
        // Implement brand filtering logic based on the search query
        nikeCard.setVisibility(queryContainsBrand("Nike") ? View.VISIBLE : View.GONE);
        adidasCard.setVisibility(queryContainsBrand("Adidas") ? View.VISIBLE : View.GONE);
        converseCard.setVisibility(queryContainsBrand("Converse") ? View.VISIBLE : View.GONE);
        newbalanceCard.setVisibility(queryContainsBrand("New Balance") ? View.VISIBLE : View.GONE);
        sketchersCard.setVisibility(queryContainsBrand("Sketchers") ? View.VISIBLE : View.GONE);
        rebookCard.setVisibility(queryContainsBrand("Rebook") ? View.VISIBLE : View.GONE);
    }

    private boolean queryContainsBrand(String brand) {
        // Helper method to check if the search query contains the specified brand
        return brand.toLowerCase().contains(searchView.getQuery().toString().toLowerCase());
    }

    private void handleBrandCardClickEvents() {
        nikeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(NikeActivity.class);
            }
        });

        adidasCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(AdidasActivity.class);
            }
        });

        converseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(ConverseActivity.class);
            }
        });

        sketchersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(SketchersActivity.class);
            }
        });

        newbalanceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(NewbalanceActivity.class);
            }
        });

        rebookCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToBrandActivity(RebookActivity.class);
            }
        });
    }

    private void navigateToBrandActivity(Class<?> brandActivityClass) {
        Intent intent = new Intent(MainActivity2.this, brandActivityClass);
        startActivity(intent);
    }
}



