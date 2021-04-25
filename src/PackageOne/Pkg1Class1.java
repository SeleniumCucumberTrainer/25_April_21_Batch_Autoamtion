package PackageOne;

public class Pkg1Class1 {
	
	// public, protected, default, private
	
	
	  protected int l =10;
	  public int b =10;
	  public static int h =10;
	
      protected void sum() {
		
		System.out.println("Hi This is Sum method");
		
		
		
	}
      
      
      public static void main(String[] args) {
		
    	  
    	  Pkg1Class1 abc = new Pkg1Class1();
    	  
    	  abc.h++;
    	  
    	  System.out.println(abc.l);
    	  
    	  
	}
	

}
