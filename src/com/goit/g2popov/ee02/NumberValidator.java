package com.goit.g2popov.ee02;

/**
 * Created by Андрей on 17.08.2016.
 */
public class NumberValidator implements Validator<Number> {
        @Override
        public boolean isValid(Number number) {
                return (number.doubleValue() >= 5 && number.doubleValue() <= 10);
        }
}
