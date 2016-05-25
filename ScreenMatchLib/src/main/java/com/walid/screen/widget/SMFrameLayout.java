package com.walid.screen.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date ： 2015/12/14 12:29
 */
public class SMFrameLayout extends FrameLayout implements InitParamsInterface {

	private Context context;
	private ViewParamsModel viewParamsModel;

	public SMFrameLayout(Context context) {
		super(context);
		this.context = context;
	}

	public SMFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
	}

	public SMFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
	}

	@Override
	public void setVisibility(int visibility) {
		if (getVisibility() != visibility) {
			super.setVisibility(visibility);
		}
	}

	public void initParams() {
		LayoutParamsUtils.genTemplateLayoutParams(context, this, viewParamsModel);
	}

}
