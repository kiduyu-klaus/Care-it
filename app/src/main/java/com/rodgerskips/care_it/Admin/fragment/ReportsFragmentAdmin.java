package com.rodgerskips.care_it.Admin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rodgerskips.care_it.R;

/**
 * Created by Kiduyu klaus
 * on 16/09/2020 09:30 2020
 */
public class ReportsFragmentAdmin extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.admin_fragment_reports,container,false);


        return view;
    }
}
