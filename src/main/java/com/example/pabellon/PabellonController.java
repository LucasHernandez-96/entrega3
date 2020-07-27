package com.example.pabellon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pabellon")
public class PabellonController {
    @Autowired
    private PabellonService pabellonService;

    @GetMapping("")
    public Iterable<Pabellon> getAll() {
        return pabellonService.listAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pabellon> getPabellonById(@PathVariable(value = "id") Long Pabellonid){
    	
        return pabellonService.findbyid(Pabellonid);
    }
    
    @PostMapping("")
    public ResponseEntity<Pabellon> addPabellon(@RequestBody Pabellon pabellon) {
        Pabellon p= pabellonService.saveOrUpdate(pabellon);
        return new ResponseEntity<Pabellon>(p,HttpStatus.CREATED);
    }

    
}