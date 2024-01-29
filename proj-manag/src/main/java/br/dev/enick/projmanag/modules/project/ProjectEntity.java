package br.dev.enick.projmanag.modules.project;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProjectEntity {

  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String description;
  @NotBlank
  private String startDate;
  private String endDate;
  private String members;
  @NotBlank
  private Integer memberId;
  
}
