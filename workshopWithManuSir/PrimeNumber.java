package workshopWithManuSir;

import linklist.LinkedList;

/*
 Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
Store the prime numbers in a 2D Array, the first dimension represents the range 0-100,
100-200, and so on. 
While the second dimension represents the prime numbers in that range
Extend the Prime Number Program and store only the numbers in that range that are
Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
Further store in a 2D Array the numbers that are Anagram and numbers that are not
 */

public class PrimeNumber {
	LinkList<String> linkList = new LinkList<>();
	Stack<String> stacklisk = new Stack<>();
	char[] printPrime = new char[0];

//	Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
	void claculateRagePrimeNumber() {

		String primeNumber = "";

		for (int i = 0; i <= 1000; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {

				primeNumber = primeNumber + i + " ";

			}
		}

		storePrimeNumberinLikedList(primeNumber);

//		System.out.println(primeNumber.toCharArray());

//		printPrime = primeNumber.toCharArray();
	}

	void storePrimeNumberinLikedList(String primeNumber1) {
		stacklisk.push(primeNumber1);
//		linkList.add(primeNumber1);
		linkList.display();

	}

//	void anagramsLogic(String finn, String primeNumber2) {
//
//		if (primeNumber2.length() == 0) {
//			System.out.println(finn);
//		}
//
//	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.claculateRagePrimeNumber();

	}
}
