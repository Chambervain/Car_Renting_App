package ma.inpt.rentingCarApp;

import ma.inpt.rentingCarApp.entities.Car;
import ma.inpt.rentingCarApp.entities.User;
import ma.inpt.rentingCarApp.services.CarService;
import ma.inpt.rentingCarApp.services.NotificationService;
import ma.inpt.rentingCarApp.services.UserService;
import ma.inpt.rentingCarApp.utils.MidnightApplicationRefresh;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.time.LocalDate;
import java.util.Arrays;


@SpringBootApplication
public class CarRentingApplication {

    // class attributes:
    final CarService carService;
    final UserService userService;
    final NotificationService notificationService;
    final BCryptPasswordEncoder pwdEncoder;
    final MidnightApplicationRefresh midnightAppRef;

    // class constructor:
    public CarRentingApplication(CarService carService, UserService userService, NotificationService notificationService, BCryptPasswordEncoder pwdEncoder, MidnightApplicationRefresh midnightAppRef) {
        this.carService = carService;
        this.userService = userService;
        this.notificationService = notificationService;
        this.pwdEncoder = pwdEncoder;
        this.midnightAppRef = midnightAppRef;
    }

    // class methods:
    public static void main(String[] args) {
        SpringApplication.run(CarRentingApplication.class, args);
    }


    @Bean
    CommandLineRunner runner() {
        return args -> {

            User user1 = new User("root", pwdEncoder.encode("1234"), "root1234@gmail.com", "Kris", "Wu", "Qincheng Prison", "0645681329", "Toronto");
            user1.setRole("ROLE_EMPLOYEE");

            User user2 = new User("123123", pwdEncoder.encode("123123"), "365@gmail.com", "Lazy", "Air", "4,Tarik2, Laklak Neighbourhood", "0682670018", "Beijing");
            user2.setRole("ROLE_USER");

            User user3 = new User("admin", pwdEncoder.encode("admin"), "bz2306@nyu.edu", "Bowen", "Zhang", "69 Gelston Ave, BK", "9178253557", "New York");

            User user4 = new User("johndoe123", pwdEncoder.encode("Password123!"), "john.doe@email.com", "John", "Doe", "123 Main Street", "1234567891", "New York");

            User user5 = new User("emily_smith", pwdEncoder.encode("SecurePass456@"), "emily.smith@email.com", "Emily", "Smith", "456 Elm Avenue", "1234567892", "Los Angeles");

            User user6 = new User("mike_williams", pwdEncoder.encode("PassWord789#"), "mike.w@email.com", "Mike", "Williams", "789 Oak Street", "1234567893", "Chicago");

            User user7 = new User("sarah_87", pwdEncoder.encode("BrownPwd12$"), "sarah87@mail.com", "Sarah", "Johnson", "12 Pine Avenue", "1234567894", "Houston");

            User user8 = new User("david_davis", pwdEncoder.encode("DavisPwd34*"), "dave.davis@email.com", "David", "Davis", "34 Cedar Road", "1234567895", "Miami");

            User user9 = new User("olivia_c", pwdEncoder.encode("PassOlivia$"), "oliviac@email.com", "Olivia", "Campbell", "56 Bay Street", "1234567896", "San Francisco");

            User user10 = new User("ethan_lee", pwdEncoder.encode("EthanPwd!23"), "ethanl@email.com", "Ethan", "Lee", "789 Lake Avenue", "1234567897", "Seattle");

            User user11 = new User("mia_rodriguez", pwdEncoder.encode("M1aR0d_#67"), "mia.r@email.com", "Mia", "Rodriguez", "645 Hillside Road", "1234567898", "Dallas");


            userService.save(user1);
            userService.save(user2);
            userService.save(user3);
            userService.save(user4);
            userService.save(user5);
            userService.save(user6);
            userService.save(user7);
            userService.save(user8);
            userService.save(user9);
            userService.save(user10);
            userService.save(user11);


            Car car1 = new Car("Tesla_CyberTruck", "Kris Wu", 2023, 200);
            Car car2 = new Car("Tesla_ModelY", "Mia Rodriguez", 2019, 140);
            Car car3 = new Car("Tesla_ModelS", "Ethan Lee", 2017, 150);
            Car car4 = new Car("Audi_Q8", "Taha Elghabi", 2018, 180);
            Car car5 = new Car("Audi_A6", "Houda Oukessou", 2016, 160);
            Car car6 = new Car("BMW_X5", "Olivia Campbell", 2017, 170);
            Car car7 = new Car("BMW_730", "Oussama Rachidi", 2013, 170);
            Car car8 = new Car("BMW_i8", "Michael Williams", 2018, 180);
            Car car9 = new Car("BenZ_AMG_GTR", "Leah Coleman", 2014, 190);
            Car car10 = new Car("BenZ_ECoupe", "Imad Slimani", 2018, 160);
            Car car11 = new Car("Toyota_Camry", "Aaziz Taleb", 2012, 100);
            Car car12 = new Car("Toyota_Highlander", "Hailey Edwards", 2013, 120);
            Car car13 = new Car("Honda_CRV", "Bahou Basma", 2011, 110);
            Car car14 = new Car("Honda_TypeR", "Piper Simmons", 2015, 150);
            Car car15 = new Car("Porsche_911", "Caleb Perry", 2020, 200);
            Car car16 = new Car("Porsche_Panamera", "Hicham Taibi", 2022, 200);
            Car car17 = new Car("Mazda_CX90", "Olivia Campbell", 2023, 160);
            Car car18 = new Car("Volvo_XC60", "Ethan Lee", 2019, 140);
            Car car19 = new Car("Ford_Focus", "Mia Rodriguez", 2010, 90);
            Car car20 = new Car("Lexus_LC500", "Kris Wu", 2021, 190);


            carService.save(car1);
            carService.save(car2);
            carService.save(car3);
            carService.save(car4);
            carService.save(car5);
            carService.save(car6);
            carService.save(car7);
            carService.save(car8);
            carService.save(car9);
            carService.save(car10);
            carService.save(car11);
            carService.save(car12);
            carService.save(car13);
            carService.save(car14);
            carService.save(car15);
            carService.save(car16);
            carService.save(car17);
            carService.save(car18);
            carService.save(car19);
            carService.save(car20);


            car10.setTheUser(user3);
            car10.setReturnDate(LocalDate.of(2023, 5, 20));


            car1.setTheUser(user1);
            car1.setReturnDate(LocalDate.of(2023, 6, 9));


            user3.setCars(Arrays.asList(car15, car1));

            carService.save(car1);
            carService.save(car15);
            userService.save(user3);

            midnightAppRef.midnightApplicationRefresher();
        };
    }
}
