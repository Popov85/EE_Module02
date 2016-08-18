package com.goit.g2popov.ee02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 17.08.2016.
 */
public class ExecutorImpl implements Executor<Number> {

        /*Storage of tasks to be executed*/
        private List<Task<? extends Number>> numTasks = new ArrayList<Task<? extends Number>>();

        /* Flag that says if execute() method has already been called*/
        private boolean isExecuted = false;

        private List<Number> validResults = new ArrayList<Number>();

        private List<Number> invalidResults = new ArrayList<Number>();;


        @Override
        public void addTask(Task<? extends Number> task) throws Exception {
                if (isExecuted) throw new Exception("Already executed!");
                this.numTasks.add(task);
        }

        @Override
        public void addTask(Task<? extends Number> task, Validator<Number> validator) throws Exception {
                task.execute();
                Number result = task.getResult();
                if (validator.isValid(result)) {
                        validResults.add(result);
                } else {
                        invalidResults.add(result);
                }
                //addTask((Task<Number>) task);
        }

        @Override
        public void execute() {
                this.isExecuted = true;
                for (Task<? extends Number> numTask : numTasks) {
                        numTask.execute();
                }
        }

        @Override
        public List<Number> getValidResults() throws Exception {
                if (!isExecuted) throw new Exception("Not executed!");
                return validResults;
        }

        @Override
        public List<Number> getInvalidResults() throws Exception {
                if (!isExecuted) throw new Exception("Not executed!");
                return invalidResults;
        }
}
