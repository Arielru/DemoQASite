package Extenstions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class APIActions extends commonOps
{
    @Step("API - Get Data from Server")
    public static Response get(String paramValues)
    {
        response = httpRequest.get(paramValues);
        System.out.println(response.prettyPrint());
        return (response);
    }

    @Step("API - Post Data to server")
    public static Response post(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        System.out.println(response.prettyPrint());
        return null;
    }

    @Step("API - Update Data Without Parameters on server")
    public static int putWithoutParamters(String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        response = httpRequest.put(resource);
        System.out.println(response.prettyPrint());
        return response.statusCode();
    }

    @Step("API - Update Data with Parametrs on server")
    public static int putWithParamters(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        System.out.println(response.prettyPrint());
        return response.statusCode();
    }

    @Step("API - Delete Data on server")
    public static int deleteAUser(String UserID)
    {
        response = httpRequest.delete("/useradmin/v1/users/" + UserID);
        System.out.println(response.prettyPrint());
        return response.statusCode();
    }

    @Step("API - Extract value from Json")
    public static String extractFromJSON(Response response, String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }
}
