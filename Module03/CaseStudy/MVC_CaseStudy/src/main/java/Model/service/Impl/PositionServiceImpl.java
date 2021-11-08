package Model.service.Impl;

import Model.BEAN.employee.position;
import Model.repository.Impl.PositionRepositoryImpl;
import Model.repository.PositionRepository;
import Model.service.PositionService;

import java.util.List;

public class PositionServiceImpl  implements PositionService {
  PositionRepository positionRepository=new PositionRepositoryImpl();
  public List<position> findALl() {
    return positionRepository.findALl();
  }
}
