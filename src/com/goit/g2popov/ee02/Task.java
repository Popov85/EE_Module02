package com.goit.g2popov.ee02;

/**
 * Created by Андрей on 16.08.2016.
 */
public interface Task {
        // Метода запускает таск на выполнение
        void execute();

        // Возвращает результат выполнения
        Object getResult();
}
