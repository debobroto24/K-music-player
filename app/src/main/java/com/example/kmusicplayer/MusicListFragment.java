package com.example.kmusicplayer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kmusicplayer.AllAdapters.MusicListRecyclerAdapter;

public class MusicListFragment extends Fragment {


    RecyclerView recyclerView;
    MusicListRecyclerAdapter recyclerAdapter;
    public MusicListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_music_list, container, false);


       recyclerView =  view.findViewById(R.id.musicListRecycleView);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       recyclerAdapter = new MusicListRecyclerAdapter();
       recyclerView.setAdapter(recyclerAdapter);
        return view;
    }
}