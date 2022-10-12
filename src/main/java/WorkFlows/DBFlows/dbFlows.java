package WorkFlows.DB;

import Extenstions.DBActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class dbFlows extends commonOps
{
    @Step("Get Username from DB")
    public static String getUsersFromDB()
    {
        String user = DBActions.getUsername("SELECT * FROM `users`");
        return user;
    }
}
