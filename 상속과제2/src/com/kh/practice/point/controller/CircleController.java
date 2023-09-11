package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;
import com.kh.practice.point.view.PointMenu;

public class CircleController {
	
	private Circle c;
	private PointMenu p;
	
	public CircleController(Circle c,PointMenu p) {
		this.c=c;
		this.p=p;
	}
	public void run() {
		
		int num = c.getRadius();
		
	}
}
