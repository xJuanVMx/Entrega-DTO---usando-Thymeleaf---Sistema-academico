package com.JuanD.sis_academico.controller;

import com.JuanD.sis_academico.model.Aprendiz;
import com.JuanD.sis_academico.service.AprendizService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/aprendices")
public class AprendizController {

    @Autowired
    private AprendizService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("aprendices", service.listarTodos());
        return "aprendices/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("aprendiz", new Aprendiz());
        return "aprendices/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute Aprendiz aprendiz,
                          BindingResult result,
                          RedirectAttributes flash) {
        if (result.hasErrors()) {
            return "aprendices/formulario";
        }
        service.guardar(aprendiz);
        flash.addFlashAttribute("mensaje", "Aprendiz guardado correctamente");
        return "redirect:/aprendices";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("aprendiz", service.buscarPorId(id).orElseThrow());
        return "aprendices/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, RedirectAttributes flash) {
        service.eliminar(id);
        flash.addFlashAttribute("mensaje", "Aprendiz eliminado");
        return "redirect:/aprendices";
    }
}
