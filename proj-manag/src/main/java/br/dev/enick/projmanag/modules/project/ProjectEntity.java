package br.dev.enick.projmanag.modules.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "project")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProjectEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @NotBlank
  private String name;

  @NotBlank
  private String description;
  
  @NotBlank
  private String startDate;
  private String endDate;
  private String members;
  private Integer memberId;
  
}
