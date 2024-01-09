package apisistemacadastramento.apisc.Entities;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Product {

    @Size(min = 3, message = "O campo 'Nome' precisa de pelo menos 3 caracteres.")
    private String name;

    @Size(min = 4, message = "O campo 'Categoria' precisa de pelo menos 3 caracteres.")
    private String category;

    @Positive
    private Double price;

    @Positive
    private int quantity;

    @Size(min = 4, message = "aa")
    private String imgURL;
}
