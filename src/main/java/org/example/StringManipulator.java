package org.example;

public class StringManipulator {
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public int countVowels(String input) {
        int vowelCount = 0;
        String lowercaseInput = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}