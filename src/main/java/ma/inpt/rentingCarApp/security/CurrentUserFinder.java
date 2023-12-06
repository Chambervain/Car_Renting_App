package ma.inpt.rentingCarApp.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ma.inpt.rentingCarApp.entities.User;
import ma.inpt.rentingCarApp.services.UserService;

@Service
public class CurrentUserFinder {

    final UserService userService;

    public CurrentUserFinder(UserService userService) {
        this.userService = userService;
    }

    public long getCurrentUserId() {
        UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = details.getUsername();
        long userId = -1;

        for (User user : userService.findAll()) {
            if (user.getUserName().equals(username)) {
                userId = user.getUserId();
                break;
            }
        }
        return userId;
    }

    public User getCurrentUser() {
        return userService.findById(getCurrentUserId());
    }
}
