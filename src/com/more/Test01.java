package com.more;

//Object class - equals �޼ҵ�
//equals ��� �޼ҵ�� �⺻������ object Ÿ���� �ְ� �Ǿ��ִ�.
//������ƮŬ������ equals �޼ҵ� �������̵��ϱ�.
//������ equals�� ������ ���� �����ϰ� �ִ����� Ȯ���ϴ� �޼ҵ��ε�,
//���� ������ equals�� id�� password�� ����.

class User extends Object {
	public String id;
	public String password;
	
	@Override
	public boolean equals(Object o) {//������ƮŸ��, ������ü.//Object o = new User();
		User user = (User)o;
		boolean checkFlag = false;
		if(this.id == user.id && this.password == user.password) {
			checkFlag = true;
		}
		return checkFlag;
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		//Override equals
		User u = new User();
		u.id = "test";
		u.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password = "1234";
		if(u.equals(u2)) {
			System.out.println("Equal a user");
		}
		
		//original equals
		Object o = new Object();
		Object o1 = new Object();
		Object o2 = o;
		if(o.equals(o2)) {
			System.out.println("Equal");
		}else {
			System.out.println("No equal");
		}

	}

}

