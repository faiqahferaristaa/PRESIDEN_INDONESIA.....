package com.f55121082.presidenindonesia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BiodataFragment extends Fragment {
    View view;
    public BiodataFragment () {
    }

    @Nullable
    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_biodata_fragment, container, false);
        return view;
    }
}