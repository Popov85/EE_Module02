package com.goit.g2popov.ee02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 17.08.2016.
 */
public class App {

        public static void main(String[] args) throws Exception {
                App app = new App();
                List<Task<? extends Number>> list = new ArrayList<Task<? extends Number>>();
                list.add(new LongTask(5L));
                list.add(new LongTask(63L));
                list.add(new LongTask(88L));
                list.add(new LongTask(75L));
                list.add(new LongTask(91L));
                app.test(list);
        }

        public void test(List<Task<? extends Number>> intTasks) throws Exception {
                Executor<Number> numberExecutor = new ExecutorImpl();

                for (Task<? extends Number> intTask : intTasks) {
                        numberExecutor.addTask(intTask);
                }
                numberExecutor.addTask(new LongTask(10L), new NumberValidator());
                numberExecutor.addTask(new LongTask(8L), new NumberValidator());
                numberExecutor.addTask(new LongTask(20L), new NumberValidator());
                numberExecutor.addTask(new LongTask(9L), new NumberValidator());
                numberExecutor.addTask(new LongTask(4L), new NumberValidator());

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
