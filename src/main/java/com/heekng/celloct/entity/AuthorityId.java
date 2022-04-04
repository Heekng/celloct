package com.heekng.celloct.entity;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class AuthorityId implements Serializable {
    private Long member;
    private Role role;
}
