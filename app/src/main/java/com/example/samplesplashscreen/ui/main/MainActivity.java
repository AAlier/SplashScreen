package com.example.samplesplashscreen.ui.main;

import android.os.Bundle;
import android.view.View;

import com.example.samplesplashscreen.R;
import com.example.samplesplashscreen.model.Sample;
import com.example.samplesplashscreen.util.ResourceManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements Listener{
    private final static String SAMPLE = "sample.json";
    private RecyclerView recyclerView;
    private Adapter adapter;
    private FloatingActionButton button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter = new Adapter(this));
        readFileFromAssets();

        button = findViewById(R.id.addNote);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sample model = new Sample();
                model.setId(adapter.getItemCount());
                model.setTitle(UUID.randomUUID().toString());
                adapter.addNewNote(model);

                // Scroll to first position
                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        });
    }

    private void readFileFromAssets() {
        String json = ResourceManager.readFileFromAssets(this, SAMPLE);
        Type typeOfObjectsListNew = new TypeToken<List<Sample>>() {}.getType();
        List<Sample> list = new Gson().fromJson(json, typeOfObjectsListNew);
        adapter.update(list);
    }

    @Override
    public void onClickItem(int position) {
        adapter.remove(position);
    }
}
