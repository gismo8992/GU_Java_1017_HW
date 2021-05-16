package javaLevel2.lesson7.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserRepository {
    public Optional<User> findByLoginAndPassword(String login, String password) {
        Connection connection = DBConnection.getInstance(); // открываем соединение с базой данных (не создаем в качестве поля!)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ?"); /*
             с помощью созданного соединения передаем в качестве аргумента скрипт для запроса
             */

            preparedStatement.setString(1, login); // определяем значения параметров в скрипте для запроса
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery(); // выполняем запрос и получаем записи из базы данных
            if(rs.next()) {
                return Optional.of(
                        new User(
                                rs.getString("login"),
                                rs.getString("password"),
                                rs.getString("nickname")
                        )
                );
            }
        } catch (SQLException sqlExeption) {
            throw new RuntimeException("SWW", sqlExeption);
        }
        return Optional.empty();
    }
}
