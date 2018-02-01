package com.trivediinfoway.pinterestlistview;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by TI A1 on 26-10-2017.
 */
public class TabListener implements ActionBar.TabListener {
    private Fragment fragment;
    public TabListener(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.activity_main, fragment);
    }
    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }
    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
}
