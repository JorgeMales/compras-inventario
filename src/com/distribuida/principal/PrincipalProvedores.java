package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProvedoresDAO;
import com.distribuida.entities.Provedores;

public class PrincipalProvedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ProvedoresDAO ProvedoresDAO = context.getBean("provedoresDAOImpl",ProvedoresDAO.class);
		
		//CRUD : CREATE, READ, UPDATE, DELETE 
		//
		
		//add
		Provedores provedores = new Provedores(0,"Juan","av. por ahi....","097623456","jtaipe@correo.com");
		ProvedoresDAO.add(provedores);
		
		//up
		Provedores provedores2 = new Provedores(11,"Juan2","av. por ahi....2","0976234562","jtaipe2@correo.com");
		//ProvedoresDAO.up(provedores2);
		
		//del
		//ProvedoresDAO.del(40);
		System.out.println("**********************DEL***********************"+ProvedoresDAO.findOne(1));
		//finAll
		//List<Provedores> Provedoress = ProvedoresDAO.findAll();
		
		
		ProvedoresDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
		context.close();

	}

}
