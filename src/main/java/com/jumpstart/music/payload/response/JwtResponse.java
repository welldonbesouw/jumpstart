package com.jumpstart.music.payload.response;

import java.util.List;

public class JwtResponse {
	  private String token;
	  private String type = "Bearer";
	  private Long id;
	  private String firstName;
	  private String lastName;
	  private String username;
	  private String email;
	  private String address;
	  private List<String> roles;

	  public JwtResponse(String accessToken, Long id, String firstName, String lastName, String username, String email, String address, List<String> roles) {
	    this.token = accessToken;
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.username = username;
	    this.email = email;
	    this.address = address;
	    this.roles = roles;
	  }

	  public String getAccessToken() {
	    return token;
	  }

	  public void setAccessToken(String accessToken) {
	    this.token = accessToken;
	  }

	  public String getTokenType() {
	    return type;
	  }

	  public void setTokenType(String tokenType) {
	    this.type = tokenType;
	  }

	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  
	  public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public List<String> getRoles() {
	    return roles;
	  }
	}