package com.example.denisbachtiar.voli;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.denisbachtiar.voli.bottom_nav_moda.TeksFragment;
import com.example.denisbachtiar.voli.bottom_nav_moda.VideoFragment;

public class ModaActivity extends AppCompatActivity
        implements TeksFragment.OnFragmentInteractionListener, VideoFragment.OnFragmentInteractionListener{

//    private TabLayout tabLayout;
//    private AppBarLayout appBarLayout;
//    private ViewPager viewPager;

    private static final String TAG = ModaActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moda);
//        VideoView video = (VideoView) findViewById(R.id.video);
//        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.pidio;
//        Uri uri = Uri.parse(videoPath);
//        video.setVideoURI(uri);
//
//        MediaController mediaController = new MediaController(this);
//        video.setMediaController(mediaController);
//        mediaController.setAnchorView(video);



//        tabLayout = (TabLayout) findViewById(R.id.tablayoutid);
//        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
//        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//
//        adapter.AddFragment(new FragmentPengenalan(),"Pengertian");
//        adapter.AddFragment(new FragmentAwalan(),"Awalan");
//        adapter.AddFragment(new FragmentPelaksanaan(),"Pelaksanaan");
//        adapter.AddFragment(new FragmentAkhiran(),"Akhiran");
//
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);
        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.bottom_navigation_items);
        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.main_container, new TeksFragment()).commit();

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.menu_teks:
                        fragment = new TeksFragment();
                        break;
                    case R.id.menu_video:
                        fragment = new VideoFragment();
                        break;

                }
                final android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });


    }
}
