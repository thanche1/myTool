package com.thanasis.demotool2.repository;

import com.thanasis.demotool2.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Override
    List<Project> findAllById(Iterable<Long> iterable);
}
