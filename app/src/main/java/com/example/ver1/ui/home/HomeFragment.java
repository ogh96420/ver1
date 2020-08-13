package com.example.ver1.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;
import com.example.ver1.ui.home.Astetic.AsteticActivity;

import java.util.Arrays;
import java.util.List;


public class HomeFragment extends Fragment {

    private View view;
    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
    private String result;
    private Intent intent1;
    private List<String> items = Arrays.asList("반영구", "에스테틱", "왁싱", "네일", "속눈썹");

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);


        btn1 = view.findViewById(R.id.btn_ast);
        btn2 = view.findViewById(R.id.btn_half);
        btn3 = view.findViewById(R.id.btn_nail);
        btn4 = view.findViewById(R.id.btn_wax);
        btn5 = view.findViewById(R.id.btn_in);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), AsteticActivity.class);
                startActivity(in);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), AsteticActivity.class);
                startActivity(in);

            }
        });

        return view;
    }

    public void onCreate(Bundle savedInstanceState, LayoutInflater inflater, ViewGroup container){
        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.fragment_home, container, false);

        SearchView searchView = getView().findViewById(R.id.search_button);
        final TextView resultTextView = getView().findViewById(R.id.text_home);
        resultTextView.setText(getResult());
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                resultTextView.setText(search(newText));
                return true;
            }
        });
    }

    private String search(String query){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            if (item.toLowerCase().contains(query.toLowerCase())) {
                sb.append(item);
                if (i != items.size() - 1) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    private String getResult(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < items.size(); i++){
            String item = items.get(i);
            sb.append(item);
            if(i != items.size() -1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
