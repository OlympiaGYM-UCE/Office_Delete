package com.gym.olympia.controller;


import com.gym.olympia.entity.Office;
import com.gym.olympia.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/office")
public class OfficeController {

    @Autowired
    OfficeService officeService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        officeService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
