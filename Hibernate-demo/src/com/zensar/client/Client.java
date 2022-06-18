package com.zensar.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entity.Product;
//import com.zensar.entity.Student;

public class Client
{
	public static void main(String args[])
	{
		
		Product product =new Product(1,"laptop",9999);
		
	
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(product);
		
		System.out.println("product saved Successfullyyyy !!!");
		
		Transaction transaction = session.beginTransaction();
		
		transaction.commit();
		
		session.close();
		
		
		//product.setProductId(1);
		//product.setProductName("Laptop");
		//product.setProductCost(59999);
		
		//System.out.println(product.getProductName());
		
		//System.out.println(product.getProductCost());
		//System.out.println(product);
		
		//Student student1 =new Student(1,"Ram",28);
	
		//System.out.println(student1);
	}
	}


