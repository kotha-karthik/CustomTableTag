package com.iss.IModel;

import java.util.List;

public interface IModel {
	
	    void setAttribute(String name, Object value);
	    Attribute getAttribute();
	    List<IAttribute> getAttributes();

}
