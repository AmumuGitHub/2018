package com.amumu.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@SequenceGenerator(name = "seqUser", sequenceName = "seq_t_user")
// name是这个序列生成器的代号，sequenceName是要存入数据库的序列的名字
public class User {
	@Id
	@GeneratedValue(generator = "seqUser") // 写明使用哪个序列生成器
	private int id;
	private String username;
	private String password;
	private String nickname;


	public User() {
		super();
	}

	public User(int id, String username, String password, String nickname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname + "]";
	}

}
