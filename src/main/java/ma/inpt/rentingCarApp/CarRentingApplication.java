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

            User user1 = new User("test", pwdEncoder.encode("test"), "testing@gmail.com", "Shohei", "Ohtani", "countryside of Japan", "0762436500", "Tokyo");
            user1.setRole("ROLE_ADMIN");

            User user2 = new User("root", pwdEncoder.encode("1234"), "root1234@gmail.com", "Max", "Verstappen", "chichawa chichawa", "0645681329", "Netherlands");
            user2.setRole("ROLE_EMPLOYEE");

            User user3 = new User("123123", pwdEncoder.encode("123123"), "365@gmail.com", "Lazy", "Air", "4,Tarik2, Laklak Neighbourhood", "0682670018", "Beijing");
            user3.setRole("ROLE_USER");

            User user4 = new User("admin", pwdEncoder.encode("admin"), "bz2306@nyu.edu", "Bowen", "Zhang", "69 Gelston Ave, BK", "9178253557", "New York");


            userService.save(user1);
            userService.save(user2);
            userService.save(user3);
            userService.save(user4);


            Car car1 = new Car("Corolla : Toyota", "Mohammed Hachami", 2001, 1);
            Car car2 = new Car("308 : Peugeot", "Mohammed Batrone", 2000, 1);
            Car car3 = new Car("Tucson : Hyundai", "Taha Bouasria", 2012, 3);
            Car car4 = new Car("Focus : Ford", "Taha Elghabi", 2007, 2);
            Car car5 = new Car("Astra : Opel", "Houda Oukessou", 2013, 3);
            Car car6 = new Car("CLA : Mercedes", "Mohammed Idrissi", 1002, 2);
            Car car7 = new Car("Logan : Dacia", "Oussama Rachidi", 2002, 2);
            Car car8 = new Car("Clio4 : Renault", "Yassir Kassimi", 2011, 1);
            Car car9 = new Car("308 : Peugeot", "Intissar Labiad", 2009, 1);
            Car car10 = new Car("Golf : VolksWagen", "Imad Slimani", 2015, 3);
            Car car11 = new Car("Fabia : SKoda", "Aaziz Taleb", 2005, 1);
            Car car12 = new Car("Uno : Fiat", "Achak Nizar", 2008, 1);
            Car car13 = new Car("Punto : Fiat", "Bahou Basma", 2000, 2);
            Car car14 = new Car("Kuga : Ford", "Ibrahim Jouhari", 2001, 3);
            Car car15 = new Car("ClasseE : Mercedes", "Salim Zaidi", 2005, 3);
            Car car16 = new Car("Tiguan : VolksWagen", "Hicham Taibi", 2016, 2);
            Car car17 = new Car("Evoque : RangeRover", "Alae Abjabja", 2014, 1);
            Car car18 = new Car("Fiesta : Ford", "Ismail Ouafi", 2012, 2);
            Car car19 = new Car("Micra : Nissan", "Khalil Amraoui", 2009, 2);
            Car car20 = new Car("Qashqai : Nissan", "Omar Mouad", 2016, 3);
            Car car21 = new Car("Megane : Renault", "Manal Riad", 2006, 3);
            Car car22 = new Car("Leon : Seat", "Amine Meftah", 2015, 1);
            Car car23 = new Car("Picanto : Kia", "Abdellah Chadid", 2001, 2);
            Car car24 = new Car("Micra : Nissan", "Meryem Fadil", 2017, 3);
            Car car25 = new Car("500 : Fiat", "Marouane Naji", 2016, 1);
            Car car26 = new Car("X5 : BMW", "Omar Bahri", 2009, 1);
            Car car27 = new Car("Q8 : Audi", "Youssef Assil", 2011, 1);
            Car car28 = new Car("A4 : Audi", "Ihssane   Grini", 2010, 2);
            Car car29 = new Car("508 : Peugeot", "Selma Yamani", 2017, 3);
            Car car30 = new Car("Ibiza : Seat", "Zineb Oufkir", 2013, 1);
            Car car31 = new Car("Corsa : Opel", "Aymane Sabir", 2014, 1);
            Car car32 = new Car("C3 : Citroen", "Ahmed Ghazouani", 2009, 2);
            Car car33 = new Car("C4 : Citroen", "Kawtar Maaroufi", 2020, 3);
            Car car34 = new Car("XC60 : VOLVO", "Anouar Halimi", 2019, 3);
            Car car35 = new Car("Fiesta : Ford", "Mohammed Bacha", 2016, 3);


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
            carService.save(car21);
            carService.save(car22);
            carService.save(car23);
            carService.save(car24);
            carService.save(car25);
            carService.save(car26);
            carService.save(car27);
            carService.save(car28);
            carService.save(car29);
            carService.save(car30);
            carService.save(car31);
            carService.save(car32);
            carService.save(car33);
            carService.save(car34);
            carService.save(car35);

            car10.setTheUser(user3);
            car10.setReturnDate(LocalDate.of(2023, 5, 20));

            car34.setTheUser(user2);
            car34.setReturnDate(LocalDate.of(2023, 12, 28));

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
