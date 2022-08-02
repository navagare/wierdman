/**
 * 
 */
package com.weirdman.main;

/**
 * @author Rajan
 *
 */
public class NestedClass {
	
	public static NestedClass staticMainClass ;
	public NestedClass nestedClass;
	

	/**
		 * @author Rajan
		 *
		 */
	public static class SecondClass {

		/**
		 * 
		 */
		public SecondClass() {

		}

		/**
		 * @param args
		 * <a>static class can contain static methods</a>
		 */
		public static void main(String[] args) {
		

		}
		
		public void test() {
			System.out.println("second class");
		}
		public static void staticTest() {
			System.out.println("static second class");
		}

	}

	/**
		 * @author Rajan
		 * @category enclosed class
		 * 
		 * <a> enclosed class/inner class
		 * 
		 */
	public class FirstClass {

		/**
		 * 
		 */
		public FirstClass() {
			
		}

		/**
		 * static methods are not allowed in side non static inner classed
		 * 
		 */
		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * 
		 * }
		 */
		public void test() {
			System.out.println("first class");
		}
		
	}

	/**
	 * 
	 */
	public NestedClass() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			NestedClass nestedClass = new NestedClass();
			FirstClass firstClass = nestedClass.new FirstClass(); //constructor can b access by ref vairable of outer class
			firstClass.test();
			SecondClass secondClass = new SecondClass(); 
			secondClass.test();
			SecondClass.staticTest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
