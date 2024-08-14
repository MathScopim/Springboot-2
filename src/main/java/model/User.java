package model;

import sun.util.resources.Bundles;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.id;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")

    private Integer id;
    @Column(lenght = 50, nullable = false)
    private String name;
    @Column(lenght = 20, nullable = false)
    private String username;
    @Column(lenght = 100, nullable = false)
    private String password;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }
}
