package dev.toktab.clevercloud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "username", nullable = false, length = 16)
    private String username;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", nullable = false, length = 32)
    private String password;

    @Column(name = "create_time")
    private Timestamp createTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
