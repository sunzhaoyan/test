package com.test.map;

public class Obj {
	private String name;
	private String roleName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Obj [name=" + name + ", roleName=" + roleName + "]";
	}

}
