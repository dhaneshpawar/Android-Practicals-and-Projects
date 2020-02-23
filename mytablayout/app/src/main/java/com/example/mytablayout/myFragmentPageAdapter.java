package com.example.mytablayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class myFragmentPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentlist = new ArrayList<>();
    private final List<String> getMfragmenttitlelist = new ArrayList<String>();

    public myFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentlist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) getMfragmenttitlelist.get(position);
    }

    public void addFrag(Fragment fragment,String title) {
        mfragmentlist.add(fragment);
        getMfragmenttitlelist.add(title);
    }

}
