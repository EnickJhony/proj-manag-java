package br.dev.enick.projmanag.modules.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
  
  @Autowired
  private ProjectRepository projectRepository;

  public List<ProjectEntity> findAll() {
    return (List<ProjectEntity>) projectRepository.findAll();
  }

}
