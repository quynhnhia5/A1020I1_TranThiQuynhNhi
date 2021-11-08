package Model.service;

public class LoginService {
  public static String AuthenticationMember(HttpServletRequest request,Connection conn, user  user)

  {
    PreparedStatement ptmt=null;

    String test="fail";


    String sql="select * from user";

    try
    {
      ptmt=conn.prepareStatement(sql);
      ResultSet rs=ptmt.executeQuery();

      while(rs.next()) {



        String username=rs.getString("username");
        String password=rs.getString("password");

        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
          test="success";
        }


      }

      ptmt.close();
      rs.close();

    }
    catch (SQLException e)
    {
      request.setAttribute("msglogin",e.getMessage());
    }
    return test;
  }

  public static int AuthorizationMember(HttpServletRequest request,Connection conn, member  member) {
    PreparedStatement ptmt=null;


    String sql="select categorymemberid from member where membername='"+member.getMembername()+"'AND memberpass='"+member.getMemberpass()+"'";
    int categorymemberid=0;
    try
    {
      ptmt=conn.prepareStatement(sql);
      ResultSet rs=ptmt.executeQuery();

      while(rs.next()) {
        categorymemberid=rs.getInt("categorymemberid");

      }

      ptmt.close();
      rs.close();

    }
    catch (SQLException e)
    {
      request.setAttribute("msglogin",e.getMessage());
    }
    return categorymemberid;
  }

  public static String  exportMembername(HttpServletRequest request,Connection conn, member  member) {
    PreparedStatement ptmt=null;


    String sql="select fullname from member where membername='"+member.getMembername()+"'AND memberpass='"+member.getMemberpass()+"'";
    String fullname="";
    try
    {
      ptmt=conn.prepareStatement(sql);
      ResultSet rs=ptmt.executeQuery();

      while(rs.next()) {
        fullname=rs.getString("fullname");

      }

      ptmt.close();
      rs.close();

    }
    catch (SQLException e)
    {
      request.setAttribute("msglogin",e.getMessage());
    }
    return fullname;

  }
}
