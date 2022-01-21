package com.example.FragmentJava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.FragmentJava.Model.Posts;
import com.example.FragmentJava.Model.User;
import com.example.FragmentJava.R;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Posts> posts;

    public PostsAdapter(Context context, ArrayList<Posts> posts){
        this.context = context;
        this.posts = posts;
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_posts_layout,parent,false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Posts post = posts.get(position);

        if(holder instanceof MemberViewHolder){
            ImageView iv_profile = ((MemberViewHolder)holder).iv_profile;
            ImageView iv_post = ((MemberViewHolder)holder).iv_post;
            TextView tv_name = ((MemberViewHolder)holder).tv_name;
            TextView tv_surname = ((MemberViewHolder)holder).tv_surname;

            iv_profile.setImageResource(post.getProfile());
            tv_name.setText(post.getName());
            tv_surname.setText(post.getSurname());
            iv_post.setImageResource(post.getImage());
        }
    }

    public static class MemberViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView iv_profile,iv_post;
        public TextView tv_name;
        public TextView tv_surname;

        public MemberViewHolder(View v){
            super(v);
            this.view = v;

            iv_profile = view.findViewById(R.id.iv_profile);
            tv_name = view.findViewById(R.id.tv_name);
            tv_surname = view.findViewById(R.id.tv_surname);
            iv_post = view.findViewById(R.id.iv_image);
        }
    }
}
