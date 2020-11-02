package com.snc.discovery;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CredentialResolverTests {

	@Test
	@DisplayName("Check isNullOrEmpty with ''")
	void emptyString() {
		assertTrue(CredentialResolver.isNullOrEmpty(""));
	}
	
	//and so one
}
