package hello_files;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsontest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JSONArray aps=new JSONArray();
		
		JSONArray customdata= new JSONArray();
		JSONObject jo = new JSONObject();
		jo.put("firstName", "John");
		jo.put("lastName", "Doe");
		
		jo.put("address", "525, sector 27");
		
		JSONObject shubham=new JSONObject();
		shubham.put("firstName", "Shubham");
		shubham.put("last name", "rajput");
		
		JSONObject prabhakar=new JSONObject();
		prabhakar.put("firstName", "prabhakar");
		prabhakar.put("last name", "verma");
		
		customdata.add(shubham);
		customdata.add(prabhakar);
		customdata.add(jo);
		
		JSONArray aps1=new JSONArray();
		JSONObject deviceid=new JSONObject();
		deviceid.put("device","12345");
		deviceid.put("device_no","mo99");
		
		aps1.add(deviceid);
		
		JSONObject payload=new JSONObject();
		payload.put("aps", aps1);
		payload.put("customdata",customdata);
		
		System.out.println(payload);
		
		
		
		/*
		JSONObject data1=new JSONObject();
		
		data1.put("device name", "motox");
		data1.put("device date", "2016");
		
		JSONObject data2=new JSONObject();
		
		data2.put("custome1","random thigns");
		data2.put("custome2", "fir se random things");
		
		JSONObject payload=new JSONObject();
		
		payload.put("aps", data1);
		
		payload.put("custom data", data2);
		
		System.out.println("**************************");
		
		System.out.println(payload);

		
		*/
		
		
		
		

	}
}
