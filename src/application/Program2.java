package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department findAll ===");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		
		/*System.out.println("\n=== TEST 3: department delete ===");
		departmentDao.deleteById(5);
		System.out.println("Delete complete!");*/
		
		
		/*System.out.println("\n=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "Variedades");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		
		System.out.println("\n=== TEST 5: department update ===");
		
		department = departmentDao.findById(3);
		department.setName("varieties");
		departmentDao.update(department);
		System.out.println("Update complete!");
	}

}
