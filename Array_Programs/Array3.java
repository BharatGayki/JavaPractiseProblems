//// Jai Shree Ram
//import java.util.Scanner;
//
// class Array3{
//	public static void main (String[] args){
//
//		Scanner scn = new Scanner (System.in);
//		System.out.print("Enter no. of elements");
//                int n = sc.nextInt();
//
//		int a[] = new int[n];
//                System.out.println("Enter all the elements:");
//		for (int i = 0; i < a.length; i++)
//		{
//			a[i] = scn.nextInt();
//		}
//
//
//
//		int largest1 = a[0];
//		int largest2 = a[1];
//
//		if (largest1 < largest2)
//		{
//			int temp = largest1;
//			largest1 = largest2;
//			largest2 = temp;
//		}
//
//		for (int i = 2; i < a.length; i++)
//		{
//			if (a[i] > largest1)
//			{
//				largest2 = largest1;
//				largest1 = a[i];
//			}
//			else if (a[i] > largest2 && a[i] != largest1)
//			{
//				largest2 = a[i];
//			}
//		}
//
//		System.out.println ("The First largest is " + largest1);
//		System.out.println ("The Second largest is " + largest2);
//
//	}
//}