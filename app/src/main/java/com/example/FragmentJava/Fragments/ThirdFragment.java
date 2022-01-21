package com.example.FragmentJava.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.FragmentJava.Adapter.ContactsAdapter;
import com.example.FragmentJava.Adapter.PostsAdapter;
import com.example.FragmentJava.Model.Posts;
import com.example.FragmentJava.Model.User;
import com.example.FragmentJava.R;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    ArrayList<Posts> posts;
    Context context;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView3);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        PostsAdapter postsAdapter = new PostsAdapter(context,posts);
        recyclerView.setAdapter(postsAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        posts = new ArrayList<>();

        for (int i=0;i<=20;i++){
            posts.add(new Posts(R.mipmap.ic_man,"Yahya Mahmudiy","Beautiful Nature",R.drawable.img));
            posts.add(new Posts(R.mipmap.ic_man,"Yahya Mahmudiy","Beautiful Bridge",R.drawable.img_1));
            posts.add(new Posts(R.mipmap.ic_man,"Yahya Mahmudiy","Beautiful Cave",R.drawable.img_2));
        }

    }
}
