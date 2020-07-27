package com.example.pabellon;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PabellonService {
	
	@Autowired
	private PabellonRepository pabellonRepository;
	
	public Pabellon saveOrUpdate(Pabellon pabellon) {
		return pabellonRepository.save(pabellon);
	}
	public Iterable<Pabellon> listAll(){
		return pabellonRepository.findAll();
	}
	
	public ResponseEntity<Pabellon> findbyid(long id){
		 Optional<Pabellon> Pabellondata =	pabellonRepository.findById(id);
		 if (Pabellondata.isPresent()) {
		      return new ResponseEntity<Pabellon>(Pabellondata.get(), HttpStatus.OK);
		    } else {
		      return new ResponseEntity<Pabellon>(HttpStatus.NOT_FOUND);
		    }
		  }
}