package org.example;

public abstract class Logger {
        public static int INFO = 1;
        public static int DEBUG = 2;
        public static int ERROR = 3;
        protected int level;
        protected Logger nextLogger;

        public void setNextLogger(Logger nextLogger) {
            this.nextLogger = nextLogger;
        }
        public void logMessage(int level, String message) {
            if (this.level <= level) {
                write(message);
            }
        }
        protected abstract void write(String message);
}
