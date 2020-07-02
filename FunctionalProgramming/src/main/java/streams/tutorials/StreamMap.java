package streams.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class StreamMap {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Saad", "passwrd", "saad@gmail.com"));
		users.add(new User(2, "Sam", "pasword123", "sam@gmail.com"));
		users.add(new User(3, "James", "bluejays123", "james@gmail.com"));
		users.add(new User(4, "Sarah", "dank", "sarah@hotmail.com"));
		users.add(new User(5, "Claire", "memes", "claire@gmail.com"));
		
		// Mapping User -> UserDTO
		List<UserDTO> collect = users.stream()
				.map(user ->  new UserDTO(user.getId(), user.getUsername(), user.getEmail())).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}


@ToString
@Getter
@Setter
@AllArgsConstructor
class UserDTO {
	private int id;
	private String username;
	private String email;
}

@ToString
@Getter
@Setter
@AllArgsConstructor
class User {
	private int id;
	private String username;
	private String password;
	private String email;
}