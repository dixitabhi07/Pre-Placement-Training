// Java program to calculate minimum
// sum of product of two arrays.
import java.io.*;
import java.util.*;

class ans5 {

	// Returns minimum sum of product of two arrays
	// with permutations allowed
	static long minValue(int A[], int B[], int n)
	{
		// Sort A and B so that minimum and maximum
		// value can easily be fetched.
		Arrays.sort(A);
		Arrays.sort(B);

		// Multiplying minimum value of A
		// and maximum value of B
		long result = 0;
		for (int i = 0; i < n; i++)
			result += (A[i] * B[n - i - 1]);

		return result;
	}

	// Driven Code
	public static void main(String[] args)
	{
		int A[] = { 3, 1, 1 };
		int B[] = { 6, 5, 4 };
		int n = A.length;
		;
		System.out.println(minValue(A, B, n));
	}
}

// This code is contributed by vt_m
