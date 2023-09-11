package com.kh.practice.point.run;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;
import com.kh.practice.point.model.vo.Rectangle;
import com.kh.practice.point.view.PointMenu;

public class Run {
	
	public static void main(String[]args){


	Rectangle r = new Rectangle();
	Circle c = new Circle();
	Point p = new Point();
	
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	
	
	r.getWidth();
	c.getRadius();
	p.getX();
	cc.run();

	
	}
}
