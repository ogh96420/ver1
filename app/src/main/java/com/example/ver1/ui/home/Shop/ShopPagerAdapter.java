package com.example.ver1.ui.home.Shop;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



public class ShopPagerAdapter extends FragmentPagerAdapter {

    public ShopPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return IntroFragment.newInstance();
            case 1:
                return MenuFragment.newInstance();
            case 2:
                return DesignerFragment.newInstance();
            case 3:
                return ReviewFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    //상단 탭 레이아웃 텍스트 선언
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "소개";
            case 1:
                return "메뉴";
            case 2:
                return "디자이너";
            case 3:
                return "리뷰";


            default:
                return null;
        }
    }
}