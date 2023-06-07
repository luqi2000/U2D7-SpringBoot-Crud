package luqmanmohammad.U2D7SpringBootCrud.service;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luqmanmohammad.U2D7SpringBootCrud.entities.User;
import luqmanmohammad.U2D7SpringBootCrud.repository.UserRepository;
	
@Service
public class UserService {
	
	
	User a = new User("Aldo", "Baglio", "aldo@gmail.com", "Nuvola");
	User b = new User("Giovanni", "Pec", "Giovanni@gmail.com", "Nuvola");
	User c = new User("Moro", "Impastato", "Moro@gmail.com", "Nuvola");
	User d = new User("Luca", "Dan", "luca@gmail.com", "Nuvola");
	User f = new User("Francesco", "Man", "francesco@gmail.com", "Nuvola");

	
	private List<User> users = new ArrayList<User>(List.of(a,b,c,d,f));

	@Autowired
	UserRepository userRepo;
	
	public List<User> getUsers() {
		return this.users;
	}
	
	public User saveNewUser(User user) {
		this.users.add(user);
		return user;
	}
	
	public User findById(UUID id) throws Exception{
		return userRepo.findById(id).orElseThrow(() -> new Exception("Utente non trovato!"));
	}

	public User findByIdAndUpdate(UUID id, User u) throws Exception {
		User found = this.findById(id);

		found.setId(id);
		found.setNome(u.getNome());
		found.setUsername(u.getUsername());
		found.setEmail(u.getEmail());

		return userRepo.save(found);
	}

	public void findByIdAndDelete(UUID id) throws Exception {
		User found = this.findById(id);
		userRepo.delete(found);
	}

}
