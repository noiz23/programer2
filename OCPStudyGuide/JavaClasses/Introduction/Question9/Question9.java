package Question9;

import java.sql.*;

public class Question9{

    
    public void smt(Connection conn, int a) throws SQLException{
        Statement stmt = conn.createStatement(a,ResultSet.CONCUR_READ_ONLY);
    }

}
