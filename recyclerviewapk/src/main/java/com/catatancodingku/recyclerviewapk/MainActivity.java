package com.catatancodingku.recyclerviewapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] namaBuah = {
                "Alpukat",
                "Apel",
                "Ceri",
                "Durian",
                "Jambu",
                "Manggis",
                "Strawbery"

        };

        int[] gambarBuah = {
                R.drawable.alpukat,
                R.drawable.apel,

                R.drawable.ceri,
                R.drawable.durian,

                R.drawable.jambuair,
                R.drawable.manggis,

                R.drawable.strawberry
        };

        rvMain = findViewById(R.id.rv_main);
        RecyclerAdapter adapter = new RecyclerAdapter(namaBuah,gambarBuah);
        rvMain.setAdapter(adapter);

        //untuk mode Linear Horizontal
//        rvMain.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL,false));

        //untk mode Grid

        rvMain.setLayoutManager(new GridLayoutManager(this,2));
    }
}
