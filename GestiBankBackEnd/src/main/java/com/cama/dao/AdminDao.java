package com.cama.dao;

import java.util.List;

import com.cama.model.Admin;
import com.cama.model.Conseiller;

public interface AdminDao {
	
	List<Admin> findAllAdmins();
	
	Admin findAdminById(int id);

	Admin findAdminByName(String name);

	void createAdmin(Admin admin);

	void deleteAdmin(Admin admin);
	
	void updateAdmin(Admin admin);
}