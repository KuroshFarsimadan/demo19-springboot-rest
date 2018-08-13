package ir.kuroshfarsimadan.springboot.Demo19;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Kurosh Farsimadan RestController example using Spring Boot
 *
 */
@RestController
public class UserController {
	
	@GetMapping("/")
	public String Index() {
		String indexMessage = "Welcome to spring boot index";
		return indexMessage;
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1, "kuroshfarsimadan"));
		userList.add(new User(2, "johnsmith"));
		userList.add(new User(3, "johndoe"));
		return userList;
	}

}
