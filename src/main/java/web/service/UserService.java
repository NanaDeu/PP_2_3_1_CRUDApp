package web.service;


import web.model.User;

import java.util.List;

public interface UserService {

    User getUserById(long id);

    void updateUser(long id, User user);

    List<User> getThatManyUsers(int amount);

    void createUsersTable();

    void dropUsersTable();

    void save(User user);

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
