package pt.creational.builder.account;

import java.util.Date;

public class Account {
    private String username;
    private String password;
    private String bio;
    private Date dob;

    public Account() { }

    public static Builder getBuilder() {
        return new Account().new Builder();
    }
    
    @Override
    public String toString() {
        return "Account [username=" + username + ", password=" + password
                + ", bio=" + bio + ", dob=" + dob + "]";
    }
    
    public class Builder {
        public Builder setUsername(String username) {
            Account.this.username = username;
            return this;
        }
        
        public Builder setPassword(String password) {
            Account.this.password = password;
            return this;
        }
        
        public Builder setBio(String bio) {
            Account.this.bio = bio;
            return this;
        }
        
        public Builder setDob(Date dob) {
            Account.this.dob = dob;
            return this;
        }
        
        public Account build() {
            return Account.this;
        }
    }
}
