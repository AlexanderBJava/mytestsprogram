package ru.alexanderB.Secure.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
//@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                     .mvcMatchers("/","/main","/registration","/login?logout").permitAll()  //can go on root w/o autorization
               // .anyRequest().authenticated()
                       // .antMatchers("/").permitAll()

                    .anyRequest().authenticated()
                .and()
            //    .csrf().disable();
                    .formLogin()
                    .loginPage("/login")
                    .permitAll()
                .and()
                    .logout()
                    .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .usersByUsernameQuery("select username, password, active from usr where username=?")
                .authoritiesByUsernameQuery("select u.username, ur.roles from usr u inner join user_role ur on u.id= ur.user_id where u.username=?");
    }

    //    @Bean
//    public PrincipalExtractor principalExtractor(UserDetailsReposit userDetailsReposit) {
//        return map -> {
//            String id = (String) map.get("sub");
//            UserG userG = userDetailsReposit.findById(id).orElseGet(() -> {  //find userG by id or:
//                UserG newUserG = new UserG();
//
//                newUserG.setId(id);
//                newUserG.setName((String) map.get("name"));
//                newUserG.setEmail((String) map.get("email"));
//                newUserG.setGender((String) map.get("gender"));     //create newUserG from googles data
//                newUserG.setLocale((String) map.get("locale"));
//                newUserG.setUserpic((String) map.get("picture"));
//
//                return newUserG;                                   //return him,
//            });
//            userG.setLastVisit(LocalDateTime.now());                //set time when he visit site...
//             return userDetailsReposit.save(userG);                        //and save him
//            //return new UserG();
//        };
//    }
}

