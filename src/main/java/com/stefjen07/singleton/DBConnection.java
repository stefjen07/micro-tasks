package com.stefjen07.singleton;

import java.util.Map;

public class DBConnection {
    static Map<Long, DBConnection> instances;

    public static DBConnection getInstance(long threadId) {
        if(!instances.containsKey(threadId)) {
            instances.put(threadId, new DBConnection());
        }

        return instances.get(threadId);
    }

    public static DBConnection getInstance() {
        var threadId = Thread.currentThread().getId();
        return getInstance(threadId);
    }



    Map<String, String> fields;

    void writeField(String key, String value) {
        fields.put(key, value);
    }

    String readField(String key) {
        return fields.get(key);
    }
}
