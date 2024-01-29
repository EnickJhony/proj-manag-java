package br.dev.enick.projmanag.modules.project;

import lombok.Data;

@Data
public class ProjectEntity {

  private Long id;
  private String name;
  private String description;
  private String startDate;
  private String endDate;
  private String members;
  private String memberId;
  
}
