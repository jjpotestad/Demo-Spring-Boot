package com.coppel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coppel.demo.entity.Rol;
import com.coppel.demo.service.RolService;



@Controller
public class RolController {
    @Autowired
    private RolService service;

    @GetMapping(value = {"/roles"})
    public String index(Model model){
        model.addAttribute("list",service.listarRoles());
        return "rol-index";
    }

    @GetMapping("/roles/create")
	public String create(Model modelo) {
		Rol entity = new Rol();
		modelo.addAttribute("rol", entity);
		return "rol-create";
	}

    @PostMapping("/roles")
	public String store(@ModelAttribute("rol") Rol entity) {
		service.guardarRol(entity);
		return "redirect:/roles";
	}

    @GetMapping("/roles/edit/{idu_rol}")
	public String show(@PathVariable Long idu_rol, Model modelo) {
		modelo.addAttribute("rol", service.obternerRolPorId(idu_rol));
		return "rol-edit";
	}

    @PostMapping("/roles/{idu_rol}")
	public String update(@PathVariable Long idu_rol, @ModelAttribute("rol") Rol entityUpdate, Model modelo) {
        Rol entityExist = service.obternerRolPorId(idu_rol);
		entityExist.setNum_rol(entityUpdate.getNum_rol());
		entityExist.setNom_rol(entityUpdate.getNom_rol());

		service.actualizarRol(entityExist);
		return "redirect:/roles";
	}

    @GetMapping("/roles/{idu_rol}")
	public String delete(@PathVariable Long idu_rol) {
		service.eliminarRol(idu_rol);
		return "redirect:/roles";
	}
}
