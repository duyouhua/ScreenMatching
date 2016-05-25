package com.walid.screen.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date ： 2015/11/17 12:44
 */
public class SMImageView extends ImageView implements InitParamsInterface {

	private ViewParamsModel viewParamsModel;
	private Context context;

	public SMImageView(Context context) {
		super(context);
		this.context = context;
	}

	public SMImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
	}

	public SMImageView(Context context, AttributeSet attrs, int style) {
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
