package com.example.android.madrid;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    /** Context of the app */
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TOSEEFragment();
        } else if (position == 1){
            return new TOEATFragment();
        } else if (position == 2){
            return new TODOFragment();
        } else {
            return new ContactFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.item1);
        } else if (position == 1) {
            return mContext.getString(R.string.item2);
        } else if (position == 2) {
            return mContext.getString(R.string.item3);
        } else {
            return mContext.getString(R.string.item4);
        }
    }
}
