package com.spring.security;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Authenticate a user from the database.
 */

public class AppUserDetailsServiceDAO implements UserDetailsService {
	
	public UserDetails loadUserByUsername(final String login) 
               throws UsernameNotFoundException {
		 System.out.println("i am called");
		 
			
// actually this value is checked against database against login  
User user =new User();
user.setUsername("a");
user.setPassword("b");
if(!user.getUsername().equals(login)){
	
	    throw new UsernameNotFoundException("User " + login + " was not found in the database");
	
	
}


HashSet<Authority> u=new HashSet<Authority>();
Authority a=new Authority();
a.setName("ROLE_USER");
u.add(a);
user.setAuthority(u);


if (user == null) {
    throw new UsernameNotFoundException("User " + login + " was not found in the database");
} 
Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
for (Authority authority : user.getAuthority()) {
    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getName());
    grantedAuthorities.add(grantedAuthority);
}
String f=user.getUsername();

return new org.springframework.security.core.userdetails.User(login, f,
        grantedAuthorities);
}
	
	
	


}
