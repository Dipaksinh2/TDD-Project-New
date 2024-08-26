package com.tdd.string;


import org.springframework.lang.NonNull;

public class CalculateString {

        public int add(@NonNull String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            String delimiter = "[,|\n]"; // Default delimiters
            if (numbers.startsWith("//")) {
                int delimiterEndIndex = numbers.indexOf('\n');
                delimiter = numbers.substring(2, delimiterEndIndex);
                numbers = numbers.substring(delimiterEndIndex + 1);
                delimiter = delimiter.replace("]", "").replace("[", "\\");
            }
            String[] numArray = numbers.split(delimiter);
            int sum = 0;
            StringBuilder negatives = new StringBuilder();
            for (String num : numArray) {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    if (negatives.length() > 0) {
                        negatives.append(",");
                    }
                    negatives.append(number);
                } else {
                    sum += number;
                }
            }
            if (negatives.length() > 0) {
                throw new IllegalArgumentException("negative numbers not allowed " + negatives);
            }
            return sum;
        }


}
