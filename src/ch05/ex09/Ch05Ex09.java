package ch05.ex09;

import java.util.concurrent.locks.ReentrantLock;

public class Ch05Ex09 {
	public static AutoCloseableReentrantLock lock(ReentrantLock reentrantLock) {
		return (AutoCloseableReentrantLock) reentrantLock;	
	}
	
	public static class AutoCloseableReentrantLock extends ReentrantLock implements AutoCloseable {
		@Override
		public void close() {
			try {
				unlock();
			} catch (IllegalMonitorStateException ex) {
				System.err.println("Current thread doesn't hold this lock");
			}
		}
	}
}
