package Model.service.Impl;

import Model.BEAN.employee.education_degree;
import Model.repository.EducationDegreeRepository;
import Model.repository.Impl.EducationDegreeRepositoryImpl;
import Model.service.EducationDegreeService;

import java.util.List;

public class EducationDegreeServiceImpl implements EducationDegreeService {
EducationDegreeRepository educationDegreeRepository=new EducationDegreeRepositoryImpl();
  @Override
  public List<education_degree> findALl() {
    return educationDegreeRepository.findALl();
  }
}
