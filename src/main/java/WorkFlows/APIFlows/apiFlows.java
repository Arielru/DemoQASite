package WorkFlows.API;

import Extenstions.APIActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class apiFlows extends commonOps
{
    @Step("Get All Users - API Flow")
    public static String getAllUsersFlow(String JPath)
    {
        Response response = APIActions.get("/users/htallusers");
        return APIActions.extractFromJSON(response, JPath);
    }

    @Step("Post a new Password for the current User")
    public static int postNewPasswordCurrentUser(String oldPassword, String newPassword)
    {
        requestParams.put("oldPassword", oldPassword);
        requestParams.put("newPassword", newPassword);
        Response response = APIActions.post(requestParams, "/change_password");
        return response.statusCode();
    }

    @Step("Put a new Password for the current User")
    public static int putKeepSessionAlive()
    {
        int response = APIActions.putWithoutParamters( "/users/keepSessionAlive");
        return response;
    }

    @Step("Delete a Specific User")
    public static int deleteASpecificUser(String id)
    {
        int response = APIActions.deleteAUser(id);
        return response;
    }

}
