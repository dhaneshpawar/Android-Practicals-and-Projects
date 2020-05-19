package com.example.mytablayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                SchemeFragment schemeFragment = new SchemeFragment();
                return schemeFragment;


            case 1:
                ContentFragment contentFragment = new ContentFragment();
                return contentFragment;

            case 2:
                PracticalFragment practicalFragment = new PracticalFragment();
                return practicalFragment;

            case 3:
                PracticalFragment practicalFragment2 = new PracticalFragment();
                return practicalFragment2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable

    @Override
    public CharSequence getPageTitle(int i)
    {
        switch (i){


            case 0: return "Scheme";

            case 1: return "Content";

            case 2: return "Practical";

            case 3: return "nothing";


            default:
                return null;
        }

    }
}
