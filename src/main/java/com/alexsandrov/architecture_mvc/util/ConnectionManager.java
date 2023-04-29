package com.alexsandrov.architecture_mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Утилитный класс для подключения к БД и получения Connection.
 * Имеет 3 статические переменные, которые хранят ключи к конфигурациям
 * из файла application.properties
 */
public final class ConnectionManager {
    private static final String URL_KEY = "db.url";
    private static final String USER_KEY = "db.user";
    private static final String PASSWORD_KEY = "db.password";

    private ConnectionManager() {
    }
     public static Connection get() {
         try {
             return DriverManager.getConnection(PropertiesUtil.get(URL_KEY),
                     PropertiesUtil.get(USER_KEY),
                     PropertiesUtil.get(PASSWORD_KEY));
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
