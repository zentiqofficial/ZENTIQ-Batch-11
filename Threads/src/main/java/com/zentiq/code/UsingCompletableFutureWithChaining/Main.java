package com.zentiq.code.UsingCompletableFutureWithChaining;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) throws Exception {

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {

			System.out.println("Task 1");
			return 10;
		})

				.thenApply(result -> {

					System.out.println("Task 2");
					return result * 2;
				})

				.thenApply(result -> {

					System.out.println("Task 3");
					return result + 5;
				});

		future.thenAccept(result -> {
			System.out.println("Final Result = " + result);
		});

		Thread.sleep(1000);
	}
}

//Future does not support direct asynchronous chaining.
//
//CompletableFuture supports asynchronous chaining using methods like:
//thenApply(), thenAccept(), thenCompose(), etc.
//
//Example flow:
//
//Task 1
//↓
//thenApply()
//↓
//Task 2
//↓
//thenApply()
//↓
//Task 3
//↓
//thenAccept()
//↓
//Final Result