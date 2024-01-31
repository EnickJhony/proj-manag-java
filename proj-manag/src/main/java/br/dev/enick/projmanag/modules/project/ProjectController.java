package br.dev.enick.projmanag.modules.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

  @Autowired
  private ProjectRepository projectRepository;

  @GetMapping("/")
  public ResponseEntity<List<ProjectEntity>> getAllProjects() {
    var allProjects = projectRepository.findAll();
    return ResponseEntity.ok(allProjects);
  }
}
