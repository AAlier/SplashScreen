package com.example.samplesplashscreen.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samplesplashscreen.R;
import com.example.samplesplashscreen.model.Sample;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Sample> list = new ArrayList<>();
    private Listener listener;

    public Adapter(Listener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_note, parent, false);
        return new ViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void update(List<Sample> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public void addNewNote(Sample model) {
        this.list.add(0, model);
        notifyItemInserted(0);
    }

    public void remove(int position) {
        this.list.remove(position);
        notifyItemRemoved(position);
    }
}
