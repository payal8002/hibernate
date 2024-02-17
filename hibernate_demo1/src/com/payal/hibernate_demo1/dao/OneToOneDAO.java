package com.payal.hibernate_demo1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.payal.hibernate_demo1.entity.CarDTO;
import com.payal.hibernate_demo1.entity.EngineDTO;


public class OneToOneDAO {
	
	    public static void main(String[] args) {
	    
	            Configuration cfg = new Configuration();
	            cfg.configure(); // Load Hibernate configuration from hibernate.cfg.xml

	            SessionFactory factory = cfg.buildSessionFactory();
	            Session session = factory.openSession();

	            EngineDTO engDTO = new EngineDTO();
	            engDTO.setEname("Power Engine");

	            CarDTO carDTO = new CarDTO();
	            carDTO.setCname("BMW");
	            carDTO.setEngDTO(engDTO);

	            session.beginTransaction();
	            session.save(carDTO);
	            session.getTransaction().commit();
	       
	        
	    
	        }
	    }
