package com.goit.g2popov.ee02;

import java.util.List;

/**
 * Created by Андрей on 17.08.2016.
 */
public class App {

        public static void main(String[] args) {
                App app = new App();
        }

        public void test(List<Task<Number>> intTasks) throws Exception {
                Executor<Number> numberExecutor = new ExecutorImpl();

                for (Task<Number> intTask : intTasks) {
                        numberExecutor.addTask(intTask);
                }
                numberExecutor.addTask(new LongTask(10L), new NumberValidator());

                numberExecutor.execute();

                System.out.println("Valid results:");
                for (Number number : numberExecutor.getValidResults()) {
                        System.out.println(number);
                }
                System.out.println("Invalid results:");
                for (Number number : numberExecutor.getInvalidResults()) {
                        System.out.println(number);
                }
        }
}
