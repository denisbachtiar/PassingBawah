package com.example.denisbachtiar.voli.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.denisbachtiar.voli.R;

public class FragmentAwalan extends Fragment {
    View view;
    public FragmentAwalan() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.awalan_fragment,container,false);
        return view;
    }
}
