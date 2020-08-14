package com.example.ver1.ui.home;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return AestheticFragment.newInstance();
            case 1:
                return MakeupFragment.newInstance();
            case 2:
                return NailFragment.newInstance();
            case 3:
                return WaxFragment.newInstance();
            case 4:
                return IneyeFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    //상단 탭 레이아웃 텍스트 선언
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "에스테틱";
            case 1:
                return "메이크업";
            case 2:
                return "네일";
            case 3:
                return "왁싱";
            case 4:
                return "속눈썹";

            default:
                return null;
        }
    }
}
