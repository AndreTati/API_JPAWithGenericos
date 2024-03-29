package com.tup.buensabor.controllers;

import com.tup.buensabor.entities.Factura;
import com.tup.buensabor.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/factura")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {
}
