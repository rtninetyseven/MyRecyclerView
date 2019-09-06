package com.example.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GridHeroAdapter extends RecyclerView.Adapter<GridHeroAdapter.GridViewHolder> {
    private ArrayList<Hero> listHero;

    public GridHeroAdapter(ArrayList<Hero> list){
        this.listHero = list;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i){
    }
    @Override
    public int getItemCount(){
        return 0;
    }
    public class GridViewHolder extends RecyclerView.ViewHolder{
        public GridViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
