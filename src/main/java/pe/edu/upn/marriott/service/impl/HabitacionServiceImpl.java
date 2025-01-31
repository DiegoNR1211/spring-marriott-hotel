package pe.edu.upn.marriott.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upn.marriott.models.entity.Habitacion;
import pe.edu.upn.marriott.models.repository.HabitacionRepository;
import pe.edu.upn.marriott.services.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService{
	
	@Autowired
	private HabitacionRepository habitacionRepository;
	@Override
	public List<Habitacion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.findAll();
	}

	@Override
	public Optional<Habitacion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.findById(id);
	}

	@Override
	public Habitacion save(Habitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.save(entity);
	}

	@Override
	public Habitacion update(Habitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.save(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		habitacionRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		habitacionRepository.deleteAll();
		
	}

}
