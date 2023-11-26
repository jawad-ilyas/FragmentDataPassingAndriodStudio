package com.example.fragmentsandlistview;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.NavigableMap;


// when we need to use list frag then we extend the class with
// listFragment instread of the List fragment

public class ListFrag extends ListFragment {

    public ListFrag() {
        // Required empty public constructor
    }

    public interface ItemSelected
    {
        void onItemClicked(int index);
    }

    ItemSelected myActivity ;

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_list, container, false);
//    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myActivity = (ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<String> names =  new ArrayList<>();
        names.add("jawad");
        names.add("ilyas");
        names.add("mughal");
        names.add("Ahmad");

        setListAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, names));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        myActivity.onItemClicked(position);
    }
}