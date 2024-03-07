package com.suchess;

import java.awt.Color;
import java.awt.Point;


//棋子定义
public class Chess{
    public Color color;  //颜色
    public Point position;//位置（像素位置）
    //public int g; //定义棋子在外圈还是内圈，2为外圈，1位内圈
    public int radius; //定义棋子半径，本程序中设置为30px
    public int x;//在棋盘中的行数
    public int y;//在棋盘中的列数


    public Chess(Color c, Point p, int x, int y) {
        this.color = c;
        this.position = p;
        this.x = x;
        this.y = y;
        radius = 30;

    }
    //获得棋子的所在轨道

}










