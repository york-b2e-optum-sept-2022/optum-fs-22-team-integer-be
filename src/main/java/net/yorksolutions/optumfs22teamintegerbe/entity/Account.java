package net.yorksolutions.optumfs22teamintegerbe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;
    @Column(unique = true)
    private String email;
    @JsonIgnore
    private String password;
    private int type;

    public Account(){}

    public Account(String email, String password, int type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
