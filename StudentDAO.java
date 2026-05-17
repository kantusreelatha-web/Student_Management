import java.sql.*;

public class StudentDAO {

    public void insertFromExcel(Student s) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students_excel (gudivada) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.gudivada);

            ps.executeUpdate();
            System.out.println("Data Inserted from Excel");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
