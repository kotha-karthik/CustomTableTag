package com.iss.models;

import com.iss.IModel.Attribute;
import com.iss.IModel.Model;

public  class Student extends Model
{
	 public Student() {
	        setAttribute("sname", null);
	        setAttribute("sid", 0);
	        setAttribute("fee", 0.0);
	    }

	@Override
	public Attribute getAttribute() {
		// TODO Auto-generated method stub
		return null;
	}
}
