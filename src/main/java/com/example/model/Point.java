package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Point {
    @Id
    private int pointId;
    private int xCoordinate;
    private int yCoordinate;
    public Point()
    {
    	
    }
	public Point(int pointId, int xCoordinate, int yCoordinate) {
		super();
		this.pointId = pointId;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
