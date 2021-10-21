package Model.service.Impl;

import Model.BEAN.User;
import Model.repository.UserRepository;
import Model.repository.impl.UserRepositoryImpl;
import Model.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
  UserRepository userRepository=new UserRepositoryImpl();

  @Override
  public List<User> findAll() throws SQLException {
    return userRepository.findAll();
  }

  @Override
  public void create(User user) throws SQLException {
    userRepository.insertUser(user);
  }

  @Override
  public void delete(int id) throws SQLException {
    userRepository.deleteUser(id);

  }

  @Override
  public void update(User user) throws SQLException {
    userRepository.updateUser(user);
  }

  @Override
  public User selectById(int id) throws SQLException {
    return userRepository.selectById(id);
  }

  @Override
  public User searchCountry(String countrySearch) throws SQLException {
    return userRepository.searchCountry(countrySearch);
  }

//  @Override
//  public User findById(int id) {
//    return userRepository.findById(id);
//  }
//
//  @Override
//  public User findByCountry(String country) {
//    return userRepository.findByCountry(country);
//  }
}
