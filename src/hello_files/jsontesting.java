package hello_files;




public class jsontesting {

	
	
	public static void main(String[] args) throws JSONException {
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
		
		customdata.put(shubham);
		customdata.put(prabhakar);
		customdata.put(jo);
		
		JSONArray aps1=new JSONArray();
		JSONObject deviceid=new JSONObject();
		deviceid.put("device","12345");
		deviceid.put("device_no","mo99");
		
		aps1.put(deviceid);
		
		JSONObject payload=new JSONObject();
		payload.put("aps", aps1);
		payload.put("customdata",customdata);
		
		System.out.println(payload);

		
		
		
		
		
		

	}
}
