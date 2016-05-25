package com.walid.screenmatching;

import android.app.Activity;
import android.os.Bundle;

/**
 * Author: walid
 * Date ： 2016/1/7 18:00
 */
public abstract class BaseActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
		initData();
	}

	protected abstract void initView();

	protected abstract void initData();

}