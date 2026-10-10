package com.zentiq.code.UsingCallableInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {

		ExecutorService service = Executors.newSingleThreadExecutor();

		MyTask task = new MyTask();

		Future<Integer> future = service.submit(task);

		Integer result = future.get();

		System.out.println("Result = " + result);

		service.shutdown();
	}
}