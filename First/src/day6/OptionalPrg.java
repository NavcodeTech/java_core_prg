package day6;

import java.util.Optional;

public class OptionalPrg {
	public static void main(String[] args) {
		// Integer x=null;
		Integer x=123;
		Optional<Integer> opt=Optional.ofNullable(x);
		if(opt.isEmpty())
			System.out.println("Null values");
		else
			System.out.println(opt.get());
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("not present");
		
		System.out.println(opt.orElse(100));
	}
}
