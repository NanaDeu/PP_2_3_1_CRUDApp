/*package web;

import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Name1", "LastName1", (byte) 20);
        userService.saveUser("Name2", "LastName2", (byte) 25);
        userService.saveUser("Name3", "LastName3", (byte) 31);
        userService.saveUser("Name4", "LastName4", (byte) 38);

        List<User> users = userService.getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        userService.removeUserById(2);
        userService.getAllUsers();
*//*        userService.cleanUsersTable();
        userService.dropUsersTable();*//*

    }
}*/
