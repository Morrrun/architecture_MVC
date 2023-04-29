package com.alexsandrov.architecture_mvc.util;


import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;


import java.io.InputStream;
import java.util.Properties;

/**
 * Утилитный класс для получения настроек из конфигурационного файла .properties
 * Метод private static String get(String key) возвращает значение конфигурационной настройки
 * по ключу указанному в файле application.properties
 */
@UtilityClass
public class PropertiesUtil {

    /**
     * Переменная PROPERTIES хранит загруженные конфигурации
     */

    private static final Properties PROPERTIES = new Properties();


    /**
     * Статический блок для вызова загрузки конфигураций
     */
    static {
        loadProperties();
    }

    /**
     * Статический метод для загрузки конфигураций
     */
    @SneakyThrows
    private static void loadProperties() {
        @Cleanup InputStream resourceAsStream = PropertiesUtil.class
                .getClassLoader()
                .getResourceAsStream("application.properties");

        PROPERTIES.load(resourceAsStream);
    }

    /**
     * Статический метод для получения конфигурации по ключу
     */
    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
