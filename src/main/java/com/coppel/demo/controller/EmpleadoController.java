package com.coppel.demo.controller;

import com.coppel.demo.entity.Empleado;
import com.coppel.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoService service;

    @GetMapping(value = {"/empleados","/"})
    public String index(Model model){
        model.addAttribute("list",service.listarEmpleados());
        return "empleados-index";
    }

    @GetMapping("/empleados/create")
	public String create(Model modelo) {
		Empleado entity = new Empleado();
		modelo.addAttribute("empleado", entity);
		return "empleados-create";
	}

    @PostMapping("/empleados")
	public String store(@ModelAttribute("empleado") Empleado entity) {
		service.guardarEmpleado(entity);
		return "redirect:/empleados";
	}

    @GetMapping("/empleados/edit/{num_empleado}")
	public String show(@PathVariable Long num_empleado, Model modelo) {
		modelo.addAttribute("empleado", service.obtenerEmpleadoPorId(num_empleado));
		return "empleados-edit";
	}

    @PostMapping("/empleados/{num_empleado}")
	public String update(@PathVariable Long num_empleado, @ModelAttribute("empleado") Empleado entityUpdate, Model modelo) {
        Empleado entityExist = service.obtenerEmpleadoPorId(num_empleado);
		entityExist.setNom_empleado(entityUpdate.getNom_empleado());
		entityExist.setFec_ingreso(entityUpdate.getFec_ingreso());
		entityExist.setFec_cumple(entityUpdate.getFec_cumple());
		entityExist.setOpc_interno(entityUpdate.getOpc_interno());

		service.actualizarEmpleado(entityExist);
		return "redirect:/empleados";
	}

	@GetMapping("/empleados/{num_empleado}")
	public String delete(@PathVariable Long num_empleado) {
		service.eliminarEmpleado(num_empleado);
		return "redirect:/empleados";
	}
}
