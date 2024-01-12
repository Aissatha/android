package com.example.aissatha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View listView;
    private View searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Sponge Bob","Bob",R.drawable.a));
        items.add(new Item("BARBIE MARIPOSA","Barbie\n",R.drawable.b));
        items.add(new Item("WISH","Wish\n",R.drawable.c));
        items.add(new Item("WINX","Winx\n",R.drawable.d));
        items.add(new Item("ARTHUR AND MINIMOYS","Arthur\n",R.drawable.e));
        items.add(new Item("MIRACULOUS","Marinette\n",R.drawable.f));
        items.add(new Item("MIKEY MOUSE","Mikey", R.drawable.g));
        items.add(new Item("JESSIE","Jessie\n",R.drawable.h));
        items.add(new Item("VIOLETTA","Violetta\n",R.drawable.i));
        items.add(new Item("ANT MAN","Ant man\n",R.drawable.j));
        items.add(new Item("LES MINIJUSTICIERS","Les minijusticiers\n",R.drawable.k));
        items.add(new Item("TOTALIE SPIES","Totally spies\n",R.drawable.l));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    };
}