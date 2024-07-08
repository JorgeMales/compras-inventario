package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProvedoresDAO;
import com.distribuida.entities.Provedores;

public class PrincipalProvedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ProvedoresDAO provedoresDAO = context.getBean("provedoresDAOImpl",ProvedoresDAO.class);
		
		//CRUD : CREATE, READ, UPDATE, DELETE 
		//
		
		//add
		Provedores provedores = new Provedores(0,"Juan","av. por ahi....","097623456","jtaipe@correo.com");
		provedoresDAO.add(provedores);
		
		//up
		Provedores provedores2 = new Provedores(10,"Juan","av. por ahi....","097623456","jtaipe@correo.com");
		//provedoresDAO.up(provedores2);
		
		//del
		//provedoresDAO.del(10);
		System.out.println("**********************DEL***********************"+provedoresDAO.findOne(1));
		//finAll
		//List<Provedores> Provedoress = ProvedoresDAO.findAll();
		
		
		provedoresDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
		context.close();

	}

}
