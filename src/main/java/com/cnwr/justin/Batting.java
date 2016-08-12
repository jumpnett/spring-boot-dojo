package com.cnwr.justin;

public class Batting {

	private final long id;
	private final String first;
	private final String last;
	private final int totalG;

	public Batting(long id, String first, String last, int totalG) {
		this.id = id;
		this.first = first;
		this.last = last;
		this.totalG = totalG;
	}

	public long id() {
		return id;
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
