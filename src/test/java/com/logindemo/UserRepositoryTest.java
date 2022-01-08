package com.logindemo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UserRepositoryTest {
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("vinayak@test.com");
		user.setFirstName("Vinayak");
		user.setLastName("Magdum");
		user.setPassword("Password1#");
		User savedUser = repository.save(user);
	  	User existUser = testEntityManager.find(User.class, savedUser.getId());
	  	
	  	assertThat(existUser.getEmail().equals(savedUser.getEmail()));
	}
	
	@Test
	public void testFindUserBysEmail() {
		String emailString = "user@test.com";
		User user = repository.findByEmail(emailString);
		assertThat(user).isNotNull();
	}


}
