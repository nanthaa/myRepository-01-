package iq.demo;

// Printing initial 100 prime numbers without using loops
public class M17
{
	static int count = 0;

	static void primeCount(int i)
	{
		if (count == 100)
		{
			return;
		}
		if (primeCheck(i, i / 2))
		{
			count++;
			System.out.print(i + ", ");
		}
		primeCount(++i);
	}

	static boolean primeCheck(int i, int j)
	{
		return j == 1 ? true : (i % j == 0 ? false : primeCheck(i, j - 1));
	}

	public static void main(String[] args)
	{
		primeCount(2);
	}
}