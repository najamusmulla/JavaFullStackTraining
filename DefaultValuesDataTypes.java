package JavaWeek3Lab;

/*
 	* Question: 2. Write a program to print default values of all primitive types.
 	* Author  : KNG21076 - Najamus Sahar M. Mulla
*/

public class DefaultValuesDataTypes {
	
	int 	l_int;
	byte 	l_byte;
	short 	l_short;
	long 	l_long;
	float 	l_float;
	double 	l_double;
	boolean l_boolean;
	char 	l_char;
	
	public static void main(String[] args) {
		DefaultValuesDataTypes dfpt = new DefaultValuesDataTypes();
		System.out.println("Default Values of all primitive types");
		System.out.println("--------------------------------------");
		System.out.println("The default value for Integer datatype is : " + dfpt.l_int);
		System.out.println("The default value for Byte    datatype is : " + dfpt.l_byte);
		System.out.println("The default value for Short   datatype is : " + dfpt.l_short);
		System.out.println("The default value for Long    datatype is : " + dfpt.l_long);
		System.out.println("The default value for Float   datatype is : " + dfpt.l_float);
		System.out.println("The default value for Double  datatype is : " + dfpt.l_double);
		System.out.println("The default value for Boolean datatype is : " + dfpt.l_boolean);
		System.out.println("The default value for Char    datatype is : " + dfpt.l_char);
		
	}
}
