package com.example.denisbachtiar.voli.fragment_profil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.example.denisbachtiar.voli.R;

public class FragmentAhliMateri extends Fragment {
    View view;
    public FragmentAhliMateri() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.ahlimateri_fragment,container,false);
        return view;
    }
}
