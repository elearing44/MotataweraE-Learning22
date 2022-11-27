package com.example.motatawerae_learning.BooksTheSubject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.motatawerae_learning.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.view_holder> {
    ArrayList<C_Books> books;
    RecyclarOnClickListenar listenar;

    public BooksAdapter(ArrayList<C_Books> books, RecyclarOnClickListenar listenar) {
        this.books = books;
        this.listenar = listenar;
    }

    @NonNull
    @NotNull
    @Override
    public view_holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_book, null, false);


        return new view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull view_holder holder, int position) {
        C_Books book = books.get(position);
        int id = book.getId();
        holder.tv_name.setText(book.getName());
        holder.tv_description.setText(book.getDescription());
        holder.tv_book_type.setText(book.getBook_type());

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class view_holder extends RecyclerView.ViewHolder {

        TextView tv_id;
        TextView tv_name;
        TextView tv_description;
        TextView tv_book_type;

        public view_holder(@NonNull @NotNull View itemView) {
            super(itemView);

//            tv_id=itemView.findViewById(R)
            tv_name = itemView.findViewById(R.id.custom_book_tv_name);
            tv_name = itemView.findViewById(R.id.custom_book_tv_description);
            tv_name = itemView.findViewById(R.id.custom_book_tv_book_type);
        }
    }

}
