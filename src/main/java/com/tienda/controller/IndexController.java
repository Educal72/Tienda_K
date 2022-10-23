
package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        var texto = "Estamos en semana 4";
        model.addAttribute("mensaje", texto);
        
        //Cliente cliente1 = new Cliente("Pedro","Gomez Contreras","pcontreras@gmail.com","7878-7878");
        //Cliente cliente2 = new Cliente("Juan","Contreras Gomez","jgomez@gmail.com","8787-8787");
        //var clientes = Arrays.asList(cliente1, cliente2);
        
        var clientes=clienteDao.findAll();
        
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
}
