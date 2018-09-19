package Package1;

public class loop1 {
public void forLoopSample2() {
	String word = "cat";
	for(int i = 0; i < word.length(); i++)
	{
		System.out.println(i);
		System.out.println(word.charAt(i));
	}
}

public void createMask()
{
	String word = "Horse";
	for(int i = 0; i < word.length(); i++)
		System.out.print("*");
}


}
