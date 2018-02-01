package com.trivediinfoway.pinterestlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by TI A1 on 26-10-2017.
 */
public class TabActivity extends android.app.TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_screen);
        TabHost tabHost = getTabHost();
        Intent intent = new Intent().setClass(this, ActivityStack.class);
        TabHost.TabSpec spec = tabHost.newTabSpec("tabId").setIndicator("Temp", getResources().getDrawable(R.mipmap.ic_launcher));
        spec.setContent(intent);

        tabHost.addTab(spec);

        Intent intent1 = new Intent().setClass(this, ActivityStack.class);
        TabHost.TabSpec spec1 = tabHost.newTabSpec("tabId").setIndicator("Temp", getResources().getDrawable(R.mipmap.ic_launcher));
        spec1.setContent(intent1);
        tabHost.addTab(spec1);

        tabHost.setCurrentTab(0);
    }
}
