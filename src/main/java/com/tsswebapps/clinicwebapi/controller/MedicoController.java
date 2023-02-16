package com.tsswebapps.clinicwebapi.controller;

import com.tsswebapps.clinicwebapi.medico.DadosCadastroMedico;
import com.tsswebapps.clinicwebapi.medico.Medico;
import com.tsswebapps.clinicwebapi.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.data.annotation.Transient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    private final MedicoRepository repository;

    public MedicoController(MedicoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        //repository.save(new Medico(dados));
        System.out.println(new Medico(dados));
    }
}
