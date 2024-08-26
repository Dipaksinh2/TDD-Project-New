package com.tdd.string;


import org.springframework.lang.NonNull;

public class CalculateString {

        public int add(@NonNull String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            String[] numArray = numbers.split(",");
            int sum = 0;
            for (String num : numArray) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }


}
