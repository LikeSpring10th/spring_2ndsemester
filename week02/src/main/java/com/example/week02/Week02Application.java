package com.example.week02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//이 아래의 위치부터 설정을 읽어가기때문에, 이 클래스는 항상 프로젝트의 최상단에 위치해야함
@SpringBootApplication  //스프링부트의 자동설정, 스프링 Bean읽기와 생성 모두 자동으로 설정됨
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}
	//SpringApplication.run은 내장 WAS를 실행함

}
