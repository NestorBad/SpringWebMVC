package com.example.data;

import com.example.model.Person;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@Service
public class PersonDao {

    public static ArrayList<Person> listAllPerson() {
        ArrayList<Person> listPerson = new ArrayList<Person>();

        String sql = "select * from personinfo.info";

        Connection connection = DbConnector.getDbConnection();
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_person");
                String first = resultSet.getString("first");
                String second = resultSet.getString("second");
                String third = resultSet.getString("third");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");


                Person person = new Person(id, first, second, third, email, phone);
                listPerson.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listPerson;
    }
}
