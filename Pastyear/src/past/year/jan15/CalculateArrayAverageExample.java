package past.year.jan15;

public class CalculateArrayAverageExample {
	 
    public static void main(String[] args) {
           
            //define an array
            int[] numbers = new int[]{0,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401};
           
            /*
             * Average value of array elements would be
             * sum of all elements/total number of elements
             */
           
            //calculate sum of all array elements
            int sum = 0;
            double flag = 0.0;
           
            for(int i=0; i < numbers.length ; i++)
                    sum = sum + numbers[i];
           
            //calculate average value
            double average = sum / numbers.length;
			flag = Math.pow((numbers[40] - numbers[27] + numbers[24]),2) - 932;
           
            System.out.println("Average value of array elements is : " + average);
            System.out.println("flag is : " + flag);
    }
}