package com.payal.hibernate_demo1.dao;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.payal.hibernate_demo1.entity.EmployeeDTO;

public class EmployeDAO {

	
	public static void main(String[] args) {
 Configuration cfg    =  new Configuration();
cfg.configure();
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();

    //create or insert
   /* EmployeeDTO dto = new EmployeeDTO(); // Ensure that your DTO class is named correctly
    dto.setId(101);
    dto.setName("Arun");
    dto.setDesignation("Developer");
    dto.setSalary(25000.00);
    session.save(dto);
    Transaction transaction =  session.beginTransaction();
    transaction.commit();
    session.close();*/
    
   //update
	/*EmployeeDTO dto = session.load(EmployeeDTO.class,102);
    dto.setSalary(dto.getSalary()+10000);
    session.update(dto);
    Transaction transaction =  session.beginTransaction();
    transaction.commit();
    session.close();*/
    
    //delete
    /*EmployeeDTO dto = session.load(EmployeeDTO.class,102);
    session.delete(dto);
    Transaction transaction =  session.beginTransaction();
    transaction.commit();
    session.close();*/
    
   /* Query query = session.createQuery("from EmployeeDTO");
    List<EmployeeDTO> list = query.list();
    for(EmployeeDTO dto : list) {
    	System.out.println(dto.getName()+" "+dto.getDesignation()+" "+dto.getSalary());
    }
    session.close();*/
    
   /* Query query = session.createQuery("from EmployeeDTO where id=101");
    EmployeeDTO dto = (EmployeeDTO) query.uniqueResult();
   
    	System.out.println(dto.getName()+" "+dto.getDesignation()+" "+dto.getSalary());
    
    session.close();*/
    
    /*Transaction transaction =  session.beginTransaction();
    Query query = session.createQuery("update  EmployeeDTO set salary = salary + 10000 where id=101");
    query.executeUpdate();
    transaction.commit();
    session.close();*/
    
    /*Transaction transaction =  session.beginTransaction();
    Query query = session.createQuery("update  EmployeeDTO set salary = salary + ?0 where id=?1");
    query.setDouble(0,10000);
    query.setInteger(1, 101);
    query.executeUpdate();
    transaction.commit();*/
    
    /*Transaction transaction =  (Transaction) session.beginTransaction();
    Query query = session.createQuery("update  EmployeeDTO set salary = salary + :sal where id = :eid");
   
	
	/*query.setDouble(sal,10000);
 
	query.setInteger(eid, 101);
    query.executeUpdate();
    transaction.commit();*/
    //Criteria cr=session.createCriteria(EmployeeDTO.class);
   // cr.add(Restrictions.eq("designation", "Software"));
    //cr.add(Restrictions.eq("salary", "45000"));
   // List<EmployeeDTO>list = cr.list();
   // for(EmployeeDTO employeeDTO : list) {
    	//System.out.println(employeeDTO);
    //============Hcql====================
    /*Criteria cr=session.createCriteria(EmployeeDTO.class);
    cr.add(Restrictions.eq("designation", 1));
    EmployeeDTO dto = (EmployeeDTO) cr.uniqueResult();
    System.out.println(dto);*/
    
    ProjectionList ProjectionList=Projections.projectionList();
    ProjectionList.add(Projections.property("name"));
    ProjectionList.add(Projections.property("salary"));	
   Criteria crit = session.createCriteria(EmployeeDTO.class);
   crit.setProjection( ProjectionList);
   List<Object[]> list = crit.list();
   for (Object[] object : list) {
      System.out.println(object[0]+" "+object[1]);
   }

    session.close();
	}
	
}

