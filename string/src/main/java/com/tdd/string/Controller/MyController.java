package com.tdd.string.Controller;


import org.springframework.lang.NonNull;

public class MyController {

        public int add(@NonNull String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(numbers);
        }


}
