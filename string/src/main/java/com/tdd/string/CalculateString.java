package com.tdd.string;


import org.springframework.lang.NonNull;

public class CalculateString {

        public int add(@NonNull String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            String delimiter = "[,\n]"; // Default delimiters
            if (numbers.startsWith("//")) {
                int delimiterEndIndex = numbers.indexOf("\n");
                delimiter = numbers.substring(2, delimiterEndIndex);
                numbers = numbers.substring(delimiterEndIndex + 1);
                delimiter = delimiter.replace("]", "").replace("[", "\\");
            }
            String[] numArray = numbers.split(delimiter);
            int sum = 0;
            for (String num : numArray) {
                System.out.println("Number is :-"+num);
                sum += Integer.parseInt(num);
            }
            return sum;
        }


}
