package com.neosoft.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+44}")
	private int x;
	@Value("#{34+5+12+7}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private Double z;
	@Value("#{T(java.lang.Math).PI}")
	private Double pi;
	@Value("#{new java.lang.String('Riddhi Chavan')}")
	private String name;
	@Value("#{8-2 != 5}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
