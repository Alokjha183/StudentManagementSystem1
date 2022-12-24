package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
		System.out.println("project Started");
	}
    @Autowired
	private StudentRepository studentreRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Alok", "Jha", "alokraj.raj1@gmail.com");
//		studentreRepository.save(student1);
//		
//		Student student2=new Student("Amaresh", "Gupta", "Maresh.raj1@gmail.com");
//		studentreRepository.save(student2);
//		
//		Student student3=new Student("Neeraj", "kumar", "Neeraj.raj1@gmail.com");
//		studentreRepository.save(student3);
//		
//		Student student4=new Student("Tripti", "Jha", "tr.raj1@gmail.com");
//		studentreRepository.save(student4);
		
	}

}
