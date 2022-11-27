package com.example.motatawerae_learning.libraries_public;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motatawerae_learning.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LibrariesAdapter extends RecyclerView.Adapter<LibrariesAdapter.view_holder> {
 ArrayList<C_customLibraries> libraries;
 Context context;
 setOnClickLisenar lisenar,lisenar2;


    public LibrariesAdapter(ArrayList<C_customLibraries> libraries, Context context ,setOnClickLisenar lisenar) {
        this.libraries = libraries;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public view_holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_libraries,null);
        view_holder vh=new view_holder(v);

//        new view_holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_libraries,parent,false ));
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull view_holder holder, int position) {
        C_customLibraries lb=libraries.get(position);

        holder.tv_name_book.setText(lb.getName_book());
        holder.tv_description.setText(lb.getDescription());
        holder.btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "open", Toast.LENGTH_SHORT).show();
                Toast.makeText(context, holder.tv_name_book.getText(), Toast.LENGTH_SHORT).show();

            }
        });
        holder.btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "download", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return libraries.size();
    }

    class view_holder extends RecyclerView.ViewHolder
    {
        TextView tv_name_book;
        TextView tv_description;
        Button btn_open,btn_download;

        public view_holder(@NonNull @NotNull View itemView) {
            super(itemView);
            tv_name_book=itemView.findViewById(R.id.custom_libraries_tv_name_book);
            tv_description=itemView.findViewById(R.id.custom_libraries_tv_description);
            btn_open =itemView.findViewById(R.id.custom_libraries_btn_open);
            btn_download =itemView.findViewById(R.id.custom_libraries_btn_download);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    lisenar.onClick(0);
//                }
//            });

        }
    }

}
