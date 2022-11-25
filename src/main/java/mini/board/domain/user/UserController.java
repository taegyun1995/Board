package mini.board.domain.user;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public Map<String, Object> signup(@ModelAttribute User user) {
        Map<String, Object> map = new HashMap<>();

        User saveUser = userService.save(user);
        UserDTO userDTO = new UserDTO(saveUser.getLoginId(), saveUser.getName());

        map.put("user", userDTO);

        return map;
    }

}
