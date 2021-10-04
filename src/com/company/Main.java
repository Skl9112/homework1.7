package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array = {1, 0, 4, 8, 9, 1};

	int firstOption = array[0] + array[2] + array[4];
	int secondOption = array[0] + array[2] + array[5];
    int thirdOption = array[0] + array[3] + array[5];
    int fourthOption = array[1] + array[3] + array[5];

    System.out.println("Sum options : " + firstOption + " " + secondOption + " " + thirdOption + " " + fourthOption);

        if (firstOption >= secondOption & firstOption >= thirdOption & firstOption >= fourthOption)
            System.out.println("Max sum : " + firstOption);
        else if (secondOption >= firstOption & secondOption >= thirdOption & secondOption >= fourthOption)
            System.out.println("Max sum : " + secondOption);
        else if (thirdOption >= firstOption & thirdOption >= secondOption& thirdOption >= fourthOption)
            System.out.println("Max sum : " + thirdOption);
        else if (fourthOption >= firstOption & fourthOption >= secondOption & fourthOption >= thirdOption)
            System.out.println("Max sum : " + fourthOption);
    }
}
