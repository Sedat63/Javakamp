package eVaryansSystems.core.abstracts;

import eVaryansSystems.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(User user);
}
