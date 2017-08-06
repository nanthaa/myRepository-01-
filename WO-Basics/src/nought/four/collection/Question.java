package nought.four.collection;

import java.util.Iterator;
import java.util.List;

public class Question
{
	int id;
	String name;
	List<Answer> answers;

	public Question(int id, String name, List<Answer> answers)
	{
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	void displayAnswers()
	{
		System.out.println("QID : " + id + " QName : " + name);
		Iterator<Answer> ans = answers.iterator();
		System.out.println("The Answers are : ");
		for (Answer answer : answers)
		{
			System.out.println(ans.next());
		}
	}
}
