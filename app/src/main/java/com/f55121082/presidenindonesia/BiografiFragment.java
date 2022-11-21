package com.f55121082.presidenindonesia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BiografiFragment extends Fragment {
    View view;
    public BiografiFragment () {
    }

    @Nullable
    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_biografi_fragment, container, false);
        return view;
    }
}