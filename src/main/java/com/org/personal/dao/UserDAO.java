package com.org.personal.dao;

import com.org.personal.model.Users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.org.personal.connection.ConnectionFactory.getConnection;

public class UserDAO {

    private static final String SELECT_QUERY = "select * from users where username = ?";

    public Users user(String username){
        Users user;
        try {
            PreparedStatement statement = getConnection().prepareStatement(SELECT_QUERY);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                int id = rs.getInt("id");
                String password = rs.getString("password");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                user = new Users(id, username, password, first_name, last_name);
                return user;
            }
            else{
                return null;
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
