package com.example.mytablayout;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SchemeFragment extends Fragment {

    public SchemeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_scheme, null);
        TextView but2 = root.findViewById(R.id.credits2);
        TextView but4 = root.findViewById(R.id.credits4);
        TextView but6 = root.findViewById(R.id.credits6);
        TextView but8 = root.findViewById(R.id.credits8);
        TextView but10 = root.findViewById(R.id.credits10);
        TextView but12 = root.findViewById(R.id.credits12);

        String exammarks[] = getResources().getStringArray(R.array.exammarks);

        but2.setText(exammarks[0]);
        but4.setText(exammarks[1]);
        but6.setText(exammarks[2]);
        but8.setText(exammarks[3]);
        but10.setText(exammarks[4]);
        but12.setText(exammarks[5]);

        // Inflate the layout for this fragment
        return root;
    }

}
