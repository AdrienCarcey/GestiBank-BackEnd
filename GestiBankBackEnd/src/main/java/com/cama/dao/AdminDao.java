package com.cama.dao;

import java.util.List;

import com.cama.model.Admin;

public interface AdminDao {
	
	List<Admin> findAllAdmins();
	
	Admin findAdminById(int id);
	
	void createAdmin(Admin admin);

	void deleteAdmin(Admin admin);
	
	void updateAdmin(Admin admin);
}