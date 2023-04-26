package in.ineuron.service;

import in.ineuron.dto.CustomerDTO;

public interface ICustomerMgmntService {
	String calculateSimpleInterest(CustomerDTO dto) throws Exception;
}
