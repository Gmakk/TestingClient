package edu.example.testingclient.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @NotNull
    private String title;
    @ManyToOne
    private Userr director;

//    @OneToMany(mappedBy = "project")
//    private List<TestPlan> testPlans = new ArrayList<>();
//    @OneToMany(mappedBy = "project")
//    private List<TestCase> testCases = new ArrayList<>();

}
