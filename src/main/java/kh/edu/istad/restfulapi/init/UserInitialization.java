package kh.edu.istad.restfulapi.init;


import jakarta.annotation.PostConstruct;
import kh.edu.istad.restfulapi.model.User;
import kh.edu.istad.restfulapi.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserInitialization {

    private final UserRepository userRepository;

    public UserInitialization(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    void init() {
        log.info("Initializing user data...");

        // 1. Create entity object
        User user1 = new User();
        user1.setName("Administrator");
        user1.setUsername("admin");
        user1.setPassword("1234");
        user1.setIsActive(true);

        User user2 = new User();
        user2.setName("Student");
        user2.setUsername("user");
        user2.setPassword("1234");
        user2.setIsActive(true);

        User user3 = new User();
        user3.setName("Teacher");
        user3.setUsername("teacher");
        user3.setPassword("1234");
        user3.setIsActive(true);

        // 2. Start saving user into database table
        if (userRepository.count() == 0) {
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }
    }

}
