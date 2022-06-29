package com.example.major.global;


import java.util.ArrayList;
import java.util.List;

import com.example.major.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
