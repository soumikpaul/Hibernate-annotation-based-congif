package com.hibernate.annotation.hibexeranno;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.model.Point;
import com.example.model.PointDaoImpl;


public class App 
{
	 public static void main(String[] args) {

	    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 			PointDaoImpl pointDaoImpl = context.getBean(PointDaoImpl.class);
 			Point point=new Point(3,7,8);
 			pointDaoImpl.insertPoint(point);
 			List<Point> pointlist=pointDaoImpl.getPoint();
 			System.out.println(pointlist);
	    }
}
