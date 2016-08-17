package com.goit.g2popov.ee02;

/**
 * Created by Андрей on 17.08.2016.
 */
public class LongTask implements Task<Long> {

        private Long result;

        public LongTask(Long result) {
                this.result = result;
        }

        @Override
        public void execute() {
        }

        @Override
        public Long getResult() {
                return null;
        }
}
