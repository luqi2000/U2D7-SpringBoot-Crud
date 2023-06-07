package luqmanmohammad.U2D7SpringBootCrud.entities;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	private String username;
	private String email;
	private Boolean active = true;
	private String password;

}
