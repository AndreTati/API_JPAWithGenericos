package com.tup.buensabor.controllers;

import com.tup.buensabor.entities.Pedido;
import com.tup.buensabor.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/pedido")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
}
