package com.cnwr.justin;

public class Batting {

	private final String first;
	private final String last;
	private final int totalG;

	public Batting(String first, String last, int totalG) {
		this.first = first;
		this.last = last;
		this.totalG = totalG;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public int getTotalG() {
		return totalG;
	}

}
