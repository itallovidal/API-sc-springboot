package apisistemacadastramento.apisc.productController;

import apisistemacadastramento.apisc.Entities.Product;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("products")
public class ProductController {

    @PostMapping("/create")
    public ResponseEntity<Product> hello(@RequestBody @Valid Product  product){
        return ResponseEntity.status(201).body(product);
    }

}
