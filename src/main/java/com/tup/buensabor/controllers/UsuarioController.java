package com.tup.buensabor.controllers;

import com.tup.buensabor.entities.Usuario;
import com.tup.buensabor.services.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {
}
