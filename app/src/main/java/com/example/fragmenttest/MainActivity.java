package com.example.fragmenttest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment1 f1=new Fragment1();
        fragmentTransaction.replace(R.id.container,f1);
        fragmentTransaction.commit();
    }
    public void clickReplace(View view){
        Fragment2 f2=new Fragment2();
        FragmentTransaction fm=fragmentManager.beginTransaction();
        fm.replace(R.id.container,f2);
        fm.commit();

    }
}
