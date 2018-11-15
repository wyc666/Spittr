package nju.edu.wyc.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import nju.edu.wyc.data.SpitterRepository;
import nju.edu.wyc.vo.Spitter;

public class UserService implements UserDetailsService {
	private final SpitterRepository repository;

	public UserService(SpitterRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) {
		Spitter spitter = repository.getSpitterByName(userName);
		if (spitter != null) {
			List<GrantedAuthority> authorityList = new ArrayList<>();
			authorityList.add(new SimpleGrantedAuthority("ROLE_SPITTER"));

			return new User(userName, spitter.getPassword(), authorityList);
		}
		throw new UsernameNotFoundException("User: " + userName + " not found.");
	}

}
