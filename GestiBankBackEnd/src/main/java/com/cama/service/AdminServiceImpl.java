package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.AdminDao;
import com.cama.model.Admin;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDAO;
	
	@Override
	public List<Admin> findAllAdmins() {
		return adminDAO.findAllAdmins();
	}

	@Override
	public Admin findAdminById(int id) {
		return adminDAO.findAdminById(id);
	}

	@Override
	public void createAdmin(Admin admin) {
		adminDAO.createAdmin(admin);
	}

	@Override
	public void deleteAdmin(Admin admin) {
		adminDAO.deleteAdmin(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		adminDAO.updateAdmin(admin);
	}
}