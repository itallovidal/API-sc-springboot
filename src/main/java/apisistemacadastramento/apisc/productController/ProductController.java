package apisistemacadastramento.apisc.productController;

import apisistemacadastramento.apisc.Entities.Product;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("products")
public class ProductController {

    @PutMapping("/create")
    public ResponseEntity<Product> create(@RequestBody @Valid Product  product){
        return ResponseEntity.status(201).body(product);
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<String> getProductDetails(@PathVariable("id") String id){
        return ResponseEntity.status(201).body(id);
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchProduct(@RequestParam(value = "q") String  query){
        return ResponseEntity.status(201).body(query);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable("id") String id){
        return ResponseEntity.status(201).body(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id")  String id){
        return ResponseEntity.status(201).body(id);
    }
}
