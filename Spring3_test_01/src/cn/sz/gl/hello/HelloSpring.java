package cn.sz.gl.hello;

public class HelloSpring {
	
	private String name;
	private Dog dog;

	public void show(){
		System.out.println("show,name="+name+",dog的信息：品种："+dog.getStrain());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
