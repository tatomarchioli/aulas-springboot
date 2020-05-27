package br.com.marchioli.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_USER")
public class User {

    @Id
    @Column(name = "ID")
    @Getter @Setter
    private Long id;

    @Column(name = "NAME")
    @Getter @Setter
    private String name;

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
    
}