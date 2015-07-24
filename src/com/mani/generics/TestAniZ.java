package com.mani.generics;

public class TestAniZ <T extends TestClassAni> {
	
	T animal;
	
	void addAni(T animal) {
		this.animal = animal;
	}
	
	T getAni() {
		return animal;
	}

}
