package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    User getUserById(long id);

    void updateUser(long id, User user);

    void save(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void createUsersTable();

/*    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void cleanUsersTable();*/
}
