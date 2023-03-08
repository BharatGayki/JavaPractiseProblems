// Jai Shree Ram

//Write a program to find the second largest element in an array of java

public static int findSecondLargest(int[] arr) {
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}
