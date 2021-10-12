package com.example.mufinki3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_RECIPEID="recipeId";
    public static final String EXTRA_RECIPECAT="recipeCat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener wybrany = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int i, long l) {
                String category = listView.getItemAtPosition(i).toString();

                Toast.makeText(MainActivity.this, category, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RecipeListActivity.class);
                intent.putExtra(EXTRA_RECIPEID, (int) i);
                intent.putExtra(EXTRA_RECIPECAT, category);
                startActivity(intent);
            }
        };
       //szukamy listy i przypisujemy jej zdarzenia z klikniecia
        ListView listView= findViewById(R.id.list);
        listView.setOnItemClickListener(wybrany);

    }
}