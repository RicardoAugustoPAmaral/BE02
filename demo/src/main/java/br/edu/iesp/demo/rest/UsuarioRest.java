package br.edu.iesp.demo.rest;

import br.edu.iesp.demo.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {

    private List<Usuario> lista = new ArrayList<>();

  @GetMapping("/listar")
    public List<Usuario> listarUsuarios(){

        return lista;
    }
    @GetMapping("/carga")
    public String carga(){

      /*Usuario u =new Usuario();
      u.setId(1);
      u.setNome("ricardo");
      lista.add(u);*/

      lista.add(new Usuario(1,"ricardo"));
      lista.add(new Usuario(2,"augusto"));
      lista.add(new Usuario(3,"amaral"));
    return "Carga Realizada";
}

}
