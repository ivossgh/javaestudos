package org.example.agenda.controller;

import org.example.agenda.model.Contato;
import org.example.agenda.model.ContatoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AgendaController {

    @GetMapping("/minha-agenda")
    public String exibirAgenda() {
        return "agenda";
    }

    // Removido o ';' que estava aqui no final
    @GetMapping("/salvar-contato")
    @ResponseBody
    public String salvarContato() {
        try {
            Contato c1 = new Contato("1", "Mateus", "89981173647", "junco");

            // Precisamos chamar o DAO para salvar nossos dados
            ContatoDAO dao = new ContatoDAO();
            dao.salvar(c1);

            // Ajustado para mostrar o nome do contato salvo
            return "O contato " + c1.getNome() + " foi salvo com sucesso!";

        } catch (Exception e) {
            return "Erro ao salvar o contato: " + e.getMessage();
        }
    }
}