package com.kh.genericspractice;

import java.util.List;

public class Box  <B> {

		B content;
		public void put(B item, List<Object> box) {
			this.content=item;
			box.add(item);
		}
		
		public B get() {
			return content;
		
	}
}
