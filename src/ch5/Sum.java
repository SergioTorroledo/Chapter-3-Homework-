package ch5;

public class Sum {

            public static void main(String[] args) {
                int sum1 = sumInRange(1, 10);
                int sum2 = sumInRange(20, 30);
                int sum3 = sumInRange(35, 45);

                System.out.println("Sum of integers from 1 to 10: " + sum1);
                System.out.println("Sum of integers from 20 to 30: " + sum2);
                System.out.println("Sum of integers from 35 to 45: " + sum3);
            }

            // Method to calculate the sum of integers in a given range
            public static int sumInRange(int start, int end) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += i;
                }
                return sum;
            }
        }




