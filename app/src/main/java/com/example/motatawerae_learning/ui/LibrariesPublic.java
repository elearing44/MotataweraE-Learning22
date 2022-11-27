package com.example.motatawerae_learning.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.motatawerae_learning.R;
import com.example.motatawerae_learning.libraries_public.C_customLibraries;
import com.example.motatawerae_learning.libraries_public.LibrariesAdapter;
import com.example.motatawerae_learning.libraries_public.setOnClickLisenar;

import java.util.ArrayList;

public class LibrariesPublic extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libraries_public);

        rv = findViewById(R.id.libraries_rv_books);

        ArrayList<C_customLibraries> libraries = new ArrayList();
        libraries.add(new C_customLibraries("Java advanset", "cnmvcv"));
        libraries.add(new C_customLibraries("C# advanset", "cnmvcv"));
        libraries.add(new C_customLibraries("C advanset", "cnmvcv"));
        libraries.add(new C_customLibraries("C++ advanset", "cnmvcv"));
        libraries.add(new C_customLibraries("Paython advanset", "cnmvcv"));


        LibrariesAdapter adapter = new LibrariesAdapter(libraries,this, new setOnClickLisenar() {
            @Override
            public void onClick(int v) {
                Toast.makeText(LibrariesPublic.this, "", Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView.LayoutManager lm = new GridLayoutManager(this,1);

        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        rv.setHasFixedSize(true);



    }
}