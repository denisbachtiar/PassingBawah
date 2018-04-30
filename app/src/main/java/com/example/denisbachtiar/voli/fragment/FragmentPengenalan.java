package com.example.denisbachtiar.voli.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.denisbachtiar.voli.R;

public class FragmentPengenalan extends Fragment {
    View view;
    public FragmentPengenalan() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.pengenalan_fragment,container,false);
       findview(view);
        return view;
    }


    public void findview (View view) {
//        VideoView video = (VideoView) view.findViewById(R.id.video);
//        String videoPath = "android.resource://" + view.getContext().getPackageName() + "/" + R.raw.pidio;
//        Uri uri = Uri.parse(videoPath);
//        video.setVideoURI(uri);
//        video.start();
//        MediaController mediaController = new MediaController(getActivity());
//        video.setMediaController(mediaController);
//        mediaController.setAnchorView(video);
//        if (isVisible())
//        {
//            video.pause();
//        }
//        if (!isVisible())
//        {
//            video.start();
//        }
    }

//    public void setUserVisibleHint( boolean isVisibleToUser){
//
//        super.setUserVisibleHint(isVisibleToUser);
//        if (this.isVisible())
//        {
//            if (!isVisibleToUser)
//            {
//                video.pause();
//            }
//            if (isVisibleToUser)
//            {
//                video.start();
//            }
//        }
//    }
}
