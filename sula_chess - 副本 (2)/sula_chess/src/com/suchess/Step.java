package com.suchess;

import java.awt.Color;
import java.awt.Point;

//可落子的选择
public class Step {//定义下一步落点的位置，颜色，棋子半径
	public Color color;//下一步落点颜色
	public Point position;//当前棋子位置位置
	public int radius;//下一步棋子半径
	public int x,y;//下一步落子位置参数

	Step(Point p, int x, int y) {
		this.color = Color.gray;//下一步棋子颜色为灰
		this.position = p;
		this.x = x;
		this.y = y;
		radius = 15;//下一步棋子半径为15像素
	}
}
