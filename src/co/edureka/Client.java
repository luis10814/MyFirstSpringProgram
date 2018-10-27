package co.edureka;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Client {

	public static void main(String[] args) {
		
		// Object Construction | Done By Developer
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("John Watson");
		eRef.setEaddress("Redwood Shores");
		
		System.out.println("Employee Details: " + eRef);
		
		//Spring Way | IOC (Inversion Of Control)
		
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee e2 = (Employee)factory.getBean("emp2", Employee.class);
		
		System.out.println("Employee Details:" + e1);
		System.out.println("Employee Details:" + e2);
	}

}
