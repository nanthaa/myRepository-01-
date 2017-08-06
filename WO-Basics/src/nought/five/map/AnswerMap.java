package nought.five.map;

import java.util.Date;

public class AnswerMap
{
	private int id;
	private String answer;
	private Date postedDate;

	public AnswerMap()
	{
	}

	public AnswerMap(int id, String answer, Date postedDate)
	{
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	public String toString()
	{
		return "Id:" + id + " Answer:" + answer + " Posted Date:" + postedDate;
	}
}
