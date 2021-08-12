package com.digital.geovane.saladereuniao.saladereuniao.controller;

import com.digital.geovane.saladereuniao.saladereuniao.exception.ResourceNotFoundException;
import com.digital.geovane.saladereuniao.saladereuniao.model.Room;
import com.digital.geovane.saladereuniao.saladereuniao.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@RestController @CrossOrigin(origins = "http//localhost:4200")
@RequestMapping("/api/v1")
public class RoomController {

    @Autowired
}
