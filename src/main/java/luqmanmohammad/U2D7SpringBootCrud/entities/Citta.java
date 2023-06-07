package luqmanmohammad.U2D7SpringBootCrud.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Citta {

	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
}