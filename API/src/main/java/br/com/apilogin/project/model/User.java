package br.com.apilogin.project.model;

import jakarta.persistence.*;

@Entity(name = "users")
@Table(name = "users", schema = "user_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 200, nullable = true)
    private String name;
    @Column(name = "email", length = 200, nullable = true)
    private String email;
    @Column(name = "password", columnDefinition = "TEXT", nullable = true)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
