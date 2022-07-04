package web.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.dao.UserDaoHibernateImpl;
import web.model.User;
import web.util.Util;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {


    UserDao userDao = new UserDaoHibernateImpl();

    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }
    public void save(User user) {
    userDao.save(user);
    }

    public List<User> getThatManyUsers(int amount) {
        return userDao.getAllUsers().subList(0, amount);
    }

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
