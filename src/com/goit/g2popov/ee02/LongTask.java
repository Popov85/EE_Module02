package com.goit.g2popov.ee02;

/**
 * Created by Андрей on 17.08.2016.
 */
public class LongTask implements Task<Long> {

        /*Some initial variable affecting the result*/
        private Long var;

        private Long result;

        public LongTask(Long var) {
                this.var = var;
        }

        /**
         * Increases the var variable to 1 an provides some message
         */
        @Override
        public void execute() {
                result = var+1;
                System.out.println("Task from "+this.getClass()+" has been executed with the result: "+result);
        }

        @Override
        public Long getResult() {
                return result;
        }
}
