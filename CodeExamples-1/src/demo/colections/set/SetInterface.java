package demo.colections.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//https://github.com/srana6/CRM_Web_Application_Spring_Hibernate
public class SetInterface
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();

		map.put("I-1", "I-1 value");
		map.put("I-2", "I-2 value");
		map.put("I-1", "I-1 value");
		map.put("I-3", "I-3 value");

		System.out.println(map.put("I-4", "I-4 value"));
		System.out.println(map.get("I-1"));

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext())
		{
			Map.Entry<String, String> s = (Entry<String, String>) itr.next();
			System.out.println(s.getKey() + " == " + s.getValue());
			if (s.getKey().equals("I-4"))
			{
				itr.remove();
				System.out.println(12345);
			}
		}
		for (String e : map.keySet())
		{
			System.out.println(e + " ----- " + map.get(e));
		}
	}
}