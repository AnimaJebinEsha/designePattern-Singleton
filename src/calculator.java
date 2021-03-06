public class calculator {
	public int x;   
	private static calculator instance = null;

	   private calculator(){}

	   public static calculator getInstance(){
	      if(instance == null)
	      {
	    	  synchronized (calculator.class)
	    	  {
	    		  if(instance == null)
	    		  {
	    			  instance = new calculator();
	    		  }
	    	  }
	      }
	      return instance;
	   }

	   public int add(int a, int b)
	   {
		   return a+b;
	   }
	   
	   public int sub(int a, int b)
	   {
		   return a-b;
	   }
	   
	   public int mul(int a, int b)
	   {
		   return a*b;
	   }
	   
	   public int mod(int a, int b)
	   {
		   return a%b;
	   }
}