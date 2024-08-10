package org.kenny.design.pattern.creational.prototype.document_management_system;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, DocumentPrototype> prototypes = new HashMap<>();

    public DocumentManager() {
        prototypes.put("report", new ReportDocument("Standard"));
        prototypes.put("presentation", new PresentationDocument("Simple"));
    }

    public DocumentPrototype createDocument(String type) {
        return prototypes.get(type).clone();
    }
}

