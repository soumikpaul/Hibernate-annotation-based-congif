package com.example.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


public class PointDaoImpl {
	@Autowired
    private SessionFactory sessionFactory;


    public List<Point> getPoint(){
        String hql = "from Point";
        Query query = sessionFactory.openSession().createQuery(hql);
        return ((List<Point>) query.list());
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void insertPoint(Point point)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(point);
        session.getTransaction().commit();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
