package ru.alexanderB.Secure.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table (name = "usrG")
@Data
public class UserG {
    @Id
    private String id;
    private String name;
    private String email;
    private String gender;
    private String locale;
    private String userpic;
    private LocalDateTime lastVisit;

}
