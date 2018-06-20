package com.szy.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {

    public static <K, V> Map<K, V> newInstance() {
        return new HashMap<K, V>();
    }
}
