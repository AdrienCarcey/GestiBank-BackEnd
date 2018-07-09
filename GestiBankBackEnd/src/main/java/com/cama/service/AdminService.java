package com.cama.service;

import java.util.List;

import com.cama.model.Admin;

public interface AdminService {
	
	List<Admin> findAllAdmins();
	
	Admin findAdminById(int id);
	
	void createAdmin(Admin admin);

	void deleteAdmin(Admin admin);
	
	void updateAdmin(Admin admin);
}