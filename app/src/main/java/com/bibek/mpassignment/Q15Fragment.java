package com.bibek.mpassignment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Q15Fragment extends Fragment {

    String details;

    public Q15Fragment(String details) {
        this.details = details;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.q15_fragment, container, false);
        TextView textView = view.findViewById(R.id.txtDetails);
        textView.setText(details);
        return view;
    }
}
