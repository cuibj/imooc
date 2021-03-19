package com.imooc.SchoolManger;

import java.util.ArrayList;
import java.util.List;

public class Banji {
	private String classId;
	private String className;
	private List<Student> stuList;
	private float avgscore;
	
	

	public Banji(String clasId, String className) {
		this.classId = clasId;
		this.className = className;
		this.stuList = new ArrayList<Student>();
	}
	
	public String getClasId() {
		return classId;
	}
	public void setClasId(String clasId) {
		this.classId = clasId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	public Student searchStudentByNum(String stuNum){
		for(Student stu:stuList) {
			if(stu.getStuNum().equals(stuNum)) {
				return stu;
			}
		}
		return null;
	}
	
	public void insertChineseScore(String stuNum,float score){
		boolean flag = true;
		for(Student stu:stuList) {
			if(stu.getStuNum().equals(stuNum)) {
				stu.setChinese(score);
				System.out.println("添加语文成绩成功！");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("未找到学号为"+stuNum+"的学生！");
		}
	}
	
	public void insertMathScore(String stuNum,float score){
		boolean flag = true;
		for(Student stu:stuList) {
			if(stu.getStuNum().equals(stuNum)) {
				stu.setMath(score);
				System.out.println("添加数学成绩成功！");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("未找到学号为"+stuNum+"的学生！");
		}
	}
	
	public void deleteStudent(String stuNum){
		Student stu = searchStudentByNum(stuNum);
		if(stu!=null) {
			stuList.remove(stu);
			System.out.println("删除成功！");
		}else {
			System.out.println("未找到学号为"+stuNum+"的学生！");
		}
		
	}
	
	public void addToStuList(Student stu) {
		boolean flag = false;
		for(Student s:stuList) {
			if(s.equals(stu)) {
				flag=true;break;
			}
		}
		if(flag) {
			System.out.print("该学生已存在，添加失败！");
		}else {
			stuList.add(stu);
		}
	}
	
	public void displayAllStu() {
		System.out.print("该班级所有学生信息为：");
		for(Student stu:stuList) {
			System.out.println(stu);
		}
	}
	
	public float calAverageChinseScore() {
		float sum = 0; 
		int n = 0;
		if(stuList==null) {
			System.out.println("学生列表为空！");
			return (-1);
		}
		for(Student stu: stuList) {
			sum+=stu.getChinese();
			n+=1;
		}
		return sum/n;		
	}
	
	public float calAverageMathScore() {
		float sum = 0; 
		int n = 0;
		if(stuList==null) {
			System.out.println("学生列表为空！");
			return (-1);
		}
		for(Student stu: stuList) {
			sum+=stu.getMath();
			n+=1;
		}
		return sum/n;		
	}
	
	public float getAvgscore() {
		return avgscore;
	}

	public void setAvgscore(float avgscore) {
		this.avgscore = avgscore;
	}
}
