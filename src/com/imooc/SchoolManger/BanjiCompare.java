package com.imooc.SchoolManger;

import java.util.Comparator;

public class BanjiCompare implements Comparator<Banji> {

	@Override
	public int compare(Banji o1, Banji o2) {
		// TODO Auto-generated method stub
		float s1 = o1.getAvgscore();
		float s2 = o2.getAvgscore();
		return (int) (s2-s1) ;
	}

	

}
