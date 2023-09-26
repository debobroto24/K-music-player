package com.example.kmusicplayer.AllAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kmusicplayer.R;

public class MusicListRecyclerAdapter extends RecyclerView.Adapter<MusicListRecyclerAdapter.ViewHolder> {

    @NonNull
    @Override
    public MusicListRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicListRecyclerAdapter.ViewHolder holder, int position) {
       holder.artist.setText("artist");
       holder.title.setText("title");
//       holder.img.setImageResource("@drawable/artist.com");
    }

    @Override
    public int getItemCount() {
        return  10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout rl;
        TextView artist, title;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             rl = itemView.findViewById(R.id.musicrow);
             artist = itemView.findViewById(R.id.musicArtist);
             title = itemView.findViewById(R.id.musicTitle);
             img = itemView.findViewById(R.id.img);
        }
    }
}
