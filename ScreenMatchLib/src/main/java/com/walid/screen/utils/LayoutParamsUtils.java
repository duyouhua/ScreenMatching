package com.walid.screen.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.walid.screen.R;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;

import java.math.BigDecimal;

/**
 * Author: walid
 * Date ： 2015/11/16 10:21
 */
public class LayoutParamsUtils {

	//设置默认屏幕宽高，也就是你们UI设计师设置图纸的模板手机
	public static final int TEMPLATE_HEIGHT = 1334;
	public static final int TEMPLATE_WIDTH = 750;
	public static int NO_PARAMS = -1;

	public static ViewParamsModel getLayoutParams(Context context, AttributeSet attrs) {

		ViewParamsModel viewParamsModel = new ViewParamsModel();
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SMLayoutParams);
		int heightPx = a.getInt(R.styleable.SMLayoutParams_SMLPHeight, NO_PARAMS);
		int widthPx = a.getInt(R.styleable.SMLayoutParams_SMLPWidth, NO_PARAMS);

		int topMarginPx = a.getInt(R.styleable.SMLayoutParams_SMLPMarginTop, NO_PARAMS);
		int bottomMarginPx = a.getInt(R.styleable.SMLayoutParams_SMLPMarginBottom, NO_PARAMS);
		int leftMarginPx = a.getInt(R.styleable.SMLayoutParams_SMLPMarginLeft, NO_PARAMS);
		int rightMarginPx = a.getInt(R.styleable.SMLayoutParams_SMLPMarginRight, NO_PARAMS);

		int paddingTopPx = a.getInt(R.styleable.SMLayoutParams_SMLPPaddingTop, NO_PARAMS);
		int paddingLeftPx = a.getInt(R.styleable.SMLayoutParams_SMLPPaddingLeft, NO_PARAMS);
		int paddingBottomPx = a.getInt(R.styleable.SMLayoutParams_SMLPPaddingBottom, NO_PARAMS);
		int paddingRightPx = a.getInt(R.styleable.SMLayoutParams_SMLPPaddingRight, NO_PARAMS);

		int xbTemplateHeight = a.getInt(R.styleable.SMLayoutParams_SMLPTemplateHeight, NO_PARAMS);
		int xbTemplateWidth = a.getInt(R.styleable.SMLayoutParams_SMLPTemplateWidth, NO_PARAMS);

		int xbLPMinWidth = a.getInt(R.styleable.SMLayoutParams_SMLPMinWidth, NO_PARAMS);
		int xbLPMinHeight = a.getInt(R.styleable.SMLayoutParams_SMLPMinHeight, NO_PARAMS);

		viewParamsModel.setHeightPx(heightPx);
		viewParamsModel.setWidthPx(widthPx);

		viewParamsModel.setTopMarginPx(topMarginPx);
		viewParamsModel.setLeftMarginPx(leftMarginPx);
		viewParamsModel.setRightMarginPx(rightMarginPx);
		viewParamsModel.setBottomMarginPx(bottomMarginPx);

		viewParamsModel.setPaddingLeftPx(paddingLeftPx);
		viewParamsModel.setPaddingTopPx(paddingTopPx);
		viewParamsModel.setPaddingRightPx(paddingRightPx);
		viewParamsModel.setPaddingBottomPx(paddingBottomPx);

		viewParamsModel.setTemplateHeight(xbTemplateHeight);
		viewParamsModel.setTemplateWidth(xbTemplateWidth);

		viewParamsModel.setXbLPMinWidth(xbLPMinWidth);
		viewParamsModel.setXbLPMinHeight(xbLPMinHeight);

		a.recycle();
		return viewParamsModel;
	}

	public static void genTemplateLayoutParams(Context context, View view, ViewParamsModel viewParamsModel) {
		if (viewParamsModel == null) {
			return;
		}
		int templateHeight = viewParamsModel.getTemplateHeight();
		int templateWidth = viewParamsModel.getTemplateWidth();
		if (NO_PARAMS == templateHeight) {
			viewParamsModel.setTemplateHeight(TEMPLATE_HEIGHT);
		}
		if (NO_PARAMS == templateWidth) {
			viewParamsModel.setTemplateWidth(TEMPLATE_WIDTH);
		}
		int screenWidth = Common.getScreenWidth(context);
		genTemplateLayoutParams(view, viewParamsModel, screenWidth);
	}

	//根据给定的模板宽高自动适应尺寸
	private static void genTemplateLayoutParams(View view, ViewParamsModel viewParamsModel, int screenWidth) {
		int heightPx = viewParamsModel.getHeightPx();
		int widthPx = viewParamsModel.getWidthPx();
		int topMarginPx = viewParamsModel.getTopMarginPx();
		int bottomMarginPx = viewParamsModel.getBottomMarginPx();
		int leftMarginPx = viewParamsModel.getLeftMarginPx();
		int rightMarginPx = viewParamsModel.getRightMarginPx();

		int paddingTopPx = viewParamsModel.getPaddingTopPx();
		int paddingLeftPx = viewParamsModel.getPaddingLeftPx();
		int paddingBottomPx = viewParamsModel.getPaddingBottomPx();
		int paddingRightPx = viewParamsModel.getPaddingRightPx();

		int templateHeight = viewParamsModel.getTemplateHeight();
		int templateWidth = viewParamsModel.getTemplateWidth();

		int xbLPMinWidth = viewParamsModel.getXbLPMinWidth();
		int xbLPMinHeight = viewParamsModel.getXbLPMinHeight();

		ViewGroup.MarginLayoutParams viewParams;
		if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
			viewParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
		} else {
			return;
		}
		if (NO_PARAMS != heightPx) {
			viewParams.height = (int) (screenWidth * round((double) heightPx / templateWidth, 3));
		}
		if (NO_PARAMS != widthPx) {
			viewParams.width = (int) (screenWidth * round((double) widthPx / templateWidth, 3));
		}

		if (NO_PARAMS != xbLPMinWidth) {
			view.setMinimumWidth(xbLPMinWidth);
		}

		if (NO_PARAMS != xbLPMinHeight) {
			view.setMinimumHeight(xbLPMinHeight);
		}

		if (NO_PARAMS != topMarginPx) {
			viewParams.topMargin = (int) (screenWidth * round(
					(double) topMarginPx / templateWidth, 3));
		}
		if (NO_PARAMS != bottomMarginPx) {
			viewParams.bottomMargin = (int) (screenWidth * round(
					(double) bottomMarginPx / templateWidth, 3));
		}
		if (NO_PARAMS != leftMarginPx) {
			viewParams.leftMargin = (int) (screenWidth * round(
					(double) leftMarginPx / templateWidth, 3));
		}
		if (NO_PARAMS != rightMarginPx) {
			viewParams.rightMargin = (int) (screenWidth * round(
					(double) rightMarginPx / templateWidth, 3));
		}
		if (NO_PARAMS == paddingTopPx) {
			paddingTopPx = view.getPaddingTop();
		} else {
			paddingTopPx = (int) (screenWidth * round(
					(double) paddingTopPx / templateWidth, 3));
		}

		if (NO_PARAMS == paddingBottomPx) {
			paddingBottomPx = view.getPaddingBottom();
		} else {
			paddingBottomPx = (int) (screenWidth * round(
					(double) paddingBottomPx / templateWidth, 3));
		}

		if (NO_PARAMS == paddingLeftPx) {
			paddingLeftPx = view.getPaddingLeft();
		} else {
			paddingLeftPx = (int) (screenWidth * round(
					(double) paddingLeftPx / templateWidth, 3));
		}

		if (NO_PARAMS == paddingRightPx) {
			paddingRightPx = view.getPaddingRight();
		} else {
			paddingRightPx = (int) (screenWidth * round(
					(double) paddingRightPx / templateWidth, 3));
		}

		view.setPadding(paddingLeftPx, paddingTopPx, paddingRightPx, paddingBottomPx);
		view.setLayoutParams(viewParams);
	}

	public static int templateTransSize2Current(Context context, double templatePx) {
		int screenWidth = Common.getScreenWidth(context);
		return (int) (screenWidth * round(templatePx / TEMPLATE_WIDTH, 3));
	}

	public static int templateTransSize2Current(Context context, double widthPx, double templateWidthPx) {
		if (templateWidthPx == NO_PARAMS || templateWidthPx < 0) {
			templateWidthPx = TEMPLATE_WIDTH;
		}
		int screenWidth = Common.getScreenWidth(context);
		return (int) (screenWidth * round(widthPx / templateWidthPx, 3));
	}

	public static double round(Double number, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = null == number ? new BigDecimal("0.0") : new BigDecimal(
				Double.toString(number));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static void init(Activity activity) {
		if (activity != null) {
			init(activity.getWindow().getDecorView());
		}
	}

	public static void init(View view) {
		if (view instanceof InitParamsInterface && !(view instanceof ViewGroup)) {
			((InitParamsInterface) view).initParams();
		} else if (view instanceof ViewGroup) {
			ViewGroup vg = (ViewGroup) view;
			if (vg instanceof InitParamsInterface) {
				((InitParamsInterface) vg).initParams();
			}
			int childCount = vg.getChildCount();
			for (int i = 0; i < childCount; i++) {
				init(vg.getChildAt(i));
			}
		}
	}

}
