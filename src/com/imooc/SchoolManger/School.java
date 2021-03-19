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
		 System.out.println("ɾ���ɹ���");
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
		 System.out.println("����ƽ���ɼ��ɴ�С������Ϊ��");
		 for(Banji banji:BanjiList) {
			 System.out.println(banji.getClassName()+"��ƽ���֣�"+ banji.getAvgscore());
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
		 System.out.println("��ѧƽ���ɼ��ɴ�С������Ϊ��");
		 for(Banji banji:BanjiList) {
			 System.out.println(banji.getClassName()+"��ƽ���֣�"+ banji.getAvgscore());
		 }	 
	 }
	 
	 public void displayBanJiName() {
		 Set<String>schoolSet = schoolMap.keySet();
		 for(String s:schoolSet) {
			System.out.println(schoolMap.get(s).getClassName());
		 }
		 
	 }

}
