package com.example.dz_33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter  extends RecyclerView.Adapter <GameViewHolder>{
    private ArrayList<String>nameList ;

    public GameAdapter(ArrayList<String> nameList) {
        this.nameList = nameList;
    }


    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
holder.bind(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
