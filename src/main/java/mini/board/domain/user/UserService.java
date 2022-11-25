package mini.board.domain.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @PersistenceContext
    private EntityManager em;

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User save(User user) {
        LocalDateTime date = LocalDateTime.now();
        user.setCreatedAt(date);

        Optional<User> userByLoginId = userRepository.findByLoginId(user.getLoginId());
        if (userByLoginId.isPresent() || user.getLoginId().length() < 8) {
            return null;
        } else {
            User saveUser = userRepository.save(user);
            return saveUser;
        }

    }


}
