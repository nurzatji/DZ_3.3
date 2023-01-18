package com.example.dz_33;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameViewHolder extends RecyclerView.ViewHolder {
    private TextView game_edit;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
game_edit = itemView.findViewById(R.id.text_view);

    }
public  void bind(String name ){
        game_edit.setText(name);
}

}
