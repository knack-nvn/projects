package net.javaguide.springboot;

import net.javaguide.springboot.model.Employee;
import net.javaguide.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String [] args) throws Exception{
		Employee employee=new Employee();
		employee.setId(12);
		employee.setName("Puni");
		employee.setSalary(100000.0);
		employee.setAdress(" Mysore");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setId(21);
		employee1.setName("Raki");
		employee1.setSalary(150000.0);
		employee1.setAdress(" Bangalore");
		employeeRepository.save(employee1);

		Employee employee2=new Employee();
		employee2.setId(01);
		employee2.setName("Navi");
		employee2.setSalary(100000.0);
		employee2.setAdress(" Hassan");
		employeeRepository.save(employee2);

	}

}
