package com.goit.g2popov.ee02;

/**
 * Created by Андрей on 16.08.2016.
 */
public interface Validator<T> {
        // Валидирует переданое значение
        boolean isValid(T result);
}
