package pro.vylgin.app;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerColorAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;

    public ViewPagerColorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        switch (arg0) {
            case 0:
                return new FragmentTabColor(Color.RED);
            case 1:
                return new FragmentTabColor(Color.GREEN);
            case 2:
                return new FragmentTabColor(Color.BLUE);
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
