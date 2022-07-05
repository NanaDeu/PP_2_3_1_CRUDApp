package web.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoHibernateImpl;
import web.model.User;
//import web.util.Util;

import java.util.List;

@Component
@Service
public class UserServiceImpl implements UserService {


    UserDao userDao = new UserDaoHibernateImpl();

    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }

    public void save(User user) {
        userDao.save(user);
    }


    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    public void createUsersTable() {
        userDao.createUsersTable();
    }


/*    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }

    public List<User> getThatManyUsers(int amount) {
        return userDao.getAllUsers().subList(0, amount);
    }*/
}
