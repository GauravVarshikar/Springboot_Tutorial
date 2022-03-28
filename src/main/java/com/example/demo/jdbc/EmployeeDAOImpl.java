package com.example.demo.jdbc;

import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    JdbcTemplate template;

    @Override
    public int addEmployee(Employee employee) {
        String add = "insert into Employee1 values (?,?,?,?)";
        System.out.println(add);
        //int rows = template.update(add, employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary());
        int rows = 1;
        return rows;
    }

    @Override
    public boolean updateEmployee(int empId, String firstName) {
        return false;
    }

    @Override
    public int deleteEmployee(int empId) {
        return 0;
    }

    @Override
    public Employee findByEmpId(int empId) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployees() {
        System.out.println("select * from Employee1");
//        template.query("select * from Employee1", (resultSet, i) -> {
//            Employee e = new Employee();
//            e.setId(resultSet.getInt(1));
//            e.setFirstName(resultSet.getString(2));
//            e.setLastName(resultSet.getString(3));
//            e.setSalary(resultSet.getInt(4));
//            return e;
//        });
        return null;
    }
}
