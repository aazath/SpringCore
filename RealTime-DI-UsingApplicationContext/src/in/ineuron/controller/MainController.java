package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmntService;
import in.ineuron.vo.CustomerVO;

public class MainController {
	
	private ICustomerMgmntService service;
	
	public MainController(ICustomerMgmntService service) {
		this.service = service;
	}

	public String processCustomer(CustomerVO vo) throws Exception{
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));
		String result = service.calculateSimpleInterest(customerDTO);
		return result;
		
	}
}
