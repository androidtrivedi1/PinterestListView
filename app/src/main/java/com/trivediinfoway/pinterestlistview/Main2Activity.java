package com.trivediinfoway.pinterestlistview;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    ActionBar.Tab bmwTab, fordTab, toyotaTab;
    Fragment bmwFragmentTab = new BmwFragmentTab();
    Fragment toyotaFragmentTab = new ToyotaFragmentTab();
    Fragment fordFragmentTab = new FordFragmentTab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();

        ((AppCompatActivity)Main2Activity.this).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)Main2Activity.this).getSupportActionBar().setDisplayShowTitleEnabled(false);
        //((AppCompatActivity)Main2Activity.this).getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bmwTab = actionBar.newTab().setIcon(R.mipmap.ic_launcher);
        toyotaTab = actionBar.newTab().setIcon(R.mipmap.ic_launcher);
        fordTab = actionBar.newTab().setIcon(R.mipmap.ic_launcher);
        bmwTab.setTabListener(new TabListener(bmwFragmentTab));
        toyotaTab.setTabListener(new TabListener(toyotaFragmentTab));
        fordTab.setTabListener(new TabListener(fordFragmentTab));

        actionBar.addTab(bmwTab);
        actionBar.addTab(toyotaTab);
        actionBar.addTab(fordTab);
    }
}


