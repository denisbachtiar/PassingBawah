package com.example.denisbachtiar.voli;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.denisbachtiar.voli.fragment_profil.FragmentAhliMateri;
import com.example.denisbachtiar.voli.fragment_profil.FragmentAhliMedia;
import com.example.denisbachtiar.voli.fragment_profil.FragmentMahasiswa;
import com.example.denisbachtiar.voli.fragment_profil.FragmentPembimbing;

public class ProfilActivity extends AppCompatActivity {

    private TabLayout tabLayout;
//    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        tabLayout = (TabLayout) findViewById(R.id.tablayoutid);
//        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentMahasiswa(),"Mahasiswa");
        adapter.AddFragment(new FragmentPembimbing(),"Pembimbing");
        adapter.AddFragment(new FragmentAhliMateri(),"Ahli Materi");
        adapter.AddFragment(new FragmentAhliMedia(),"Ahli Media");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
