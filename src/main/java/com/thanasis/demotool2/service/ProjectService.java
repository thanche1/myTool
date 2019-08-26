package com.thanasis.demotool2.service;

import com.thanasis.demotool2.domain.Project;
import com.thanasis.demotool2.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        //Login

        return projectRepository.save(project);

    }

}


