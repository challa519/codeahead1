package com.challa.codeahead1.util;

import java.util.HashSet;
import java.util.Set;

public class Circle {
	
	int id;

	@Override
	public int hashCode() {
		HashSet<Circle> set=new HashSet<Circle>();
		
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Circle other = (Circle) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
