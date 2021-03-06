package com.codingdojo.admindash.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codingdojo.admindash.models.Role;
import com.codingdojo.admindash.models.User;
import com.codingdojo.admindash.repositories.UserRepo;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService{
	private UserRepo uRepo;
    public UserDetailsServiceImplementation(UserRepo uRepo){
        this.uRepo = uRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = uRepo.findByEmail(username);
        if(user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        } 
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthorities(user));
    }
    private List<GrantedAuthority> getAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(Role role : user.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getType());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
