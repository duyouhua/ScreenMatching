package com.walid.screen.uimodel;


import com.walid.screen.utils.LayoutParamsUtils;

import java.io.Serializable;

/**
 * Author: walid
 * Date ： 2015/11/11 20:15
 */
public class ViewParamsModel implements Serializable {

	private int heightPx = LayoutParamsUtils.NO_PARAMS;
	private int widthPx = LayoutParamsUtils.NO_PARAMS;
	private int topMarginPx = LayoutParamsUtils.NO_PARAMS;
	private int bottomMarginPx = LayoutParamsUtils.NO_PARAMS;
	private int leftMarginPx = LayoutParamsUtils.NO_PARAMS;
	private int rightMarginPx = LayoutParamsUtils.NO_PARAMS;
	private int paddingTopPx = LayoutParamsUtils.NO_PARAMS;
	private int paddingLeftPx = LayoutParamsUtils.NO_PARAMS;
	private int paddingBottomPx = LayoutParamsUtils.NO_PARAMS;
	private int paddingRightPx = LayoutParamsUtils.NO_PARAMS;

	private int templateHeight = LayoutParamsUtils.NO_PARAMS;
	private int templateWidth = LayoutParamsUtils.NO_PARAMS;

	private int XbLPMinWidth = LayoutParamsUtils.NO_PARAMS;
	private int XbLPMinHeight = LayoutParamsUtils.NO_PARAMS;

	public int getHeightPx() {
		return heightPx;
	}

	public ViewParamsModel setHeightPx(int heightPx) {
		this.heightPx = heightPx;
		return this;
	}

	public int getWidthPx() {
		return widthPx;
	}

	public ViewParamsModel setWidthPx(int widthPx) {
		this.widthPx = widthPx;
		return this;
	}

	public int getTopMarginPx() {
		return topMarginPx;
	}

	public ViewParamsModel setTopMarginPx(int topMarginPx) {
		this.topMarginPx = topMarginPx;
		return this;
	}

	public int getBottomMarginPx() {
		return bottomMarginPx;
	}

	public ViewParamsModel setBottomMarginPx(int bottomMarginPx) {
		this.bottomMarginPx = bottomMarginPx;
		return this;
	}

	public int getLeftMarginPx() {
		return leftMarginPx;
	}

	public ViewParamsModel setLeftMarginPx(int leftMarginPx) {
		this.leftMarginPx = leftMarginPx;
		return this;
	}

	public int getRightMarginPx() {
		return rightMarginPx;
	}

	public ViewParamsModel setRightMarginPx(int rightMarginPx) {
		this.rightMarginPx = rightMarginPx;
		return this;
	}

	public int getPaddingTopPx() {
		return paddingTopPx;
	}

	public ViewParamsModel setPaddingTopPx(int paddingTopPx) {
		this.paddingTopPx = paddingTopPx;
		return this;
	}

	public int getPaddingLeftPx() {
		return paddingLeftPx;
	}

	public ViewParamsModel setPaddingLeftPx(int paddingLeftPx) {
		this.paddingLeftPx = paddingLeftPx;
		return this;
	}

	public int getPaddingBottomPx() {
		return paddingBottomPx;
	}

	public ViewParamsModel setPaddingBottomPx(int paddingBottomPx) {
		this.paddingBottomPx = paddingBottomPx;
		return this;
	}

	public int getPaddingRightPx() {
		return paddingRightPx;
	}

	public ViewParamsModel setPaddingRightPx(int paddingRightPx) {
		this.paddingRightPx = paddingRightPx;
		return this;
	}

	public int getTemplateHeight() {
		return templateHeight;
	}

	public ViewParamsModel setTemplateHeight(int templateHeight) {
		this.templateHeight = templateHeight;
		return this;
	}

	public int getTemplateWidth() {
		return templateWidth;
	}

	public ViewParamsModel setTemplateWidth(int templateWidth) {
		this.templateWidth = templateWidth;
		return this;
	}

	public int getXbLPMinWidth() {
		return XbLPMinWidth;
	}

	public ViewParamsModel setXbLPMinWidth(int xbLPMinWidth) {
		XbLPMinWidth = xbLPMinWidth;
		return this;
	}

	public int getXbLPMinHeight() {
		return XbLPMinHeight;
	}

	public ViewParamsModel setXbLPMinHeight(int xbLPMinHeight) {
		XbLPMinHeight = xbLPMinHeight;
		return this;
	}

}
