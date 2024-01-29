package br.dev.enick.projmanag.modules.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.enick.projmanag.modules.project.ProjectEntity;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/project")

public class ProjectController {


  @PostMapping("/")
  public void create(@Valid @RequestBody ProjectEntity projectEntity) {
    System.out.println("projeto criado");
    System.out.println(projectEntity);
  }
  
}
