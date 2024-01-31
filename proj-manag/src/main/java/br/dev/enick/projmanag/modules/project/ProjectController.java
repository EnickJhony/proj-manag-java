package br.dev.enick.projmanag.modules.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

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

    @PostMapping("/")
  public ResponseEntity createProject(@Valid @RequestBody ProjectEntity projectEntity) {
    projectRepository.save(projectEntity);
    return ResponseEntity.status(HttpStatus.CREATED).build();
    
  }
}
