package com.walid.screen.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;
import com.walid.screen.R;
import com.walid.screen.interfaces.InitParamsInterface;
import com.walid.screen.uimodel.ViewParamsModel;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date ： 2015/11/12 14:55
 */
public class SMEdittext extends EditText implements InitParamsInterface {

	private ViewParamsModel viewParamsModel;
	private Context context;

	public SMEdittext(Context context) {
		super(context);
		this.context = context;
	}

	public SMEdittext(Context context, AttributeSet attrs) {
		super(context, attrs);
		initAttrs(context,attrs);
	}

	public SMEdittext(Context context, AttributeSet attrs, int style) {
		super(context, attrs, style);
		initAttrs(context,attrs);
	}

	private void initAttrs(Context context, AttributeSet attrs) {
		this.context = context;
		viewParamsModel = LayoutParamsUtils.getLayoutParams(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SMTextView);
		float textSizePx = a.getFloat(R.styleable.SMEdittext_SMEditTextSize, 30);
		boolean bold = a.getBoolean(R.styleable.SMEdittext_SMEditTextBold, false);
		getPaint().setFakeBoldText(bold);
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
