package com.imooc.SchoolManger;

public class Student {
	private String stuNum;
	private String stuName;
	private float math;
	private float chinese;
	
	public Student(String stuNum, String stuName, float math, float chinese) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.math = math;
		this.chinese = chinese;
	}
	
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getChinese() {
		return chinese;
	}
	public void setChinese(float chinese) {
		this.chinese = chinese;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(chinese);
		result = prime * result + Float.floatToIntBits(math);
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		result = prime * result + ((stuNum == null) ? 0 : stuNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() == Student.class) {
			Student stu = (Student)obj;
			return(stu.getStuNum().equals(stuNum)&&stu.getStuName().equals(stuName)&&stu.getMath()==math&&stu.getChinese()==chinese);
		}
		return false;
	}

	@Override
	public String toString() {
		return "学生信息： [学号： " + stuNum + ", 姓名： " + stuName + "]";
	}
	
	

}
