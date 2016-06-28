package com.kekej.dragsplitimage;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * 作者：Charles(zqikai) on 2016/6/27 16:19
 * <p/>
 * 邮箱：charleszhuqikai@foxmail.com
 * <p/>
 * 类描述:一个支持子空间随意拖动的控件
 */
public class VHDLayout extends LinearLayout{

    private ViewDragHelper mDragger;

    public VHDLayout(Context context) {
        super(context);
    }

    public VHDLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        mDragger = ViewDragHelper.create(this,1.0f, new ViewDragHelper.Callback() {

            @Override
            public boolean tryCaptureView(View child, int pointerId) {
                return true;
            }

            @Override
            public int clampViewPositionHorizontal(View child, int left, int dx) {

                final int leftBound = getPaddingLeft();
                final int rightBound = getWidth() - child.getWidth() - leftBound;

                final int newLeft = Math.min(Math.max(left, leftBound), rightBound);

                return newLeft;
            }

            @Override
            public int clampViewPositionVertical(View child, int top, int dy) {
                return top;
            }
        });


    }

    public VHDLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return mDragger.shouldInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mDragger.processTouchEvent(event);
        return true;
    }
}
