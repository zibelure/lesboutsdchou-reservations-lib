/**
 * 
 */
package fr.lesboutsdchou.reservations.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author anadot
 *
 */
public class BeanFactory {
	
	private static BeanFactory beanFactory = null;
	private static ApplicationContext context;
	private BeanFactory (){}
	
	/**
	 * getInstance
	 * @return
	 */
	public static synchronized BeanFactory getInstance () {
	  if (beanFactory == null) {
		  beanFactory = new BeanFactory();
		  context = new FileSystemXmlApplicationContext("/src/main/resources/SpringBeans.xml");
	  }
	 return beanFactory;
	}

	/**
	 * getContext
	 * @return
	 */
	public ApplicationContext getContext() {
		return context;
	}
}
