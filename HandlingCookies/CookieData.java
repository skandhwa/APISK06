package HandlingCookies;

import java.util.LinkedHashMap;
import java.util.Map;

public class CookieData {
	
	public static Map SetCookieData()
	{
		Map<String,Object> mp=new LinkedHashMap<String,Object>();
		mp.put("maxtime","20 seconds");
		mp.put("password","test@1234");
		
		return mp;
		
		
	}
	
	

}
