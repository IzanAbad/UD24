package UD24.service;

import java.util.List;

import UD24.dao.EmpleadoDAO;
import UD24.dto.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImp implements EmpleadoService{

	
	@Autowired
	EmpleadoDAO EmpleadoDAO;
	
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return EmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return EmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		// TODO Auto-generated method stub
		return EmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		// TODO Auto-generated method stub
		return EmpleadoDAO.findByNombre(nombre);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return EmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		// TODO Auto-generated method stub
		EmpleadoDAO.deleteById(id);
	}
	
	

}
