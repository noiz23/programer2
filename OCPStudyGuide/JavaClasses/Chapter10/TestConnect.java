import java.sql.*;
public class TestConnect {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn);
        
        float value1 = 102;
        float value2 = (int)102.0;
        //float value3 = 1f * 0.0;
        float value4 = 1f * (short)0.0;
        float value5 = 1f * (boolean)0;


    }
}
