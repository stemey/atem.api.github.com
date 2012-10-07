package org.atemsource.atem.api.infrastructure.exception;

import org.atemsource.atem.api.infrastructure.exception.TechnicalException;
import org.atemsource.atem.api.type.Type;

public class ConversionException extends TechnicalException {

	private String valueAsText;
	private String expectedType;

	public ConversionException(String valueAsText, Type<?> expectedType) {
		super("cannot convert " + valueAsText + " to " + expectedType.getCode());
		this.valueAsText = valueAsText;
		this.expectedType = expectedType.getCode();
	}
	public ConversionException(String valueAsText, Class<?> associationType) {
		super("cannot convert " + valueAsText + " to " + associationType.getName());
		this.valueAsText = valueAsText;
		this.expectedType = associationType.getName();
	}

	public String getValueAsText() {
		return valueAsText;
	}

	public String getExpectedType() {
		return expectedType;
	}

}
