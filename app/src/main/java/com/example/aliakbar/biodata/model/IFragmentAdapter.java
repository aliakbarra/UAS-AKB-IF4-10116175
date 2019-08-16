package com.example.aliakbar.biodata.model;

//minggu,11 Agustus 2019,10116175,Ali Akbar,AKB4/if4

import android.support.v4.app.Fragment;

public interface IFragmentAdapter {
    void add(Fragment Frag, String Title);
    Fragment getItem(int position);
    CharSequence getPageTitle(int position);
    int getCount();
}
