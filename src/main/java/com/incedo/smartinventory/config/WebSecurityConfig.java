/*
 * package com.incedo.smartinventory.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.web.servlet.config.annotation.CorsRegistry;
 * 
 * 
 * import com.incedo.smartinventory.repository.EmployeeRepository;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * 
 * @Autowired private EmployeeRepository employeeRepository;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * 
 * @Override     protected void configure(AuthenticationManagerBuilder auth)
 * throws Exception {        
 * auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()
 * );     }
 * 
 * auth.employeeRepository(employeeRepository).passwordEncoder(passwordEncoder()
 * );
 * 
 * }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable() .authorizeRequests()
 * .antMatchers("/employees/**").authenticated() .and() .httpBasic(); }
 * 
 * 
 * }
 */