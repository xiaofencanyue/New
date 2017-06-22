package com.example.lenovo.news;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends FragmentActivity {

    private TabPageIndicator mPageIndicator;
    private ViewPager mViewPager;
    private FragmentPagerAdapter fragePagerAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        fragePagerAdater = new TabAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(fragePagerAdater);
        mPageIndicator.setViewPager(mViewPager, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    private void initUI() {
        mPageIndicator = (TabPageIndicator) findViewById(R.id.page_indicator);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
    }
}
