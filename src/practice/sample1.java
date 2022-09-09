package practice;

public class sample1 {
	
	
	public static void main(String[] args) {
		
		String name= "hi helloow";
		int count;
		char chr;
		for(chr='a';chr<='z';chr++)
		{
			count =0;
			for(int i=0;i<name.length();i++)
			{
				if(name.charAt(i)==chr)
				{
					count++;
				}
			}
			
			if(count!=0)
			{
				System.out.println(chr+"="+count);
			}
		}
	}

}
