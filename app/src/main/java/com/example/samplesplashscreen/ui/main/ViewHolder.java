package com.example.samplesplashscreen.ui.main;

import android.view.View;
import android.widget.TextView;

import com.example.samplesplashscreen.R;
import com.example.samplesplashscreen.model.Sample;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private Listener listener;

    public ViewHolder(@NonNull View itemView, Listener listener) {
        super(itemView);
        this.listener = listener;
        textView = itemView.findViewById(R.id.textView);
    }

    public void bind(Sample note) {
        textView.setText(note.getTitle());
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                listener.onClickItem(getAdapterPosition());
                return true;
            }
        });
    }
}
