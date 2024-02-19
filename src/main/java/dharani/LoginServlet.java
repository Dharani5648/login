package dharani;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        	PrintWriter out=response.getWriter();
        	response.setContentType("text/html");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Dharu@0402");
            String n=request.getParameter("text");
            String p=request.getParameter("password");
            PreparedStatement ps=con.prepareStatement("select * from login where uname=? and password=?");
            ps.setString(1,n);
            ps.setString(2,p);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
               // Use RequestDispatcher to forward the request to home.jsp
               RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
               rd.forward(request, response);
            } else {
                out.println("<font color=red size=12> Login Failed!");
                out.println("<a href='/loginpage.jsp'>Try Again</a>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}