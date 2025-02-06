package com.hms.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
	SCHEDULED,
    PENDING,
    CANCELLED;
	
	@JsonCreator
    public static Gender fromValue(String value) {
        return Gender.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return name();
    }
}
