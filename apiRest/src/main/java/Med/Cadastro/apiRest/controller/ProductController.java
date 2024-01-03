package Med.Cadastro.apiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/produtos")

public class ProductController {


@GetMapping
    public String product(){
        return "Produto em estoque...";
    }
}
