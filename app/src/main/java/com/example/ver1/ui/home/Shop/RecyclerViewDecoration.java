package com.example.ver1.ui.home.Shop;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewDecoration extends RecyclerView.ItemDecoration {
    private final int divright;
    private final int divleft;

    public RecyclerViewDecoration(int divright){
        this.divright=divright;
        this.divleft=divright;
    }

    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
        super.getItemOffsets(outRect,view,parent,state);
        outRect.right = divright;
        outRect.left = divleft;
    }
}
