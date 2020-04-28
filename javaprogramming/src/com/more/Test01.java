package com.more;

//Object class - equals 메소드
//equals 라는 메소드는 기본적으로 object 타입을 넣게 되어있다.
//오브젝트클래스의 equals 메소드 오버라이딩하기.
//원래의 equals는 동일한 것을 참조하고 있는지를 확인하는 메소드인데,
//새로 정의한 equals는 id와 password를 비교함.

class User extends Object {
	public String id;
	public String password;
	
	@Override
	public boolean equals(Object o) {//오브젝트타입, 유저객체.//Object o = new User();
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

