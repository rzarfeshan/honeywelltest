package DistributeCandies;

import java.util.Scanner;

/**
 * Special candy A school has N kids, and each kid has a unique id number, S,
 * ranging from 1 to N. There are M candies that must be distributed to the
 * kids. The teacher decides the fairest way to do this is by sitting the kids
 * down in a circle (ordered by ascending S), and then, starting with some
 * random S, distribute one candy at a time to each sequentially numbered kid
 * until all M candies are distributed. For example, if the teacher picks kid
 * S=2, then his distribution order would be (2,3,4,5,…,n-1, n, 1,2,3,4,…) until
 * all M candies are distributed. But wait—there’s a catch—the very last candy
 * is special! Can you find and print the ID number of the last kid to receive
 * the special candy?
 * 
 * Input Format The first line contains an integer, T, denoting the number of
 * test cases. The T subsequent lines each contain 3 space-separated integers:
 * N(the number of kids), M(the number of candies), and S(the kid ID),
 * respectively. Constraints 1<=T<=100 1<=N<=10^9 1<=M<=10^9 1<=S<=10^9 Output
 * Format For each test case, print the ID number of the kid who receives the
 * special candy on a new line. Sample Input 1 5 2 1 Sample Output 2 Explanation
 * There are N=5 kids and S=2 candies. Distribution starts at ID number S=1, so
 * kid 1 gets the first candy and kid 2 gets the second (last) candy. Thus, we
 * must tell kid 2 about the special candy, so we print 2 on a new line.
 * 
 * @author RABEYA
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = Integer.valueOf(scan.nextLine());

		for (int i = 0; i < T; i++) {
			String str = scan.nextLine();
			String[] arr = str.split(" ");
			int candies = Integer.valueOf(arr[0]);
			int num_student = Integer.valueOf(arr[1]);
			int id = Integer.valueOf(arr[2]);
			System.out.println(distributeCandies(num_student, candies, id));
		}
		scan.close();
	}

	public static int distributeCandies(int num_student, int candies, int id) {
		int result = -1;
		int i = id - 1;

		if (candies > num_student) {
			candies = candies % num_student;
			if (candies == 0)
				if (id != 1)
					 return id - 1;
				else
					return num_student;
		}

		while (candies != 0) {
			if (candies == 1) {
				result = ++i;
			} else if (i >= num_student) {
				i = 1;
			}

			else {

				i++;
			}
			candies--;
		}
		return result;
	}
}
