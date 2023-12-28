package org.enactor.commonlibrary.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Bus.class, name = "bus"),
        // Add other concrete implementations as needed
})
public interface Vehicle {
    // Your interface methods
}
