package Model.repository;


import Model.BEAN.employee.user;

import java.util.List;

public interface UserRepository {
  List<user> findALl();
}
