package com.AppRH.AppRH.controller;

import com.AppRH.AppRH.model.Candidato;
import com.AppRH.AppRH.model.Vaga;
import com.AppRH.AppRH.repository.CandidatoRepository;
import com.AppRH.AppRH.repository.VagaRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class VagaController {
    private VagaRepository vr;
    private CandidatoRepository cr;

    //CADASTRAR VAGA
    @GetMapping("/cadastrarVaga")
    public String form(){

        return "vaga/formVaga"; //retorna uma view de cadastro de vagas
    }

    @PostMapping("/cadastrarVaga")
    public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/cadastrarVaga";
        }

        vr.save(vaga);
        attributes.addFlashAttribute("mensagem", "Cadastrado com sucesso");
        return "redirect:/cadastrarVaga";
    }
}
