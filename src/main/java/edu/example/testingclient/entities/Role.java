package edu.example.testingclient.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @NotNull
    private String title;
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Authority> authorities;

//    @OneToMany(mappedBy = "role")
//    private List<User> users = new ArrayList<>();


}