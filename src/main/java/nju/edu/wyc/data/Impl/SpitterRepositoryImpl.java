package nju.edu.wyc.data.Impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import nju.edu.wyc.data.SpitterRepository;
import nju.edu.wyc.util.Status;
import nju.edu.wyc.vo.Spitter;
import nju.edu.wyc.vo.SpitterForm;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository{

	@Override
	public Spitter getSpitterByPhone(String phone) {
		Spitter spitter = new Spitter();
		spitter.setName("网二");
		spitter.setSex("female");
		spitter.setPhone("15061928389");
		spitter.setBirthday(new Date());
		return spitter;
	}

	@Override
	public Status registerSpitter(SpitterForm spitterForm) throws IllegalStateException, IOException {
		Spitter spitter = new Spitter();
		spitter.setBirthday(spitterForm.getBirthday());
		spitter.setEmail(spitterForm.getEmail());
		spitter.setName(spitterForm.getName());
		spitter.setpassword(spitterForm.getPassword());
		spitter.setPhone(spitterForm.getPhone());
		spitter.setSex(spitterForm.getSex());
		String avatarPath = "/Users/wyc666/avatars/"+spitter.getName()+".jpg";
		spitter.setAvatar(avatarPath);
		MultipartFile avatar = spitterForm.getAvatar();
		avatar.transferTo(new File(avatarPath));
		return Status.SUCCCESS;
	}

	@Override
	public Spitter getSpitterByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
