package com.walid.screen.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.walid.screen.R;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date: 2015/10/13.
 */
public class SMButton extends TextView implements InitParamsInterface {

	private ViewParamsModel viewParamsModel;
	private Context context;

	public SMButton(Context context) {
		super(context);
		this.context = context;
	}

	public SMButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		initAttrs(context, attrs);
	}

	public SMButton(Context context, AttributeSet attrs, int style) {
		super(context, attrs, style);
		initAttrs(context, attrs);
	}

	private void initAttrs(Context context, AttributeSet attrs) {
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SMButton);
		float textSizePx = a.getFloat(R.styleable.SMButton_SMButtonSize, 30);
		boolean isBold = a.getBoolean(R.styleable.SMButton_SMButtonBold, false);
		getPaint().setFakeBoldText(isBold);
		a.recycle();
		setTextSize(textSizePx);
	}

	@Override
	public void setTextSize(float textSizePx) {
		textSizePx = LayoutParamsUtils.templateTransSize2Current(context, textSizePx);
		setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizePx);
	}

	public void initParams() {
		LayoutParamsUtils.genTemplateLayoutParams(context, this, viewParamsModel);
	}

	@Override
	public void setVisibility(int visibility) {
		if (getVisibility() != visibility) {
			super.setVisibility(visibility);
		}
	}

}
