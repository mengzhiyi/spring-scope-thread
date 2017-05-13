package ch10.valid;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@Validated
@PasswordsEqualConstraint
public class PersonForm {
    @NotNull
    @Size(max=64)
    private String name;
    
    @Min(0)
    private int age;
    
    //@Ip(groups={IpGroup.class})
    @Ip
    private String ip;

    private String password;
    private String repeartPassword;
    
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(@Min(0) int age) {
        this.age = age;
    }

    public PersonForm(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeartPassword() {
        return repeartPassword;
    }

    public void setRepeartPassword(String repeartPassword) {
        this.repeartPassword = repeartPassword;
    }
    
    

}
