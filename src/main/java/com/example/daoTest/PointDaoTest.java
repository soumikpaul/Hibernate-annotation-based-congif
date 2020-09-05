package com.example.daoTest;

import com.example.config.AppConfig;
import com.example.model.Point;
import com.example.model.PointDaoImpl;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration(
//        classes = { AppConfig.class })
public class PointDaoTest {
    PointDaoImpl pointDao;
    @Before
    public void beforeEachTest() {
        ApplicationContext appCntxt = new AnnotationConfigApplicationContext(com.example.config.AppConfig.class);
        pointDao = appCntxt.getBean(PointDaoImpl.class);
        pointDao.insertPoint(new Point(11,22,33));
    }

    @org.junit.Test
    public void retrieveAllRecords() {
        int actualResult = pointDao.getPoint().size();
        int expectedResult = 1;
        //Assertions.assertEquals(actualResult, expectedResult);
        assertEquals(actualResult,expectedResult);
    }
}