package cn.edu.tyut.employee.dao;

import cn.edu.tyut.employee.pojo.Employee;

public interface EmployeeMapper {
//    通过id查找用户
    Employee findEmployeeById(Integer id);
//    添加用户
    int insertEmployee(Employee employee);
//    修改用户信息
    int updateEmployee(Employee employee);
//    通过id删除用户
    int deleteEmployee(Integer id);

}
