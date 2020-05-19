package com.example.myapplication;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        appBarLayout=(AppBarLayout)findViewById(R.id.appbar);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        Intent intent=getIntent();
        String pos=intent.getExtras().getString("course");
        Toolbar toolbar=findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            switch(pos) {
                case "and":
                    toolbar.setTitle("Android");
                    this.setActionBar(toolbar);
                    break;
                case "ci":
                    toolbar.setTitle("Computaional Intelligence");
                    this.setActionBar(toolbar);
                    break;
                case "csa":
                    toolbar.setTitle("Cloud services and applications");
                    this.setActionBar(toolbar);
                    break;
                case "ml":
                    toolbar.setTitle("Machine Learning");
                    this.setActionBar(toolbar);
                    break;
                default:
                    toolbar.setTitle("Android");
                    this.setActionBar(toolbar);
                    break;
            }
        }
        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentScheme(pos),"Scheme");
        adapter.AddFragment(new FragmentCourse(pos),"Course");
        adapter.AddFragment(new FragmentPractical(pos),"Practical");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
SchemeFragment.java