package com.walid.screen.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Author: walid
 * Date ： 2015/10/21 15:27
 */
public class Common {

	/**
	 * 获得系统屏幕宽
	 */
	public static int getScreenWidth(Context context) {
		return getDisplayMetrics(context).widthPixels;
	}

	/**
	 * 获得系统屏幕高
	 */
	public static int getScreenHeight(Context context) {
		return getDisplayMetrics(context).heightPixels;
	}

	/**
	 * 获得系统屏幕信息
	 */
	public static DisplayMetrics getDisplayMetrics(Context context) {
		DisplayMetrics dm = new DisplayMetrics();
		WindowManager windowMgr = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		windowMgr.getDefaultDisplay().getMetrics(dm);
		return dm;
	}

}
