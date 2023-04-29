package com.alexsandrov.architecture_mvc.util;


import java.util.Properties;

/**
 * Утилитный класс для получения настроек из конфигурационного файла .properties
 * Метод private static String get(String key) возвращает значение конфигурационной настройки
 * по ключу указанному в файле application.properties
 */
public final class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();
    private PropertiesUtil() {
    }

    private static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
