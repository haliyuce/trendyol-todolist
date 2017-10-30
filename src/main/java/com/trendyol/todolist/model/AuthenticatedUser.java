package com.trendyol.todolist.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class AuthenticatedUser extends org.springframework.security.core.userdetails.User {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private User user;

    public AuthenticatedUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
            User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public AuthenticatedUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public AuthenticatedUser(String username, String password, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked,
            Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public User getUser() {
        return user;
    }
}