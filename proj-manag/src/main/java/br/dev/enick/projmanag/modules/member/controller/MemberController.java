package br.dev.enick.projmanag.modules.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.enick.projmanag.modules.member.MemberEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/member")

public class MemberController {

  
  @GetMapping("/")
  public void get() {
    System.out.println("Membro listado");
  }

  @PostMapping("/")
  public void create(@Valid @RequestBody MemberEntity memberEntity) {
    System.out.println("Membro criado");
    System.out.println(memberEntity);
  }
  
}
