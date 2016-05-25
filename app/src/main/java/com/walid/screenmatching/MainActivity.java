package com.walid.screenmatching;

import butterknife.ButterKnife;
import com.walid.screen.utils.LayoutParamsUtils;

/**
 * Author: walid
 * Date ： 2015/10/16 18:36
 */
public class MainActivity extends BaseActivity{


	@Override
	protected void initView() {
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
		LayoutParamsUtils.init(this);
	}

	@Override
	protected void initData() {

	}

}
