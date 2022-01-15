package com.training.project;

public class DeptDataStore {
	
        private static Department departments[]= {
        		new Department(10,"HR"),
        		new Department(20,"sales"),
        		new Department(30,"technical")
        		};
        
        public static Department getDepartment(int id) throws DepartmentException
        {
        	for(Department d: departments)
        	{
        		if(d.getDeptId()==id)
        			return d;
        	}
        	throw new DepartmentException("Department with id " +id+ "not found");
        	}

}
