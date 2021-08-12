package UD24.service;

import java.util.List;

import UD24.dto.Empleado;


public interface EmpleadoService {
	
	//Metodos del CRUD
		public List<Empleado> listarEmpleados(); //Listar All 
		
		public Empleado guardarEmpleado(Empleado empleado);	//Guarda un cliente CREATE
		
		public Empleado empleadoXID(Long id); //Leer datos de un cliente READ
		
		public List<Empleado> listarEmpleadoNombre(String nombre);//Listar Clientes por campo nombre
		
		public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del cliente UPDATE
		
		public void eliminarEmpleado(Long id);// Elimina el cliente DELETE
}
