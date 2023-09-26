package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Student;
@Component
public class StudentDao {
	
	@Autowired
	EntityManagerFactory factory;
	public Student saveStudent(Student student) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		if(student !=  null) {
			transaction.begin();
			manager.persist(student);
			transaction.commit();
		}
		return student;
	}
	public Student updateStudent(Student student) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student2 = entityManager.find(Student.class, student.getId());
		if(student2 != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}return student;
	}
	public Student deleteStudent(int id) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = entityManager.find(Student.class, id);
		if(student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		}
		return student;
	}
	public Student getStudentById(int id){
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(Student.class, id);
		
	}
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("select a from Student a");
		return query.getResultList();
	}
}