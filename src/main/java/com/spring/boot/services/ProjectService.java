package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void addProject(Project project);
	
	public List<Project> getProjects();
}
