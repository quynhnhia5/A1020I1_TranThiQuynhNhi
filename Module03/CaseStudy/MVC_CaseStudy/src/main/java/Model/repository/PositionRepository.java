package Model.repository;

import Model.BEAN.employee.position;

import java.util.List;

public interface PositionRepository {
  List<position> findALl();
}
