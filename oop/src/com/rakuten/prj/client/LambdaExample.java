package com.rakuten.prj.client;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExample {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {
			@Override
			public Double apply(Integer t) {
				return t / 2.0;
			}
		};
		
		System.out.println(f1.apply(5));
		
		Function<Integer, Double> f2 = (Integer t) -> {
			return t / 2.0;
		};
		
		System.out.println(f2.apply(5));
		
		
		Function<Integer, Double> f3 = t -> t/2.0;
		
		System.out.println(f3.apply(7));
		
		BiFunction<Integer, Integer, Integer> f4 = (t1,t2) -> t1 * t2;
		System.out.println(f4.apply(5, 3));
		
		
	}

}
