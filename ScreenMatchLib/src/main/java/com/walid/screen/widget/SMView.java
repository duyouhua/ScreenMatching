package com.walid.screen.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date ： 2016/1/30 18:35
 */
public class SMView extends View implements InitParamsInterface {

	private ViewParamsModel viewParamsModel;
	private Context context;

	public SMView(Context context) {
		super(context);
		this.context = context;
	}

	public SMView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
	}

	public SMView(Context context, AttributeSet attrs, int style) {
		super(context, attrs, style);
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
