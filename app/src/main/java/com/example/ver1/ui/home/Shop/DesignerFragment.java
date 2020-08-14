package com.example.ver1.ui.home.Shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class DesignerFragment extends Fragment {

    private View view;

    public static DesignerFragment newInstance() {
        DesignerFragment designerFragment = new DesignerFragment();
        return designerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabshop_designer, container, false);
        return view;
    }
}