package Utilities;

import java.sql.DriverManager;

public class manageDB extends Base
{
    public static void initConnection(String DBUrl, String DBUser, String DBPass)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DBUrl+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", DBUser, DBPass);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            System.out.println("Error Occurred while Connecting to DB: " + e);
        }
    }

    public static void closeConnection()
    {
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Cannot close connection: " + e);
        }
    }
}
