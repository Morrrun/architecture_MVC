package com.alexsandrov.architecture_mvc.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Утилитный класс для получения настроек из конфигурационного файла .properties
 * Метод private static String get(String key) возвращает значение конфигурационной настройки
 * по ключу указанному в файле application.properties
 */
public final class PropertiesUtil {

    /**
     * Переменная PROPERTIES хранит загруженные конфигурации
     */
    private static final Properties PROPERTIES = new Properties();

    private PropertiesUtil() {
    }

    /**
     * Статический блок для вызова загрузки конфигураций
     */
    static {
        loadProperties();
    }

    /**
     * Статический метод для загрузки конфигураций
     */
    private static void loadProperties() {
        try (InputStream resourceAsStream = PropertiesUtil.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            PROPERTIES.load(resourceAsStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Статический метод для получения конфигурации по ключу
     */
    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
