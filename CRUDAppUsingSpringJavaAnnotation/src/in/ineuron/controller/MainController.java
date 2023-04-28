package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeeService;
import in.ineuron.vo.EmployeeVO;

@Component(value = "controller")
public class MainController {
	
	@Autowired
	private IEmployeeService service;
	
	EmployeeVO employeeVO  =null;
	
	public EmployeeVO getHike(EmployeeVO vo) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEaddress(vo.getEadress());
		dto.setEname(vo.getEname());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEsalary(Float.parseFloat(vo.getEsalary()));

		EmployeeDTO empDTO = service.calculateHike(dto);

		if(empDTO !=null) {
			employeeVO = new EmployeeVO();
			employeeVO.setEid(empDTO.getEid().toString());
			employeeVO.setEadress(empDTO.getEaddress());
			employeeVO.setEage(empDTO.getEage().toString());
			employeeVO.setEname(empDTO.getEname());
			employeeVO.setEsalary(empDTO.getEsalary().toString());
			employeeVO.setHikeAmt(empDTO.getHikeAmount().toString());
			
		}
		return employeeVO;
	}
}
