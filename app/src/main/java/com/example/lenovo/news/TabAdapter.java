package com.example.lenovo.news;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lenovo on 2017/6/22.
 */
public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        MainFragment fragment=new MainFragment();
        Bundle b=new Bundle();
        String title=Constant.TITLES[position];
        b.putString("TITLES",title);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Constant.TITLES[position];
    }

    @Override
    public int getCount() {
        return Constant.TITLES.length;
    }
}
