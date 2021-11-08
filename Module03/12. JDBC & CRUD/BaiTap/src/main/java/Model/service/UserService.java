package Model.service;

import Model.BEAN.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
  List<User> findAll() throws SQLException;
  void create(User user) throws SQLException;
  void  delete(int id) throws SQLException;
  void updateUser(User user) throws SQLException;
  User selectById(int id) throws SQLException;
  List<User> searchCountry(String countrySearch) throws SQLException;
////  User findByCountry(String country);

}
