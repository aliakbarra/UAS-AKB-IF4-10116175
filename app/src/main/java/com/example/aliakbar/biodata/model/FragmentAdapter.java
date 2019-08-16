/**
* senin,12 Agustus 2019,10116175,Ali Akbar,if4/AKB4
*/
package com.example.aliakbar.biodata.model;

//minggu,11 Agustus 2019,10116175,Ali Akbar,AKB4/if4

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter implements IFragmentAdapter {
    private List<Fragment> Fragment = new ArrayList<>();
    private List<String> NamePage = new ArrayList<>();

    public FragmentAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public void add(Fragment Frag, String Title) {
        Fragment.add(Frag);
        NamePage.add(Title);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return NamePage.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
