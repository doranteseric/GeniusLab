package com.migpardo.geniuslab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Eric on 8/24/17.
 */

public class PerfectVertLinearLayout extends LinearLayout {


    public PerfectVertLinearLayout(Context context) {
        super(context);
    }

    public PerfectVertLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    public PerfectVertLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int blah = this.getChildCount();
        int adjustedHeight = (int) (MeasureSpec.getSize(heightMeasureSpec) * blah);
        int adjustedHeightMeasureSpec =
                MeasureSpec.makeMeasureSpec(adjustedHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, adjustedHeightMeasureSpec);

    }

}
