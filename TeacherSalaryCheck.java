import java.sql.*;

public class TeacherSalaryCheck {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "yourpassword";

        String query = 
            "SELECT t.teacher_name, t.salary, t.department_name " +
            "FROM teachers t " +
            "GROUP BY t.teacher_id, t.teacher_name, t.salary, t.department_name " +
            "HAVING t.salary > (" +
            "   SELECT SUM(t2.salary) " +
            "   FROM teachers t2 " +
            "   WHERE t2.department_name = t.department_name" +
            ") AND t.department_name = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, "CSE"); // department name dynamically

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    "Teacher: " + rs.getString("teacher_name") +
                    ", Salary: " + rs.getDouble("salary") +
                    ", Department: " + rs.getString("department_name")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
