package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

@Service(value = "service")
public class CustomerMgmntServiceImpl implements ICustomerMgmntService {

	@Autowired
	private ICustomerDAO dao;


	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {

		float interestAmount = (dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;

		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setPamt(dto.getPamt());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());
		customerBO.setInterestAmount(interestAmount);
		int count = dao.save(customerBO);
		
		
		return count == 0? "Customer registration failed": "Customer Registration Successfull :: Interest  Amount :"+interestAmount;
	}

}
