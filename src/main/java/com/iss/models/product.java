package com.iss.models;

import com.iss.IModel.Attribute;
import com.iss.IModel.Model;

public class product extends Model {
	public product()
	{
		 setAttribute("pname", null);
	     setAttribute("pid", 0);
	     setAttribute("price", 0.0);
	     setAttribute("barcode", 0);
	}

	@Override
	public Attribute getAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

}
