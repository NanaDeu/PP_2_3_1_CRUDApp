package web.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
//import web.util.Util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
/*
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }*/

    public UserDaoHibernateImpl() {

    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    public void updateUser(long id, User user) {
        entityManager.merge(user);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUserById(long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void createUsersTable() {
        entityManager.createNativeQuery("CREATE TABLE IF NOT EXISTS user (id INT PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                " name VARCHAR(40), lastName VARCHAR(40), age INT);");
    }

   /* public User getUserById(long id) {
        Session session = Util.getSessionFactory().openSession();
        return session.get(User.class, id);

    }

    @Override
    public void updateUser(long id, User user) {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "UPDATE user SET name=" + "'" + user.getName() + "'" + ", lastName=" +
                    "'" + user.getLastName() + "'" + ", age=" + user.getAge() +
                    " WHERE id=" + id + ";";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public void save(User user) {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "INSERT INTO user(name, lastName, age) VALUES('" + user.getName() + "'" +
                    ",'" + user.getLastName() + "'" + "," + user.getAge() + ");";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public void createUsersTable() {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "CREATE TABLE IF NOT EXISTS user (id INT PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                    " name VARCHAR(40), lastName VARCHAR(40), age INT);";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public void dropUsersTable() {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "DROP TABLE IF EXISTS user";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            User newUser = new User(name, lastName, age);
            String sql = "INSERT INTO user(name, lastName, age) VALUES('" + newUser.getName() + "'" +
                    ",'" + newUser.getLastName() + "'" + "," + newUser.getAge() + ");";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public void removeUserById(long id) {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "DELETE FROM user WHERE id = " + id + ";";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = Util.getSessionFactory().openSession()) {
            List<User> users = (List<User>) session.createQuery("From User").list();

            System.out.println(users.toString());
            return users;
        }
    }

    @Override
    public void cleanUsersTable() {
        try (Session session = Util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "DELETE FROM user;";

            Query query = session.createNativeQuery(sql);
            query.executeUpdate();

            transaction.commit();
        }
    }*/
}
