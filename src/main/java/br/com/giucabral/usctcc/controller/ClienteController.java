package br.com.giucabral.usctcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.giucabral.usctcc.dao.ClienteDao;
import br.com.giucabral.usctcc.model.Cliente;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;

    @ModelAttribute
    public Cliente newRequest(@RequestParam(required = false) Integer id) {
        return (id != null ? clienteDao.findById(id) : new Cliente());
    }

    @RequestMapping(method = RequestMethod.GET)
    public void form() {
    }

    @RequestMapping(method = RequestMethod.POST)
    public void form(Cliente cliente, Model model) {
        clienteDao.save(cliente);

        if (cliente.getId() == null) {
            System.out.println(cliente.getId());
        }

    }

}
