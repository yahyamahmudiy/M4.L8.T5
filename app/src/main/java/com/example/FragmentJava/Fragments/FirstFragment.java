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
import com.example.FragmentJava.Model.User;
import com.example.FragmentJava.R;
import java.util.ArrayList;

public class FirstFragment extends Fragment {
    ArrayList<User> users;
    Context context;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        ContactsAdapter contactsAdapter = new ContactsAdapter(context,users);
        recyclerView.setAdapter(contactsAdapter);

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        users = new ArrayList<>();

        for (int i=0;i<=20;i++){
            users.add(new User(R.mipmap.ic_call,"Yahya","+998946700071"));
        }

    }
}
