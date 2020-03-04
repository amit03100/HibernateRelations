package com.hb.onetomany;

import com.hb.dao.OneToManyDAO;
import com.hb.dao.OneToManyDAOImpl;
import com.hb.utility.HibernateUtils;


public class ClientApp 
{
    public static void main( String[] args )
    {
       OneToManyDAO dao = new OneToManyDAOImpl();
       System.out.println("hello");
       dao.saveData();
       HibernateUtils.closeSessionFactory();
    }
}
