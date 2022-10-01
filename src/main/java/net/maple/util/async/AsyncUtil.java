package net.maple.util.async;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import net.maple.callback.Callback;

public class AsyncUtil {
	
	private static final ThreadPoolExecutor THREAD_POOL = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue<>());
	
	// TODO don't use callbacks?
	public static void runAsync(Callback callback) {
		Runnable runnable = () -> callback.run();
		
		THREAD_POOL.execute(runnable);
	}
	
}
