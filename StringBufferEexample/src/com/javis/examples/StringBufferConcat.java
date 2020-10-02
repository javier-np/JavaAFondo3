package com.javis.examples;

public class StringBufferConcat {
	
  public static void main(String... args) {
	  // Getting milliseconds
	  long s_millis = System.currentTimeMillis();
	  
	  StringBuffer sb = new StringBuffer();
	  
	  String s = "";
	  
	  // Chars to concatenate
	  int n = 1000000;
	  
	  char c;
	  
	  for(int i = 0; i < n; i++) {
		  c = (char) ('A' + i % ( 'Z' + 'A' + 1 ));
		  
		  //sb.append(c); //100000 = 8, 10000000 = 23
		  s = s + c;  //100000 = 2782, 10000000 = 279465
	  }
	  
	  long f_millis = System.currentTimeMillis();
	  
	  //System.out.println(sb.toString());
	  
	  //System.out.println(s);
	  
	  System.out.println("Total elapsed: " + (f_millis - s_millis));
  }
	  
}
