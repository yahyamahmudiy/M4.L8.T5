package com.example.FragmentJava.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.FragmentJava.Adapter.ViewPagerAdapter;
import com.example.FragmentJava.Fragments.FirstFragment;
import com.example.FragmentJava.Fragments.SecondFragment;
import com.example.FragmentJava.Fragments.ThirdFragment;
import com.example.FragmentJava.Model.User;
import com.example.FragmentJava.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{
    static final String TAG = MainActivity.class.toString();
    ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));

        initViews();
    }
    void initViews(){
        viewPager = findViewById(R.id.viewpager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new FirstFragment(),"Contacts");
        viewPagerAdapter.add(new SecondFragment(),"Users");
        viewPagerAdapter.add(new ThirdFragment(),"Posts");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
/*void initViews(){
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.firstFrame,firstFragment).replace(R.id.secondFrame,secondFragment).commit();
    }
    /*@Override
    public void onFirstSend(User user) {
        secondFragment.updateSecondText(user);
    }
    @Override
    public void onSecondSend(User user) {
        firstFragment.updateFirstText(user);
    }*/