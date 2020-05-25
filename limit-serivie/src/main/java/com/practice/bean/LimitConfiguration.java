package com.practice.bean;

public class LimitConfiguration {

	private int min;
	private int max;
	private String serverName;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public LimitConfiguration() {

	}

	public LimitConfiguration(int i, int j,String s) {

		min = i;
		max = j;
		serverName=s;

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
