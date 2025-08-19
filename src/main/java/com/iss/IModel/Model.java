package com.iss.IModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Model implements IModel
{
	private Map<String, IAttribute> map;
	
    public Model() {
        map = new HashMap<String,IAttribute>();
	}
    public void setAttribute(String name, Object value) {
		Attribute temp= new Attribute(name,value);
        map.put(name, temp);
    }
    public IAttribute getAttribute(String name) {
		return map.get(name);
    }
	
	public List<IAttribute> getAttributes()
	{
			return new ArrayList<IAttribute>(map.values());
	}

}
