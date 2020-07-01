package com.example.egagenda.controler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/egagenda")
public class egagendacontroler {

    @GetMapping(value = "/list")
    public List<String> list(){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("teste1");
        lista.add("teste2");
        lista.add("teste3");
        lista.add("teste4");
        lista.add("teste5");
        return lista;
    }
}
