package com.practice.bean;

public class LimitConfiguration {

	private int min;
	private int max;

	public LimitConfiguration() {

	}

	public LimitConfiguration(int i, int j) {

		min = i;
		max = j;

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
