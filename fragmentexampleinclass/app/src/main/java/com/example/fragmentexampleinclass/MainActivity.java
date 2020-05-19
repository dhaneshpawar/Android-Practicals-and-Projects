package com.example.fragmentexampleinclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionListener {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.add(R.id.fragmentContainer,new FirstFragment());
        ft.commit();
    }

    @Override
    public void getData(Bundle bd) {
        String text = at1.getText().toString();
        Bundle db = new Bundle();
        db.putString("TEXT",text);
        ActionListener(getData());
    }
}
