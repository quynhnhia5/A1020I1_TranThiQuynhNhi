package Model.repository;

import Model.BEAN.employee.education_degree;
import Model.BEAN.employee.position;

import java.util.List;

public interface EducationDegreeRepository {
  List<education_degree> findALl();
}
