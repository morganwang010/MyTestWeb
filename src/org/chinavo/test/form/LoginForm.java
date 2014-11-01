package org.chinavo.test.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

	  @NotNull(message = "User Name field is mandatory.")
	  @Size(min = 4, max = 50, message = "User Name field must be greater than 4 but less than 50 characters.")
	  private String username;

	  @NotNull(message = "Passphrase field is mandatory.")
	  @Size(min = 8, max = 50, message = "Passphrase field must be greater than 8 but less than 50 characters.")
	  private String password;

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username.trim();
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password.trim();
	  }
}
