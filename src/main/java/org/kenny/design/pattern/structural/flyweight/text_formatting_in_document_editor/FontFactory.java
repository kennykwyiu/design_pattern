package org.kenny.design.pattern.structural.flyweight.text_formatting_in_document_editor;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> fontPool = new HashMap<>();

    public Font getFont(String name, int size, String style) {
        String key = name + size + style;
        if (!fontPool.containsKey(key)) {
            fontPool.put(key, new ConcreteFont(name, size, style));
        }
        return fontPool.get(key);
    }
}
