package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.CustomerBO;

@Repository(value = "dao")
public class CustomerMySQLDAOImpl implements ICustomerDAO {

	@Autowired
	private DataSource dataSource;


	@Override
	public int save(CustomerBO bo) throws Exception {
		int count = 0;

		String CUSTOMER_INSERT_QUERY = "INSERT INTO customer (customerName,customerAddress,principleAmount,rate,time,interestAmount) VALUES(?,?,?,?,?,?)";
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pStatement = connection.prepareStatement(CUSTOMER_INSERT_QUERY)) {
			
			pStatement.setString(1, bo.getCustomerName());
			pStatement.setString(2, bo.getCustomerAddress());
			pStatement.setFloat(3, bo.getPamt());
			pStatement.setFloat(4, bo.getRate());
			pStatement.setFloat(5, bo.getTime());
			pStatement.setFloat(6, bo.getInterestAmount());

			count = pStatement.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
