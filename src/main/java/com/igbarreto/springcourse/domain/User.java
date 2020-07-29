package com.igbarreto.springcourse.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//lombook
@AllArgsConstructor // construtor com todos os parametros
@NoArgsConstructor // construtor vazio
@Getter @Setter // setters e getters
public class User {

	private long id;
	private String name;
	private String email;
	private String password;
	private Role role;
	private List<Request> requests = new ArrayList<Request>();
	private List<RequestStage> stages = new ArrayList<RequestStage>();
	
	
	
}
