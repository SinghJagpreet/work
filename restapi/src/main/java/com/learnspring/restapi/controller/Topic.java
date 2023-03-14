package com.learnspring.restapi.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Topic {

	private String id;

	private String name;

	private String description;

}
