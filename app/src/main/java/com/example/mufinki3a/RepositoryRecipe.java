package com.example.mufinki3a;

import java.util.ArrayList;

public class RepositoryRecipe {

    public static final Recipe[] recpies = {
            new Recipe("mufinki", 3 , "maka, masło, jajka, ...",R.drawable.mufinki ),
            new Recipe("Pierniczki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Drożdżówki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Rogaliki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Ptysie",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Gofry",1, "<li>mąka</li><li>cukier</li><li>mlek</li><li>olej</li>", R.drawable.mufinki),
            new Recipe("Lody",1, "<li>mąka</li><li>cukier</li><li>mlek</li><li>olej</li>", R.drawable.mufinki)

    };


    public static ArrayList<Recipe> wybierz(int i){
        ArrayList<Recipe> wybrane = new ArrayList<Recipe>();

        for (Recipe rec: recpies){
            if (rec.getCategory() == i)
                wybrane.add(rec);
        }

        return wybrane;

    };

}
