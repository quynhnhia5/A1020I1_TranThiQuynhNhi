package Model.repository.impl;

import Model.BEAN.User;
import Model.repository.UserRepository;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

  @Override
  public List<User> findAll() throws SQLException {
    Connection conn=DBConnection.CreateConnection();
    List<User> list=new ArrayList<>();
    String sql="select* from users";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ResultSet rs=ptmt.executeQuery();
    while (rs.next()){
      int id=rs.getInt("id");
      String name=rs.getString("name");
      String email=rs.getString("email");
      String country=rs.getString("country");
      User user=new User();
      user.setId(id);
      user.setName(name);
      user.setEmail(email);
      user.setCountry(country);
      list.add(user);

    }
    ptmt.close();
    rs.close();

    return list;


  }

  @Override
  public void insertUser(User user) throws SQLException {
    PreparedStatement ptmt=null;
    Connection conn=DBConnection.CreateConnection();
    String sql="insert into users(name,email,country) value(?,?,?)";
    ptmt=conn.prepareStatement(sql);
    String name=user.getName();
    String email=user.getEmail();
    String country=user.getCountry();
    ptmt.setString(1,name);
    ptmt.setString(2,email);
    ptmt.setString(3,country);
    ptmt.executeUpdate();
    ptmt.close();

  }

  @Override
  public void deleteUser(int id) throws SQLException {
    Connection conn=DBConnection.CreateConnection();
    String sql="delete from users where id = ?;";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ptmt.setInt(1, id);
    ptmt.executeUpdate();
    ptmt.close();


  }

//  @Override
//  public void UpdateUser(User user) throws SQLException {
//    Connection conn=DBConnection.CreateConnection();
//    String sql="UPDATE `demo`.`users` SET `name` =?, `email` = ?, `country` = ? WHERE (`id` = ?);";
//    PreparedStatement ptmt = conn.prepareStatement(sql);
//
//    ptmt.setString(2,user.getName());
//    ptmt.setString(3,user.getEmail());
//    ptmt.setString(3,user.getCountry());
//    ptmt.executeUpdate();
//    conn.close();
//
//
//  }

  @Override
  public User selectById(int id) throws SQLException {
    User user=null;
    Connection conn=DBConnection.CreateConnection();
    String sql="select id,name,email,country from users where id =?";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ptmt.setInt(1,id);
    ResultSet rs=ptmt.executeQuery();
    while (rs.next()){
      String name=rs.getString("name");
      String email = rs.getString("email");
      String country=rs.getString("country");
      user=new User(id,name,email,country);
    }
    ptmt.close();
    rs.close();


    return user;

  }

  @Override
  public void updateUser(User user) throws SQLException {
    Connection conn=DBConnection.CreateConnection();
    String sql="UPDATE `demo`.`users` SET `name` =?, `email` = ?, `country` = ? WHERE (`id` = ?);";
    PreparedStatement ptmt = conn.prepareStatement(sql);

    ptmt.setString(1,user.getName());
    ptmt.setString(2,user.getEmail());
    ptmt.setString(3,user.getCountry());
    ptmt.setInt(4,user.getId());
    ptmt.executeUpdate();
    ptmt.close();

  }

  @Override
  public List<User> searchCountry(String countrySearch) throws SQLException {

//    User user=null;
//    Connection conn=DBConnection.CreateConnection();
//    String sql="SELECT * FROM demo.users WHERE country=?;";
//    PreparedStatement ptmt=conn.prepareStatement(sql);
//    ptmt.setString(1,countrySearch);
//    ResultSet rs=ptmt.executeQuery();
//    while (rs.next()){
//      int id=rs.getInt("id");
//      String name=rs.getString("name");
//      String email = rs.getString("email");
//      user=new User(id,name,email,countrySearch);
//    }
//
//
//    ptmt.close();
//    rs.close();
//    return user;

    Connection conn=DBConnection.CreateConnection();
    List<User> list=new ArrayList<>();
    String sql="SELECT * FROM demo.users WHERE country=?;";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ptmt.setString(1,countrySearch);
    ResultSet rs=ptmt.executeQuery();
    while (rs.next()){
      int id=rs.getInt("id");
      String name=rs.getString("name");
      String email=rs.getString("email");
      String country=rs.getString("country");
      User user=new User();
      user.setId(id);
      user.setName(name);
      user.setEmail(email);
      user.setCountry(country);
      list.add(user);

    }
    ptmt.close();
    rs.close();

    return list;
//    Connection conn=DBConnection.CreateConnection();
//    List<User> UserCountryList=new ArrayList<>();
//    String sql="SELECT id,name,email,country FROM users WHERE country=?;";
//    PreparedStatement ptmt=conn.prepareStatement(sql);
//    ptmt.setString(1,countrySearch);
//    ResultSet rs=ptmt.executeQuery();
//    while (rs.next()){
//      int id=rs.getInt("id");
//      String name=rs.getString("name");
//      String email = rs.getString("email");
//      String country=rs.getString("country");
//      User user=new User();
//      user.setId(id);
//      user.setName(name);
//      user.setEmail(email);
//      user.setCountry(country);
//      UserCountryList.add(user);
//    }
//    return UserCountryList;


  }


}
