package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repo r1;

	public String insertData(Product p) {
		r1.save(p);
		return "Insert success";
	}

	public List<Product> displayData() {
		return r1.findAll();
	}

	public String updateData(Product p) {
		if (r1.existsById(p.getId())) {
			r1.save(p);
			return "Update success";
		} else {
			return "Product not found";
		}
	}

	/*
	public String deleteData(int id) {
		if (r1.existsById(id)) {
			r1.deleteById(id);
			return "Delete success";
		} else {
			return "Product not found";
		}
	}
	*/
}
