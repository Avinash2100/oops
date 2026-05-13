import java.sql.*;

public class EmpCRUD {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/emp",
                "root",
                "root"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Display Existing Records
            System.out.println("Initial Employees Table:");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("position") + "\t" +
                    rs.getInt("salary")
                );
            }

            // Insert Record
            int rowsInserted = stmt.executeUpdate(
                "INSERT INTO Employee (id, name, position, salary) VALUES (5, 'Alice', 'Manager', 60000)"
            );

            System.out.println("\nRecord inserted. Rows affected: " + rowsInserted);

            // Display After Insert
            System.out.println("\nEmployees Table After Insert:");

            rs = stmt.executeQuery("SELECT * FROM Employee");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("position") + "\t" +
                    rs.getInt("salary")
                );
            }

            // Delete Record
            int rowsDeleted = stmt.executeUpdate(
                "DELETE FROM Employee WHERE id = 1"
            );

            System.out.println("\nRecord deleted. Rows affected: " + rowsDeleted);

            // Display After Delete
            System.out.println("\nEmployees Table After Delete:");

            rs = stmt.executeQuery("SELECT * FROM Employee");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("position") + "\t" +
                    rs.getInt("salary")
                );
            }

            // Close Connection
            con.close();
        }

        catch (Exception e) {

            System.out.println(e);
        }
    }
}