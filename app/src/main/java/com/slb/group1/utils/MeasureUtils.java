package com.slb.group1.utils;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 *尺寸工具类
 */
public class MeasureUtils {

    private MeasureUtils() {
        throw new AssertionError();
    }


    public static float dp2px(Context context, float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }

    public static float sp2px(Context context, float sp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp,
                context.getResources().getDisplayMetrics());
    }

    /**
     31      * 获取屏幕尺寸
     32      *
     33      * @param context 上下文
     34      * @return 屏幕尺寸像素值，下标为0的值为宽，下标为1的值为高
     35      */
     public static Point getScreenSize(Context context) {


               // 获取屏幕宽高
               WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
               Point screenSize = new Point();
               wm.getDefaultDisplay().getSize(screenSize);
               return screenSize;
           }

    public static int getMeasuredWidthWithMargins(View child) {
        final ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        return child.getMeasuredWidth() + lp.leftMargin + lp.rightMargin;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
//        activity.getWindowManager().getDefaultDisplay().getMetrics();
    }

    public static int[] getViewLocation(View view) {
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        return location;
    }
}
