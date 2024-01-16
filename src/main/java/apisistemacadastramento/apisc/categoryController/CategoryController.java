package apisistemacadastramento.apisc.categoryController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    @GetMapping()
    public ResponseEntity<Object> getCategories(){
        return ResponseEntity.status(200).build();
    }

    @PutMapping("create")
    public ResponseEntity<Object> createCategory(){
        return ResponseEntity.status(201).build();
    }
}
