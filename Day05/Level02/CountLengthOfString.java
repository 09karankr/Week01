import java.util.Scanner;
public class CountLengthOfString{
   public static int getLength(String str){
     int count = 0;
		int i=0;
		try{
			while(true)
			{
				str.charAt(i);
				count++;
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{}
		return count++;
   
   }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = sc.next();
		
		//calling method to find the length of String
		int lengthByUserDefinedMethod = getLength(text);
		//find length by in built method
		int lengthByBuiltInMethod = text.length();
		
		System.out.println("Length by user defined function: " + lengthByUserDefinedMethod);
		System.out.println("Length by built in method: " + lengthByBuiltInMethod);
		if(lengthByUserDefinedMethod == lengthByBuiltInMethod)
		{
			System.out.println("Lengths are equal");
		}
		else{
			System.out.println("Lengths are not equal");
		}
		
   
   }

}