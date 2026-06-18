package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.User;
import mate.academy.service.AuthenticationService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        AuthenticationService authenticationService =
                (AuthenticationService) injector.getInstance(AuthenticationService.class);

        try {
            authenticationService.login("alice@gmail.com", "alice1234");
        } catch (Exception e) {
            System.out.println("Error while login new user. " + e.getMessage());
        }

        try {
            authenticationService.register("alice@gmail.com", "alice1234");
        } catch (Exception e) {
            System.out.println("Error while registering new user. " + e.getMessage());
        }

        try {
            User alice = authenticationService.login("alice@gmail.com", "alice1234");
            System.out.println(alice);
        } catch (Exception e) {
            System.out.println("Error while registering new user. " + e.getMessage());
        }
    }
}
