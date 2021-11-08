package Model.service.Impl;

import Model.BEAN.employee.division;
import Model.repository.DivisionRepository;
import Model.repository.Impl.DivisionRepositoryImpl;
import Model.service.DivisionService;

import java.util.List;

public class DivisionServiceImpl implements DivisionService {
  DivisionRepository divisionRepository=new DivisionRepositoryImpl();
  public List<division> findALl() {
    return divisionRepository.findALl();
  }
}
