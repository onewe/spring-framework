package com.sjr.test.resolver;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class SjrProtocolResolver implements ProtocolResolver {

	@Override
	public Resource resolve(String location, ResourceLoader resourceLoader) {
		if(resourceLoader == null){
			return null;
		}
		if(location == null || !location.startsWith("sjr")){
			return null;
		}
		final int index = location.indexOf("sjr:");
		return resourceLoader.getResource(location.substring(index + 4));
	}
}
