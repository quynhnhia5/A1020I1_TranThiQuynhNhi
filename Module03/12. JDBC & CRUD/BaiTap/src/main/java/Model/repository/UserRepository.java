package Model.repository;

import Model.BEAN.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface UserRepository {
  List<User> findAll() throws SQLException;
  void insertUser(User user) throws SQLException;
  void deleteUser(int id) throws SQLException;

  User selectById(int id) throws SQLException;

  void updateUser(User user) throws SQLException;
  List<User> searchCountry(String countrySearch) throws SQLException;


}
