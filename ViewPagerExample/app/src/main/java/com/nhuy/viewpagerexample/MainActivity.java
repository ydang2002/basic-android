package com.nhuy.viewpagerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.support.design.widget.TabLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private PlaceholderFragment.SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new PlaceholderFragment.SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    public static class PlaceholderFragment extends Fragment {

        private static final String KEY_COLOR = "key_color";

        public PlaceholderFragment() {
        }

        // Method static dạng singleton, cho phép tạo fragment mới, lấy tham số đầu vào để cài đặt màu sắc.
        public static PlaceholderFragment newInstance(int color) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(KEY_COLOR, color);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.rl_fragment);

            TextView textView = (TextView) rootView.findViewById(R.id.section_label);

            /**
             * Số 1: Màu xanh.
             * Số 2: Màu đỏ.
             * Số 3: Màu vàng.
             */
            switch (getArguments().getInt(KEY_COLOR)) {
                case 1:
                    relativeLayout.setBackgroundColor(Color.GREEN);
                    textView.setText("Kteam" + "GREEN");
                    break;
                case 2:
                    relativeLayout.setBackgroundColor(Color.RED);
                    textView.setText("Kteam" + "RED");
                    break;
                case 3:
                    relativeLayout.setBackgroundColor(Color.YELLOW);
                    textView.setText("Kteam" + " YELLOW");
                    break;
                default:
                    relativeLayout.setBackgroundColor(Color.GREEN);
                    textView.setText("Kteam" + "GREEN");
                    break;
            }



            return rootView;
        }

        public class SectionsPagerAdapter extends FragmentPagerAdapter {

            public SectionsPagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public Fragment getItem(int position) {
                // position + 1 vì position bắt đầu từ số 0.
                return PlaceholderFragment.newInstance(position + 1);
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "SECTION 1";
                    case 1:
                        return "SECTION 2";
                    case 2:
                        return "SECTION 3";
                }
                return null;
            }
        }

    }

}