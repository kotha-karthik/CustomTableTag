package com.iss.IModel;

public class Attribute implements IAttribute
{
	private String name;
	private Object Value;
	public Attribute(String name,Object Value)
	{
		this.name=name;
		this.Value=Value;
	}
	public void setValue(Object Value)
	{
		this.Value=Value;
	}
	public Object getValue()
	{
		return this.Value;
	}
	public String toString()
	{
		return  this.name;
	}

}



