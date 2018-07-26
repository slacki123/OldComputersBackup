package intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueSum {
	
	//below is a very sophisticated unique sum method that works for more than 3 values. It's kind of complex but cool.

	public int uniqueSum(int[] array) {
		
		if(array.length == 1) return array[0];
		if(IntStream.of(array).distinct().count() == 1) return 0;
		
		for(int index : getDuplicateIndexes(array)) {
			array[index] = 0;
		}
		return IntStream.of(array).sum();
	}
	
	private List<Integer> getDuplicateIndexes(int[] array){	
		List<Integer> duplicateIndexes = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				
			    if(i==j) continue;
			    
			    if(array[i] == array[j]) {
			    	duplicateIndexes.add(i);
			    	duplicateIndexes.add(j);
			    }
			}
		}
		return duplicateIndexes.stream().distinct().collect(Collectors.toList());
	}
}




//below is a simple version of the 3 parameter unique sum method

//if(a!=b&&b!=c) {
//	return a+b+c;
//}
//
//else if(a==b&&b==c) {
//	return 0;
//}
//else if (a==b) {
//	return c;
//}
//else if (b==c) {
//	return a;
//}
//else {
//	return b;
//}
