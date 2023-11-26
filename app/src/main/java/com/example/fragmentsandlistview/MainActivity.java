package com.example.fragmentsandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {


    TextView tvDetail;

    ArrayList<String> phoneNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        phoneNumbers = new ArrayList<>();

        phoneNumbers.add("0");
        phoneNumbers.add("1");
        phoneNumbers.add("2");
        phoneNumbers.add("3");

        tvDetail.setText(phoneNumbers.get(0));
    }


    void init()
    {

        tvDetail = findViewById(R.id.tvDetail);
    }

    @Override
    public void onItemClicked(int index) {
        tvDetail.setText(phoneNumbers.get(index));
    }
}