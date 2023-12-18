package ma.inpt.rentingCarApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import ma.inpt.rentingCarApp.DAO.UserRepository;
import ma.inpt.rentingCarApp.entities.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    // class attribute:
    final UserRepository userRepo;

    // class constructor:
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    // class methods:
    public void save(User user) {
        userRepo.save(user);
    }

    public void saveById(Long userId) {

        Optional<User> optionalUser = userRepo.findById(userId);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            userRepo.save(user);
        }

        return;
    }

    public User findById(long id) {

        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }
        else{
            return null;
        }

    }

    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    public List<User> userSearcher(String firstName, String lastName) {
        if (firstName != null && lastName != null) return getByFullName(firstName, lastName);
        else if (firstName == null && lastName != null) return getByLastName(lastName);
        else if (firstName != null) return getByFirstName(firstName);
        else return new ArrayList<>();
    }

    public List<User> getByFirstName(String firstName) {
        List<User> users = new ArrayList<>();
        for (User user : userRepo.findAll()) {
            if (user.getFirstName().toLowerCase().contains(firstName.toLowerCase())) {
                users.add(user);
            }
        }
        return users;
    }

    public List<User> getByLastName(String lastName) {
        List<User> users = new ArrayList<>();
        for (User user : userRepo.findAll()) {
            if (user.getLastName().toLowerCase().contains(lastName.toLowerCase())) {
                users.add(user);
            }
        }
        return users;
    }

    public List<User> getByFullName(String firstName, String lastName) {
        List<User> users = new ArrayList<>();
        for (User user : userRepo.findAll()) {
            if (user.getFirstName().toLowerCase().contains(firstName.toLowerCase()) &&
                    user.getLastName().toLowerCase().contains(lastName.toLowerCase())) {
                users.add(user);
            }
        }
        return users;
    }

}