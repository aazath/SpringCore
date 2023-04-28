package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired(required = true)
	private DataSource dataSource;

	@Override
	public EmployeeBO save(EmployeeBO bo) {

		String SQL_INSERT_QEURY = "insert into employee (ename,eage,eaddress,esalary,hikeAmount) values(?,?,?,?,?)";
		ResultSet rs =null;
		EmployeeBO empBo = null;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement stmt = connection.prepareStatement(SQL_INSERT_QEURY, PreparedStatement.RETURN_GENERATED_KEYS);) {

			stmt.setString(1, bo.getEname());
			stmt.setInt(2, bo.getEage());
			stmt.setString(3, bo.getEaddress());
			stmt.setFloat(4, bo.getEsalary());
			stmt.setFloat(5, bo.getHikeAmount());
			
			int count = stmt.executeUpdate();
			
			if(count>0)
				rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				empBo.setEid(rs.getInt(1));
				empBo.setEname(rs.getString(2));
				empBo.setEage(rs.getInt(3));
				empBo.setEaddress(rs.getString(4));
				empBo.setEsalary(rs.getFloat(5));
				empBo.setHikeAmount(rs.getFloat(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empBo;

	}

	@Override
	public String toString() {
		return "EmployeeDAOImpl [dataSource=" + dataSource + "]";
	}

}
