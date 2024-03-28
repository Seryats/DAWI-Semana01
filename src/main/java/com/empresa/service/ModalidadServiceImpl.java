package com.empresa.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

@Service
public class ModalidadServiceImpl implements ModalidadService{
	@Autowired
	private ModalidadRepository reposiroty;

	@Override
	public List<Modalidad> listaModalidad() {
		return reposiroty.findAll();
	}

	@Override
	public Modalidad insertaModalidad(Modalidad obj) {
		return reposiroty.save(obj);
	}
	

}
