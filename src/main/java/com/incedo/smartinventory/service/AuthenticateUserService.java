/*
 * package com.incedo.smartinventory.service;
 * 
 * import java.util.Collections;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.incedo.smartinventory.entity.Employee; import
 * com.incedo.smartinventory.repository.EmployeeRepository;
 * 
 * public class AuthenticateUserService implements UserDetailsService {
 * 
 * @Autowired private EmployeeRepository employeeRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * Employee user = employeeRepository.findByUsername(username); if (user ==
 * null) { throw new UsernameNotFoundException("User not found");
 * 
 * } return new org.springframework.security.core.userdetails.User(
 * user.getUsername(), user.getPassword(), Collections.singleton(new
 * SimpleGrantedAuthority("USER")));
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 */