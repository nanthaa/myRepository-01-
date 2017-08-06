package nought.five.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMapObject
{
	private int id;
	private String name;
	private Map<AnswerMap, User> answers;

	public QuestionMapObject()
	{
	}

	public QuestionMapObject(int id, String name, Map<AnswerMap, User> answers)
	{
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo()
	{
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<AnswerMap, User>> set = answers.entrySet();
		Iterator<Entry<AnswerMap, User>> itr = set.iterator();
		while (itr.hasNext())
		{
			Entry<AnswerMap, User> entry = itr.next();
			AnswerMap ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}
}
