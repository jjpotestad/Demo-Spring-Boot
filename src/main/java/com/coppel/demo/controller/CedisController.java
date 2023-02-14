package com.coppel.demo.controller;

import com.coppel.demo.entity.Cedis;
import com.coppel.demo.service.CedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CedisController {
    @Autowired
    private CedisService service;

    @GetMapping(value = {"/cedis"})
    public String index(Model model){
        model.addAttribute("list",service.listarCedis());
        return "cedis-index";
    }

    @GetMapping("/cedis/create")
	public String create(Model modelo) {
		Cedis entity = new Cedis();
		modelo.addAttribute("cedis", entity);
		return "cedis-create";
	}

    @PostMapping("/cedis")
	public String store(@ModelAttribute("cedis") Cedis entity) {
		service.guardarCedis(entity);
		return "redirect:/cedis";
	}

    @GetMapping("/cedis/edit/{num_cedis}")
	public String show(@PathVariable Long num_cedis, Model modelo) {
		modelo.addAttribute("cedis", service.obtenerCedisPorId(num_cedis));
		return "cedis-edit";
	}

    @PostMapping("/cedis/{num_cedis}")
	public String update(@PathVariable Long num_cedis, @ModelAttribute("cedis") Cedis entityUpdate, Model modelo) {
        Cedis entityExist = service.obtenerCedisPorId(num_cedis);
		entityExist.setNom_cedis(entityUpdate.getNom_cedis());
		entityExist.setNum_cedisropa(entityUpdate.getNum_cedisropa());
		entityExist.setNum_cedimueble(entityUpdate.getNum_cedimueble());
		entityExist.setDes_servidorropa(entityUpdate.getDes_servidorropa());
		entityExist.setDes_servidormueble(entityUpdate.getDes_servidormueble());

		service.actualizarCedis(entityExist);
		return "redirect:/cedis";
	}

    @GetMapping("/cedis/{num_cedis}")
	public String delete(@PathVariable Long num_cedis) {
		service.eliminarCedis(num_cedis);
		return "redirect:/cedis";
	}
}
