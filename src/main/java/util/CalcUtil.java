package util;

import java.util.ArrayList;
import java.util.List;

public class CalcUtil {
	public static List<Integer> makePagingSeq(int n, int size , int max){
		List<Integer> seq = new ArrayList<Integer>();
		int pageIndex = (n-1)/size;
		int start = pageIndex*size;
		for(int i= start+1; i<= start+size; i++) {
			if(i> max) break;
			seq.add(i);
		}
		
		return seq;
	}
}
