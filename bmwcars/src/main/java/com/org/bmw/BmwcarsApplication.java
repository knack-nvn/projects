package com.org.bmw;

import com.org.bmw.model.ModelName;
import com.org.bmw.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmwcarsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BmwcarsApplication.class, args);
	}

	@Autowired
	private ModelRepository modelRepository;

	@Override
	public void run(String... args) throws Exception {

		/*ModelName modelName= new ModelName();
		 modelName.setId(Integer.parseInt("101"));
		modelName.setCar_name("BMW 7 series");
		modelName.setColor("Marin Blue");
		modelName.setPrize(Double.valueOf("16500000.0"));
		modelRepository.save(modelName);

		ModelName modelName1= new ModelName();
		modelName1.setId(Integer.parseInt("102"));
		modelName1.setCar_name("BMW Z4");
		modelName1.setColor("Ambient Red");
		modelName1.setPrize(Double.valueOf("8800000.0"));
		modelRepository.save(modelName1);*/

	}
}
