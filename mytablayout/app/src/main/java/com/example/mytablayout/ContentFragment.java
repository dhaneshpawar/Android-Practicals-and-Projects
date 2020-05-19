package com.example.mytablayout;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {
//    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
//            "WebOS","Ubuntu","Windows7","Max OS X"};

    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_content, null);


        String mobileArray[] = getResources().getStringArray(R.array.contentofchapters);


        ArrayList<String> arr_content  = new ArrayList<>();

        for(int i=0;i<mobileArray.length;i++){
            arr_content.add(mobileArray[i]);
        }

        // Inflate the layout for this fragment

        ArrayAdapter itemsAdapter =
                new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1, arr_content);

        ListView lv = root.findViewById(R.id.mobile_list);

        lv.setAdapter(itemsAdapter);

        return root;
    }

}
