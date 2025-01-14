public class NullPointerExceptionProgram{

   public static void generateException(){
      String text = null;
	  System.out.println("Attempting to call an object of nullable type...");
	  System.out.println(text.length());
   }
    //Method to handle exception
	public static void handleException(){
	   String text = null;
	   try{
	       System.out.println("Attempting to call a method on nullable object..");
	   
	   } catch(NullPointerException e){
	       System.out.println("Caught a null pointer exception: " + e.getMessage());
	   }
	   
	
	}
  
   public static void main(String[] args){
     System.out.println("Calling method to generate NullPointerException:");
        try {
            generateException(); // Call method to generate exception
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method to handle NullPointerException");
  }
}