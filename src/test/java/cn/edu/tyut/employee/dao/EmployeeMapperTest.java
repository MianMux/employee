package cn.edu.tyut.employee.dao;

import cn.edu.tyut.employee.pojo.Employee;
import cn.edu.tyut.employee.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



public class EmployeeMapperTest {

    @Test
    public void findEmployeeById() {
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2. 得到接口的实现类对象
        EmployeeMapper employeeMapper = sqlSession.getMapper(cn.edu.tyut.employee.dao.EmployeeMapper.class);
        // 3. 调用接口的方法
        Employee employee = employeeMapper.findEmployeeById(1);
        // 4. 输出返回值
        System.out.println(employee);
        // 5. 关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void insertEmployee() {
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2. 得到接口的实现类对象
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        // 3. 调用接口的方法
        Employee employee = new Employee();
//        employee.setId(4);
        employee.setName("Tom");
        employee.setAge(40);
        employee.setPosition("员工");
        employeeMapper.insertEmployee(employee);

        sqlSession.commit();
        // 5. 关闭SqlSession对象
        sqlSession.close();
        System.out.println(employee);
    }

    @Test
    public void updateEmployee() {
        SqlSession sqlSession = MybatisUtils.getSession();
        EmployeeMapper employeeMapper =sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("lisi");
        employee.setAge(30);
        employee.setPosition("经理");
        employeeMapper.updateEmployee(employee);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void deleteEmployee() {
        SqlSession sqlSession = MybatisUtils.getSession();
        // 2. 得到接口的实现类对象
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        // 3. 调用接口的方法
        employeeMapper.deleteEmployee(1);
        sqlSession.commit();
        sqlSession.close();
    }
}