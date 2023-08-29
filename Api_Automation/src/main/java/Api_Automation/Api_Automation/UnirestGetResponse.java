package Api_Automation.Api_Automation;

import com.fasterxml.jackson.databind.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestGetResponse {
	
	public void GetResponse() throws UnirestException {
		
		HttpResponse<com.mashape.unirest.http.JsonNode>GetResponse1 =  Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		
		System.out.println("Get Status Code:"+ GetResponse1.getStatus());
		System.out.println("Get Status Code:"+ GetResponse1.getStatusText());
		//System.out.println("Get Status Code:"+ GetResponse1.getBody());
		
		
	}
	
	public static void main(String[]args) throws UnirestException {
		UnirestGetResponse GetResponseCls = new UnirestGetResponse();
		GetResponseCls.GetResponse();
	
	}

}
