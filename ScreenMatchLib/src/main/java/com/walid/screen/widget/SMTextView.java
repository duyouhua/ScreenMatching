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
 * Date ： 2015/11/10 10:44
 */
public class SMTextView extends TextView implements InitParamsInterface {

	private ViewParamsModel viewParamsModel;
	private Context context;

	public SMTextView(Context context) {
		super(context);
		this.context = context;
	}

	public SMTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initAttrs(context, attrs);
	}

	public SMTextView(Context context, AttributeSet attrs, int style) {
		super(context, attrs, style);
		initAttrs(context, attrs);
	}

	private void initAttrs(Context context, AttributeSet attrs) {
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SMTextView);
		float textSizePx = a.getFloat(R.styleable.SMTextView_SMTextViewSize, 30);
		boolean isBold = a.getBoolean(R.styleable.SMTextView_SMTextViewBold, false);
		boolean isIncludeFontPadding = a.getBoolean(R.styleable.SMTextView_SMTextViewIncludeFontPadding, false);
		getPaint().setFakeBoldText(isBold);
		setIncludeFontPadding(isIncludeFontPadding);
		a.recycle();
		initTextSize(textSizePx);
	}

	public void initTextSize(float textSizePx) {
		textSizePx = LayoutParamsUtils.templateTransSize2Current(context, textSizePx);
		setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizePx);
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
