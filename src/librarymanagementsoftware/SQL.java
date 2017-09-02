package librarymanagementsoftware;

public class SQL {
    public static final String host = "jdbc:mysql://localhost:3306/libri";
    public static final String user = "root";
    public static final String pass = "pass";
    
    /* Sample Code
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection(SQL.host, SQL.user, SQL.pass);
            Statement s = (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("//Query to Execute");
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    */
}
