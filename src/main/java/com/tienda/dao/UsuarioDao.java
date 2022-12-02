
package com.tienda.dao;

import com.tienda.domain.Cliente;
import com.tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUsername (String username);
    
}
