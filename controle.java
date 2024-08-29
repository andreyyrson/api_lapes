package apilapes.com.br.apilapes.controle;

import org.springframework.web.bind.annotation.RestController;

import apilapes.com.br.apilapes.modelo.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class controle {
   
    @GetMapping("")
    public String mensagem(){
        return "ola , mundo";
    }
    @GetMapping("/boas_vindas")
    public String Boasvindas(){
            return "seja bem vindo!!";
    }
    @GetMapping("/boas_vindas/{andrey}")
    public String Boasvindas(@PathVariable String nome){
            return "seja bem vindo!!" + nome;
    }
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa n ){
                return n;
    }
}
