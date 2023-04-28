package in.ineuron.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.dto.EmployeeDTO;

@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setHikeAmount(dto.getEsalary() + 30000.0f);

		EmployeeBO empBO = dao.save(bo);
		EmployeeDTO empDTO = new EmployeeDTO();
		BeanUtils.copyProperties(empDTO, empBO);
		return empDTO;
	}

}
