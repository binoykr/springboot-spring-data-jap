package com.binoykr.examples.datajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.binoykr.examples.datajpa.enity.AddressEntity;
import com.binoykr.examples.datajpa.enity.UserEntity;
import com.binoykr.examples.datajpa.model.AddressModel;
import com.binoykr.examples.datajpa.model.UserModel;
import com.binoykr.examples.datajpa.repository.UserRepository;

@Service
@Configuration
public class UserService {

	@Autowired
	private UserRepository repository;

	public void create(UserModel model) {
		UserEntity entity = new UserEntity();
		entity.setName(model.getName());

		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setStreet(model.getAddress().getStreet());
		addressEntity.setArea(model.getAddress().getArea());
		entity.setAddress(addressEntity);

		repository.save(entity);

	}

	public void update(int userId, UserModel model) {
		UserEntity entity = repository.findById(userId).get();

		entity.setName(model.getName());
		entity.getAddress().setStreet(model.getAddress().getStreet());
		entity.getAddress().setArea(model.getAddress().getArea());

		repository.save(entity);
	}

	public UserModel get(int userId) {
		UserEntity entity = repository.findById(userId).get();

		UserModel model = new UserModel();
		model.setName(entity.getName());

		AddressModel address = new AddressModel();
		address.setStreet(entity.getAddress().getStreet());
		address.setArea(entity.getAddress().getArea());
		model.setAddress(address);

		return model;
	}
}
