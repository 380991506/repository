package com.thinkinjava.class2;

public class Dog {

	String name;
	String says;
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((says == null) ? 0 : says.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (says == null) {
			if (other.says != null)
				return false;
		} else if (!says.equals(other.says))
			return false;
		return true;
	}
	
}
