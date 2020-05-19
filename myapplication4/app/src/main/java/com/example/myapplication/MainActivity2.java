package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView=(ListView)findViewById(R.id.listview);
        String[] nameslist=this.getResources().getStringArray(R.array.coursenames);
        ArrayList<String> coursenames=new ArrayList<>();
        for(String s:nameslist){
            coursenames.add(s);
        }
        ArrayAdapter arrayAdapter=new
                ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,coursenames);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String position1="";
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                switch (position){
                    case 0:
                        position1=position1+"and";
                        break;
                    case 1:
                        position1=position1+"csa";
                        break;
                    case 2:
                        position1=position1+"ci";
                        break;
                    case 3:
                        position1=position1+"ml";
                        break;
                }
                intent.putExtra("course",position1);
                startActivity(intent);
            }
        });
    }
}