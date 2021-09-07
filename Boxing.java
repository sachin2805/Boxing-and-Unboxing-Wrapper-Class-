package enumeration;

public class Boxing {

	void show()
	{
		System.out.println("This is the show for Boxing and Unboxing Example");
		Integer obj =10;   //Boxing Using wrapper          
		System.out.println("Boxing Using wrapper   -----> "+obj);
		int a=obj;    //Unboxing 
		System.out.println("Unboxing ----> "+obj);
		
		
		/*
		 Data type(Unboxing)    |     Boxing (type)
	  --------------------------|-----------------------
		 int					|		Integer
		 char					|		Character
		 float					|		Float
		 double					|		Double
		 boolean				|		Boolean
		 */
	}
	public static void main(String[] args) {

		Boxing b= new Boxing();
		b.show();

	}

}
/*OUTPUT
This is the show for Boxing and Unboxing Example
Boxing Using wrapper   -----> 10
Unboxing ----> 10
*/