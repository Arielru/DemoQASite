package Extenstions;

import Utilities.commonOps;
import io.qameta.allure.Step;

public class DBActions extends commonOps
{
    @Step("get data from mySQL")
    public static String getUsername(String query) {
        String users = null;
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            users = (rs.getString(2));

        } catch (Exception e) {
            System.out.println("Error Occurred while printing table data: " + e);
        }
        return users;
    }
}
