package mini.board.domain.user;

import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String loginId;

    private String password;

    private String name;

    private String phoneNum;

    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User() {
    }

    public User(Long id, String loginId, String password, String name, String phoneNum, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
