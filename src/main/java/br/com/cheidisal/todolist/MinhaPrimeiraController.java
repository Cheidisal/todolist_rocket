package br.com.cheidisal.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8800/ ------
public class MinhaPrimeiraController {

  /**
   * Métodos de acesso do HTTP
   * GET - Buscar uma informação
   * POST - Adicionar um dado/info
   * PUT - Alterar um dado/info (alterar mais de um dado/info)
   * DELETE - Remover um dado/info
   * PATCH - Alterar somente uma parte do dado/info
   * 
   */
  

  // Método (Funcionalidade) de uma classe
  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "Funcionou";
  }
}
