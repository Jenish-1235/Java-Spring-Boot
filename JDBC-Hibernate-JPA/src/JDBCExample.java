import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws Exception{

            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "1235";

            // load the jdbc driver for postgres...
        Class.forName("org.postgresql.Driver");

        // Create the connection with database i.e. postgresql
        Connection con = DriverManager.getConnection(url, username, password);

        // creates the statement which can be executed with connection we had...
        Statement stmt = con.createStatement();
        // execution of query to create the table for student data...
        ResultSet rs = stmt.executeQuery("create table student(id int primary key, name varchar(20))");

        // simple read all query for student table
        ResultSet rs1 = stmt.executeQuery("select * from student");

        // code block to see if table is empty...
        /*
        If table is empty it will print no data found and will add new data... Otherwise it will simply print the data that is found in table
         */
        if(rs1.next()){
            System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
        }else{
            System.out.println("No data found");
            System.out.println("Adding New Data");
            stmt.executeUpdate("insert into student values(1,'Raj')");
            stmt.executeUpdate("insert into student values(2,'Anuj')");
            stmt.executeUpdate("insert into student values(3,'Suresh')");
        }

        // code block to read all the data again and this time it will just print the fetched data...
        ResultSet rs2 = stmt.executeQuery("select * from student");
        while(rs2.next()){
            System.out.println("=====================");
            System.out.println("New Data Added");
            System.out.println("=====================");
            System.out.println(rs2.getInt(1)+" "+rs2.getString(2));
        }


        // Delete data with ID 2
        int rs3 = stmt.executeUpdate("delete from student where id=2");
        System.out.println("Data Deleted" + rs3);

        // in similar way all the crud operations can be performed using simple jdbc connection and statement queries...
        /*
        We use PreparedStatements to execute the queries while getting data from variables, to avoid sql injections etc...
         */

        // closes the connection on db.
        con.close();

    }
}
