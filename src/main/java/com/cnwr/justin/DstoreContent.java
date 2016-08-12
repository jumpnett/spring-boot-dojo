package com.cnwr.justin;

import java.util.List;

public class DstoreContent {

	private final int totalLength;
	private final List<Batting> content;

	public DstoreContent(List<Batting> content) {
		this.totalLength = content.size();
		this.content = content;
	}

	public int getTotalLength() {
		return totalLength;
	}

	public List<Batting> getContent() {
		return content;
	}

}
