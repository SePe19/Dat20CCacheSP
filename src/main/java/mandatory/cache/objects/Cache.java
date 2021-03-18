package mandatory.cache.objects;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, String> keyMap;

    public Cache() {
        this.keyMap = new HashMap<>();
    }

    public String get(String key) {
        return this.keyMap.get(key);
    }

    public void set(String key, String value) {
        this.keyMap.put(key, value);
    }

    public boolean has(String key) {
        if (this.keyMap.containsKey(key)) {
            return true;
        }
        return false;
    }

    public void delete(String key) {
        this.keyMap.remove(key);
    }
}
