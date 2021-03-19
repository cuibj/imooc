package com.imooc.SchoolManger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class School {
	Map<String, Banji>schoolMap;
	
	public School() {
		schoolMap=new HashMap<String,Banji>();
	}

	public Map<String, Banji> getSchoolMap() {
		return schoolMap;
	}

	public void setSchoolMap(Map<String, Banji> schoolMap) {
		this.schoolMap = schoolMap;
	}
	
	public void addBanji(Banji banji){
		schoolMap.put(banji.getClassName(), banji);
	}
	
	 public void deleteBanji(Banji banji){
		 schoolMap.remove(banji.getClassName());
		 System.out.println("删除成功！");
	 }
	 
	 public Banji searchByName(String className) {
		 Banji ans = null;
		 Set<String>schoolSet = schoolMap.keySet();
		 for(String s:schoolSet) {
			 if (s.equals(className)){
				 ans = schoolMap.get(s);
				 break;
			 }
		 }
		 return ans;
	 }
	 
	 public void sortChineseByAverage() {
		 List<Banji> BanjiList = new ArrayList<Banji>();
		 Set<String>schoolSet = schoolMap.keySet();
		 for(String s:schoolSet) {
			 Banji banji = schoolMap.get(s);
			 banji.setAvgscore(banji.calAverageChinseScore());
			 BanjiList.add(banji);
		 }
		 Collections.sort(BanjiList, new BanjiCompare());
		 System.out.println("语文平均成绩由大到小的排序为：");
		 for(Banji banji:BanjiList) {
			 System.out.println(banji.getClassName()+"的平均分："+ banji.getAvgscore());
		 }	 
	 }
	 
	 public void sortMathByAverage() {
		 List<Banji> BanjiList = new ArrayList<Banji>();
		 Set<String>schoolSet = schoolMap.keySet();
		 for(String s:schoolSet) {
			 Banji banji = schoolMap.get(s);
			 banji.setAvgscore(banji.calAverageMathScore());
			 BanjiList.add(banji);
		 }
		 Collections.sort(BanjiList, new BanjiCompare());
		 System.out.println("数学平均成绩由大到小的排序为：");
		 for(Banji banji:BanjiList) {
			 System.out.println(banji.getClassName()+"的平均分："+ banji.getAvgscore());
		 }	 
	 }
	 
	 public void displayBanJiName() {
		 Set<String>schoolSet = schoolMap.keySet();
		 for(String s:schoolSet) {
			System.out.println(schoolMap.get(s).getClassName());
		 }
		 
	 }

}
