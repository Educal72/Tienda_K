
package com.tienda.controller;

import com.tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var texto = "Estamos en semana 6";
        model.addAttribute("mensaje", texto);
        var clientes=clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
    
    
}
