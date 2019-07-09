package in.yayd.eray.tabfragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private final String[] TITLES = {"Mavi", "Kırmızı"};

    PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return MaviFragment.newInstance();
        else
            return KirmiziFragment.newInstance();
    }

}
