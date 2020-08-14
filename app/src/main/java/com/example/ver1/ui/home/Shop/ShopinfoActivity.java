package com.example.ver1.ui.home.Shop;

        import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentPagerAdapter;
        import androidx.viewpager.widget.ViewPager;

        import com.example.ver1.R;
        import com.example.ver1.ui.home.ViewPagerAdapter;
        import com.google.android.material.tabs.TabLayout;

public class ShopinfoActivity extends AppCompatActivity {

    private FragmentPagerAdapter fragmentPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopinfo);

        ViewPager viewPager = findViewById(R.id.tab_shopvp);
        fragmentPagerAdapter = new ShopPagerAdapter(getSupportFragmentManager());


        TabLayout tabLayout = findViewById(R.id.tab_Shop);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
