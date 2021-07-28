package JavaWeek3Lab;

/*
 	* Question: 3. 	Write a program to declare all primitive data types with all
					possible types of initialization and also check implicit and explicit
					type casting by assigning them to each other.
 	* Author  : KNG21076 - Najamus Sahar M. Mulla
*/


public class CastingPrimitiveDataTypes {
	int 	l_int1 = 2000000000, l_int2;
	byte 	l_byte1 = 100, l_byte2;
	short 	l_short1 = 32700, l_short2;
	long  	l_long1 = 5000000000L, l_long2;
	float 	l_float1 = 4000.30003f, l_float2;
	double 	l_double1 = 30000000000000.200000000000000000000000000000000000000000000000000000000000000002, l_double2;
	boolean l_boolean1 = false, l_boolean2;
	char 	l_char1 = 'A', l_char2;
	
	public static void main(String[] args) {
		CastingPrimitiveDataTypes cpdt = new CastingPrimitiveDataTypes();
		System.out.println("Casting of all primitive types by assigning to each other");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Dislaying assigned values for all primitive types - ");
		System.out.println("Assigned Value of Integer..." + cpdt.l_int1);
		System.out.println("Assigned Value of Byte......" + cpdt.l_byte1);
		System.out.println("Assigned Value of Short....." + cpdt.l_short1);
		System.out.println("Assigned Value of Long......" + cpdt.l_long1); 
		System.out.println("Assigned Value of Float....." + cpdt.l_float1); 
		System.out.println("Assigned Value of Double...." + cpdt.l_double1);
		System.out.println("Assigned Value of Boolean..." + cpdt.l_boolean1); 				
		System.out.println("Assigned Value of Char......" + cpdt.l_char1); 		
		System.out.println();
		System.out.println();
		System.out.println("After Casting Integer value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		//cpdt.l_int2 = (int) cpdt.l_int1;
		cpdt.l_byte2 = (byte) cpdt.l_int1; 
		cpdt.l_short2 = (short) cpdt.l_int1; 
		cpdt.l_long2 = cpdt.l_int1; 
		cpdt.l_float2 = (float) cpdt.l_int1; 
		cpdt.l_double2 = (double) cpdt.l_int1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_int1;  				
		cpdt.l_char2 = (char) cpdt.l_int1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Integer value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();

		System.out.println("After Casting Byte value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_byte1;
		//cpdt.l_byte2 = (byte) cpdt.l_byte1; 
		cpdt.l_short2 = (short) cpdt.l_byte1; 
		cpdt.l_long2 = cpdt.l_byte1; 
		cpdt.l_float2 = (float) cpdt.l_byte1; 
		cpdt.l_double2 = (double) cpdt.l_byte1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_byte1;  				
		cpdt.l_char2 = (char) cpdt.l_byte1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		//System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Byte value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();	
		
		System.out.println("After Casting Short value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_short1;
		cpdt.l_byte2 = (byte) cpdt.l_short1; 
		//cpdt.l_short2 = (short) cpdt.l_short1; 
		cpdt.l_long2 = cpdt.l_short1; 
		cpdt.l_float2 = (float) cpdt.l_short1; 
		cpdt.l_double2 = (double) cpdt.l_short1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_short1;  				
		cpdt.l_char2 = (char) cpdt.l_short1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		//System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Short value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();	
		
		System.out.println("After Casting Long value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_long1;
		cpdt.l_byte2 = (byte) cpdt.l_long1; 
		cpdt.l_short2 = (short) cpdt.l_long1; 
		//cpdt.l_long2 = cpdt.l_long1; 
		cpdt.l_float2 = (float) cpdt.l_long1; 
		cpdt.l_double2 = (double) cpdt.l_long1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_long1;  				
		cpdt.l_char2 = (char) cpdt.l_long1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		//System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Long value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();			
		
		System.out.println("After Casting Float value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_float1;
		cpdt.l_byte2 = (byte) cpdt.l_float1; 
		cpdt.l_short2 = (short) cpdt.l_float1; 
		cpdt.l_long2 = (long) cpdt.l_float1; 
		//cpdt.l_float2 = (float) cpdt.l_float1; 
		cpdt.l_double2 = (double) cpdt.l_float1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_float1;  				
		cpdt.l_char2 = (char) cpdt.l_float1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		//System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Float value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();	
		
		System.out.println("After Casting Double value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_double1;
		cpdt.l_byte2 = (byte) cpdt.l_double1; 
		cpdt.l_short2 = (short) cpdt.l_double1; 
		cpdt.l_long2 = (long) cpdt.l_double1; 
		cpdt.l_float2 = (float) cpdt.l_double1; 
		//cpdt.l_double2 = (double) cpdt.l_double1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_double1;  				
		cpdt.l_char2 = (char) cpdt.l_double1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		//System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Double value into Boolean"); 				
		System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();	
		
		System.out.println("After Casting Boolean value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		//cpdt.l_int2 = (int) cpdt.l_boolean1;
		//cpdt.l_byte2 = (byte) cpdt.l_boolean1; 
		//cpdt.l_short2 = (short) cpdt.l_boolean1; 
		//cpdt.l_long2 = (long) cpdt.l_boolean1; 
		//cpdt.l_float2 = (float) cpdt.l_boolean1; 
		//cpdt.l_double2 = (double) cpdt.l_boolean1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_boolean1;  				
		//cpdt.l_char2 = (char) cpdt.l_boolean1; 

		System.out.println("After Casting Value for Integer...Cannot Cast Boolean value into Integer" );		
		System.out.println("After Casting Value for Byte......Cannot Cast Boolean value into Byte");
		System.out.println("After Casting Value for Short.....Cannot Cast Boolean value into Short");
		System.out.println("After Casting Value for Long......Cannot Cast Boolean value into Long"); 
		System.out.println("After Casting Value for Float.....Cannot Cast Boolean value into Float"); 
		System.out.println("After Casting Value for Double....Cannot Cast Boolean value into Double");
		//System.out.println("After Casting Value for Boolean...Cannot Cast Double value into Boolean"); 				
		System.out.println("After Casting Value for Char......Cannot Cast Boolean value into Char"); 		
		System.out.println();
		System.out.println();	
		
		System.out.println("After Casting Char value in other Primitive Datatypes");
		System.out.println("-----------------------------------------------------------");
	
		cpdt.l_int2 = (int) cpdt.l_char1;
		cpdt.l_byte2 = (byte) cpdt.l_char1; 
		cpdt.l_short2 = (short) cpdt.l_char1; 
		cpdt.l_long2 = (long) cpdt.l_char1; 
		cpdt.l_float2 = (float) cpdt.l_char1; 
		cpdt.l_double2 = (double) cpdt.l_char1; 
		//cpdt.l_boolean2 = (boolean) cpdt.l_char1;  				
		//cpdt.l_char2 = (char) cpdt.l_char1; 

		System.out.println("After Casting Value for Integer..." + cpdt.l_int2);		
		System.out.println("After Casting Value for Byte......" + cpdt.l_byte2);
		System.out.println("After Casting Value for Short....." + cpdt.l_short2);
		System.out.println("After Casting Value for Long......" + cpdt.l_long2); 
		System.out.println("After Casting Value for Float....." + cpdt.l_float2); 
		System.out.println("After Casting Value for Double...." + cpdt.l_double2);
		System.out.println("After Casting Value for Boolean...Cannot Cast Char value into Boolean"); 				
		//System.out.println("After Casting Value for Char......" + cpdt.l_char2); 		
		System.out.println();
		System.out.println();	
	}
}
