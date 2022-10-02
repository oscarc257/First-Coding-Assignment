package firstCoding;

import java.util.Arrays;

import java.util.OptionalDouble;

public class CodingAssign {

	public static void main(String[] args) {

				
			
			
				// 1. =============================================
		        
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Array Literal; since size and variables are known. 
						
				
				// a.subtract the value of the first element in the array from the value in the last element of the array 
				
				int lengthOfArr = ages.length;
				int difference = Math.abs(ages[0]- ages[ages.length - 1]);
				
				System.out.println("Difference of first and last element in ages[] =" + difference);	
				
				int[] ages2 = new int[ages.length];{
				
				lengthOfArr = ages2.length;
				ages2[ages2.length - 1] = 100;
				difference = Math.abs(ages2[0] - ages2[ages2.length - 1]);
				
				System.out.println("Difference of first and last element in ages2[] = " + difference);
				
				// b. find the average of age
				
				int sum = 0;
				
				int i;
				for (i = 0; i < ages2.length; i++) {
					sum += ages2[i];
				}
				
				double average = sum / ages2.length;
				System.out.println("The average age in ages2[] =" + average);
				
				
				
				
				
				// 2. =========================================================
				String[] everyName = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				// a. create a loop to iterate through the array and calculate average number of letters
				
				sum = 0;
				
				for (i = 0; i < everyName.length; i++) {
					sum += everyName[i].length();
				}
				
				average = sum / everyName.length;
				System.out.println("The avarage number of letters in everyName[] = " + average);
				
				// b. create a loop to iterate through array and concatenate all names at once, separated by spaces.
				
				String Names = "";
				
				for (i = 0; i < everyName.length; i++) {
					Names += everyName[i] + " ";
				}
				
				System.out.println(Names);
				
				
				
				
				
				// 3. =====================================
				
				System.out.println("You must use a[arr.length] to access the last element of an array.");
				
				
				
				
				// 4. ====================================
				
				
				System.out.println("You must use a[0] to access the last element of an array.");
				
				
				
				
				// 5. =============================================
				
				int[] nameLengths = new int[everyName.length];
				for (i = 0; i < everyName.length; i++) {
					nameLengths[i] = everyName[i].length();		
				}

				// 6. =====================  
				
				sum = 0;
				
				
				for ( i = 0; i < nameLengths.length; i++) {
					sum += nameLengths[i];
				}
				
				System.out.println("The total of all lengths in nameLengths[] =  " + sum);
				
				
				// 7. ===============
				
				 String str = "Oscar";
				 
				    System.out.println( str.repeat(4) );
				    
				    
				    
				    
				// 8. ==========================================     
				   
				 String firstName = "Oscar";
				 String lastName = "Carrillo";
				 String fullName = firstName + " " + lastName;
				 
				 System.out.println(fullName);
				 
				}	
			
			

				// Calls for following methods
				
			int [] newAge = {105, 129, 124, 113};
			System.out.println(greaterThan100 (newAge));
			
			double[] doubleArr = {0.5, 9.0, 245.4, 78.1};
			System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));

			double[] anotherDoubleArr = {7.2, 9.3, 8.4, 7.5};
			System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
			
			
			boolean isHotOutside = true;
			double moneyInPocket = 153.20;
			
			String arr3 = new String();
			double[] arr1 = { 100.0, 14.0, 16.5, 11.1 };
		    double[] arr2 = { 90.0, 12.9, 16.5, 11.1 };
			System.out.println(Arrays.equals(arr1, arr2));
			
			
			}	 

			
			// 9. ====================================
			
		 


		static boolean greaterThan100(int [] newAge) {
				
			int arraySum = 0;
			boolean greater100;
			
			for (int i = 0; i < newAge.length; i++) {
				arraySum += newAge[i];
			}
			
			if (arraySum > 100) {
				return greater100 = true;
			}else {
				greater100 = false;
				return greater100;
			}
			
		 }

		 
		 
		 
		 
		 // 10.	===============================
		 
		 static OptionalDouble getAverageOfDoubleArr(double[] arr) {
				
				return Arrays.stream(arr).average();
			}
		 
		 
		 
		 
		 
		 // 11. ================================
		 static OptionalDouble isFirstArrAvgGreater(double[] doubleArr, double[] anotherDoubleArr) {
			
			return getAverageOfDoubleArr(anotherDoubleArr);

		 }	
			
		 

		 
		 
		 
		 // 12. =====================================
		 
		 boolean willBuyDrink() {
			return true;
		} {
				
				boolean isHotOutside = true;
				double moneyInPocket = 153.20;
		 
		 }
		 
		 //13. ==========================================
		 

		//This method is to test if all values in both arrays are equal.

		static boolean equals(double[] arr1, double[] arr2) {
		    if (arr1.length != arr2.length)
		        return false;

		    for (int i = 0; i < arr1.length; ++i) {
		        if (Math.abs(arr1[i] - arr2[i]) < 10.2) {
		            return false;
		        }
		    }

		    return true;
		}



		 

		


	

}
