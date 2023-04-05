import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1: ");
        Scanner reader = new Scanner(System.in);
        int lowerLimit = 10;
        int newIntArraySize;
        for (;;) {
            System.out.print("Enter number of elements for the array: ");
            newIntArraySize = reader.nextInt();
            if (newIntArraySize <= 0) {
                System.out.println("Number of elements for the array needs to be greater than 0.\n");
            }
            else {
                break;
            }
        }

        int[] newIntArray = new int[newIntArraySize];
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print("Enter " + (i + 1) + ". element: ");
            newIntArray[i] = reader.nextInt();
        }

        System.out.println("Elements of the array: ");
        for (int i = newIntArray.length - 1; i >= 0; i--) {
            System.out.print(newIntArray[i]);
            if (newIntArray[i] % 2 == 0) {
                System.out.print(" The number is even.");
            } else {
                System.out.print(" The number is odd.");
            }

            if (newIntArray[i] > lowerLimit) {
                System.out.printf(" The number is greater than %d.", lowerLimit);
            }
            System.out.print("\n");
        }

        // Task 2
        System.out.println("\nTask 2: ");
        double[] numberArray = {123, 23, 3, 0, 17, 73, 98, 65, 32, 44, 1, 2, 3, 4, 5, 6};
        String[] ordinalNumbersWords = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh",
                "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
        int loopLength = numberArray.length;

        if (numberArray.length > ordinalNumbersWords.length) {
            loopLength = ordinalNumbersWords.length;
        }

        for (int i = 0; i < loopLength; i++) {
            System.out.printf("%s number in array: %.2f\n", ordinalNumbersWords[i], numberArray[i]);
        }

        // Task 3
        System.out.println("\nTask 3: ");
        int[] anySizeNumberArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Original array: ");
        for (int i = 0; i < anySizeNumberArray.length; i++) {
            System.out.print(anySizeNumberArray[i] + " ");
        }

        for (int i = anySizeNumberArray.length - 1, j = 0; i > anySizeNumberArray.length / 2; i--, j++) {
            int temporaryNumber = anySizeNumberArray[j];
            anySizeNumberArray[j] = anySizeNumberArray[i];
            anySizeNumberArray[i] = temporaryNumber;
        }

        System.out.print("\nReversed array: ");
        for (int i = 0; i < anySizeNumberArray.length; i++) {
            System.out.print(anySizeNumberArray[i] + " ");
        }

        // Task 4
        System.out.println("\n\nTask 4: ");
        String someWordString = "AnavolimiLovana";
        char[] someWordCharArray = someWordString.toLowerCase().toCharArray();
        boolean wordIsPalindrome = true;

        for (int i = someWordCharArray.length - 1, j = 0; i > someWordCharArray.length / 2; i--, j++) {
            if (someWordCharArray[j] != someWordCharArray[i]) {
                wordIsPalindrome = false;
                break;
            }
        }

        if (wordIsPalindrome) {
            System.out.printf("Word '%s' is a palindrome.\n", someWordString);
        } else {
            System.out.printf("Word '%s' is not a palindrome.\n", someWordString);
        }

        // Task 5
        System.out.println("\nTask 5: ");
        int lowerNumber = 0;
        int largerNumber = 0;
        boolean evenNumberExist = false;
        for (;;) {
            System.out.print("Please enter lower number in range: ");
            lowerNumber = reader.nextInt();
            System.out.print("Please enter larger number in range: ");
            largerNumber = reader.nextInt();

            if (lowerNumber >= largerNumber) {
                System.out.println("Lower number needs to be greater than larger number. Enter numbers again.\n");
            } else {
                for (int i = lowerNumber + 1; i < largerNumber; i++) {
                    if (i % 2 == 0) {
                        evenNumberExist = true;
                    }
                }
                break;
            }
        }

        if (evenNumberExist) {
            System.out.printf("Even numbers from %d to %d are: \n", lowerNumber, largerNumber);
            for (int i = lowerNumber + 1; i < largerNumber; i++) {
                if (i % 2 == 0) {
                    if (i + 2 < largerNumber) {
                        System.out.print(i + ", ");
                    } else {
                        System.out.print(i);
                    }
                }
            }
        } else {
            System.out.print("There are no even numbers between " + lowerNumber + " and " + largerNumber + ".");
        }

        // Task 6
        System.out.println("\n\nTask 6: ");
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {5};
        int[] thirdArray = {6, 7, 8, 9, 10};
        int[] combinedArray = new int[firstArray.length + secondArray.length + thirdArray.length];
        int indexCounter = 0;

        for (int j = 0; j < firstArray.length; j++) {
            combinedArray[indexCounter] = firstArray[j];
            indexCounter++;
        }

        for (int j = 0; j < secondArray.length; j++) {
            combinedArray[indexCounter] = secondArray[j];
            indexCounter++;
        }

        for (int j = 0; j < thirdArray.length; j++) {
            combinedArray[indexCounter] = thirdArray[j];
            indexCounter++;
        }

        System.out.print("First array: ");
        for (int j = 0; j < firstArray.length; j++) {
            System.out.print(firstArray[j] + " ");
        }

        System.out.print("\nSecond array: ");
        for (int j = 0; j < secondArray.length; j++) {
            System.out.print(secondArray[j] + " ");
        }

        System.out.print("\nThird array: ");
        for (int j = 0; j < thirdArray.length; j++) {
            System.out.print(thirdArray[j] + " ");
        }

        System.out.print("\nCombined array: ");
        for (int j = 0; j < combinedArray.length; j++) {
            System.out.print(combinedArray[j] + " ");
        }

        // Task 7
        System.out.println("\n\nTask 7: ");
        int[] arrayNumberOne = {1, 3, 5, 6};
        int[] arrayNumberTwo = {1, 1, 1, 1, 1, 1, 1};

        System.out.print("Array A: ");
        for (int i = 0; i < arrayNumberOne.length; i++) {
            if (i == arrayNumberOne.length - 1){
                System.out.print(arrayNumberOne[i] + "\n");
            } else {
                System.out.print(arrayNumberOne[i] + ", ");
            }
        }

        System.out.print("Array B: ");
        for (int i = 0; i < arrayNumberTwo.length; i++) {
            if (i == arrayNumberTwo.length - 1){
                System.out.print(arrayNumberTwo[i] + "\n");
            } else {
                System.out.print(arrayNumberTwo[i] + ", ");
            }
        }

        System.out.print("Sum of arrays A and B is: ");
        if (arrayNumberOne.length <= arrayNumberTwo.length) {
            for (int i = 0; i < arrayNumberTwo.length; i++) {
                if (i < arrayNumberOne.length) {
                    if (i == arrayNumberTwo.length - 1) {
                        System.out.print((arrayNumberOne[i] + arrayNumberTwo[i]));
                    } else {
                        System.out.print((arrayNumberOne[i] + arrayNumberTwo[i]) + ", ");
                    }
                } else {
                    if (i == arrayNumberTwo.length - 1) {
                        System.out.print(arrayNumberTwo[i]);
                    } else {
                        System.out.print(arrayNumberTwo[i] + ", ");
                    }
                }
            }
        } else {
            for (int i = 0; i < arrayNumberOne.length; i++) {
                if (i < arrayNumberTwo.length) {
                    if (i == arrayNumberOne.length - 1) {
                        System.out.print((arrayNumberOne[i] + arrayNumberTwo[i]));
                    } else {
                        System.out.print((arrayNumberOne[i] + arrayNumberTwo[i]) + ", ");
                    }
                } else {
                    if (i == arrayNumberOne.length - 1) {
                        System.out.print(arrayNumberOne[i]);
                    } else {
                        System.out.print(arrayNumberOne[i] + ", ");
                    }
                }
            }
        }

        // Task 8
        System.out.println("\n\nTask 8: ");
        String[] stringArray = {"tCynM", "Is", "mrkL", "haes", "lkoop", "drtfVGh", "plkPLK"};
        String[] vowelsArray = {"a", "e", "i", "o", "u"};
        int newArrayLength = stringArray.length;

        System.out.print("Array of strings before filtering: {");
        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.print(stringArray[i] + "}.\n");
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < vowelsArray.length; j++) {
                if (stringArray[i].toLowerCase().contains(vowelsArray[j])) {
                    newArrayLength--;
                    break;
                }
            }
        }

        String[] newStringArray = new String[newArrayLength];
        int counter = 0;

        for (int i = 0; i < stringArray.length; i++) {
            boolean containsVowel = false;
            for (int j = 0; j < vowelsArray.length; j++) {
                if (stringArray[i].toLowerCase().contains(vowelsArray[j])) {
                    containsVowel = true;
                    break;
                }
            }
            if (!containsVowel) {
                newStringArray[counter] = stringArray[i];
                counter++;
            }
        }

        System.out.print("Array of strings after filtering: {");
        for (int i = 0; i < newStringArray.length; i++) {
            if (i == newStringArray.length - 1) {
                System.out.print(newStringArray[i] + "}.\n");
            } else {
                System.out.print(newStringArray[i] + ", ");
            }
        }

        // Task 9
        System.out.println("\nTask 9: ");
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                sum += arrayOne[i] + arrayTwo[j];
            }
        }

        System.out.println("Sum of two arrays is: " + sum);
    }
}
