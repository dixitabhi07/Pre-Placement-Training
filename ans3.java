
// 💡 A permutation of an array of integers is an arrangement of its members into a
// sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr:
// [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

// The next permutation of an array of integers is the next lexicographically greater
// permutation of its integer. More formally, if all the permutations of the array are
// sorted in one container according to their lexicographical order, then the next
// permutation of that array is the permutation that follows it in the sorted container.

// If such an arrangement is not possible, the array must be rearranged as the
// lowest possible order (i.e., sorted in ascending order).

// ● For example, the next permutation of arr = [1,2,3] is [1,3,2].
// ● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// ● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
// have a lexicographical larger rearrangement.

// Given an array of integers nums, find the next permutation of nums.
// The replacement must be in place and use only constant extra memory.


// Answer 3

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class ans3 {

static void nextPermutation(int[] arr)
{
	int n = arr.length, i, j;

	
	for (i = n - 2; i >= 0; i--) {
	if (arr[i] < arr[i + 1]) {
		break;
	}
	}

	// Check if pivot is not found
	if (i < 0) {
	reverse(arr, 0, arr.length - 1);
	}

	// if pivot is found
	else {

	// Find for the successor of pivot in suffix
	for (j = n - 1; j > i; j--) {
		if (arr[j] > arr[i]) {
		break;
		}
	}

	// Swap the pivot and successor
	swap(arr, i, j);

	// Minimise the suffix part
	reverse(arr, i + 1, arr.length - 1);
	}
}

static void reverse(int[] arr, int start, int end)
{
	while (start < end) {
	swap(arr, start, end);
	start++;
	end--;
	}
}

static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

public static void main(String[] args)
{

	// Given input array
	int[] arr = new int[] { 1, 2, 3 };

	// Function call
	nextPermutation(arr);

	// Printing the answer
	for (int i : arr) {
	System.out.print(i + " ");
	}
}
}
