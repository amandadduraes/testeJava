// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// @SuppressWarnings("deprecation")
// @Configuration
// @EnableWebSecurity
// @EnableGlobalMethodSecurity(prePostEnabled = true)
// public class SecurityConfig {

//     @Bean
//     public UserDetailsService userDetailsService() {
//         UserDetails user = User.builder()
//             .username("user")
//             .password(passwordEncoder().encode("password"))
//             .roles("USER")
//             .build();
//         return new InMemoryUserDetailsManager(user);
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public AuthenticationManager authenticationManagerBean() throws Exception {
//         return super.authenticationManagerBean();
//     }
// }
