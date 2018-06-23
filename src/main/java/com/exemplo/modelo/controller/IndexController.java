/*
*
*
 */
package com.exemplo.modelo.controller;

import com.exemplo.modelo.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author
 */
@RestController
@RequestMapping(path="/user")
public class IndexController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable String nome) {

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setEmail(nome+"@email.com");

        return usuario;
    }

}
