package br.com.restmonitoring;

import java.util.ArrayDeque;

public class Queue {

    private java.util.Queue<ObjectToCompare> queue;

    public Queue() {
        queue = new ArrayDeque<ObjectToCompare>();
    }

    public java.util.Queue<ObjectToCompare> getQueue() {
        return queue;
    }

    private static class ObjectToCompare {

        private Object before;
        private Object after;

        public ObjectToCompare(Object before, Object after) {
            this.before = before;
            this.after = after;
        }
    }
}