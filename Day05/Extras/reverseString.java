public class reverseString{

    public static String reverseStrings(String input) {
       return new StringBuilder(input).reverse().toString();
}
    public static void main(String[] args){
	  String str = "Karan";
	  String reverseResult = reverseStrings(str);
	  System.out.println("Reversed string: " + reverseResult);
	  
	}

}

