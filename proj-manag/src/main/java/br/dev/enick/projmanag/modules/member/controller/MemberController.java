package br.dev.enick.projmanag.modules.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.enick.projmanag.modules.member.MemberEntity;

@RestController
@RequestMapping("/member")

public class MemberController {


  @PostMapping("/")
  public void create(@RequestBody MemberEntity memberEntity) {
    System.out.println("Membro criado");
    System.out.println(memberEntity);
  }
  
}
