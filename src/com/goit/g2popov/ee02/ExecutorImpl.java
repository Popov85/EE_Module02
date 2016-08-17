package com.goit.g2popov.ee02;

import java.util.List;

/**
 * Created by Андрей on 17.08.2016.
 */
public class ExecutorImpl implements Executor<Number> {

        private List<Number> validResults;

        private List<Number> invalidResults;


        @Override
        public void addTask(Task<Number> task) {

        }

        @Override
        public void addTask(Task<? extends Number> task, Validator<Number> validator) {

        }

        @Override
        public void execute() {

        }

        @Override
        public List<Number> getValidResults() {
                return validResults;
        }

        @Override
        public List<Number> getInvalidResults() {
                return invalidResults;
        }
}
