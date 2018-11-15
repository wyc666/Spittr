package nju.edu.wyc.vo;

import java.util.Date;

import javax.validation.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.web.multipart.MultipartFile;

/**
 * 用户信息
 * 
 * @author wyc666
 *
 */
public class Spitter {
	@NotNull(message = "{name.null}")
	@Size(min = 3, max = 10, message = "{name.size}")
	private String name;
	private Date birthday;
//	@NotNull(message = "{sex.null}")
	private String sex;
	@NotNull(message = "{phone.null}")
	@Size(min = 11, max = 11, message = "{phone.size}")
	private String phone;
	@NotNull(message = "{password.null}")
	private String password;
	@NotNull(message = "{email.null}")
	@Email
	private String email;
	private String avatarPath;

	public String getAvatar() {
		return avatarPath;
	}

	public void setAvatar(String avatarPath) {
		this.avatarPath = avatarPath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
