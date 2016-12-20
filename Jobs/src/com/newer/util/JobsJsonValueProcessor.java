package com.newer.util;

import com.newer.pojo.Companyjob;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JobsJsonValueProcessor implements JsonValueProcessor {

	@Override
	public Object processArrayValue(Object value, JsonConfig config) {
	
		return process(value);
	}

	private Object process(Object value) {
		if (value instanceof Companyjob) {
		      return ((Companyjob)value).getCname();
		    }
		return null;
	}

	@Override
	public Object processObjectValue(String key, Object value, JsonConfig config) {
		// TODO Auto-generated method stub
		return process(value);
	}

}
