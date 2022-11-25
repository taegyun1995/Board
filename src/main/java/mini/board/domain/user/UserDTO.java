package mini.board.domain.user;

import java.time.LocalDateTime;

public class UserDTO {

    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String phoneNum;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getLoginId() {
        return loginId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public UserDTO() {
    }

    public UserDTO(String loginId, String name) {
        this.loginId = loginId;
        this.name = name;
    }


    public UserDTO(Long id, String loginId, String password, String name, String phoneNum, String email, LocalDateTime createdAt) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.createdAt = createdAt;
    }
}
