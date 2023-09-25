package com.example.kmusicplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MusicViewPagerAdapter extends FragmentPagerAdapter {
    public MusicViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position ==1 ){
            return new MusicListFragment();
        }else{
            return new AlbumFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0 ){
            return "Musics";
        }else{
            return "Albums";
        }
//        return super.getPageTitle(position);
    }
}
