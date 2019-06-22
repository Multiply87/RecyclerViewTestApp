package com.example.recyclerviewtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    public RecyclerView numbersList;
    private NumbersAdapter numbersAdapter;

    /*public MainActivity() {
    }

    public MainActivity(RecyclerView numbersList) {
        this.numbersList = numbersList;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("1231231"+numbersList);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersList.findViewById(R.id.rv_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(layoutManager);

        numbersList.setHasFixedSize(true);

        numbersAdapter = new NumbersAdapter(100);
        numbersList.setAdapter(numbersAdapter);

    }
}
