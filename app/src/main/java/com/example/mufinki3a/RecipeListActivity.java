package com.example.mufinki3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

//uzupełnienie text view
        String category = getIntent().getExtras().get(MainActivity.EXTRA_RECIPECAT).toString();

        TextView textView = findViewById(R.id.textView2);
        textView.setText(category);

//uzupełnienie listView
        int id =(Integer) getIntent().getExtras().get(MainActivity.EXTRA_RECIPEID);

        ArrayAdapter <Recipe> recipeArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                RepositoryRecipe.wybierz(id)
        );

        ListView listview = findViewById(R.id.lista_wybrana);
        listview.setAdapter(recipeArrayAdapter);

    }
}