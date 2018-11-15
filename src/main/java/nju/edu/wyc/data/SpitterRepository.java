package nju.edu.wyc.data;

import java.io.IOException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import nju.edu.wyc.util.Status;
import nju.edu.wyc.vo.Spitter;
import nju.edu.wyc.vo.SpitterForm;

public interface SpitterRepository {
	public Status registerSpitter(SpitterForm spitterForm) throws IllegalStateException, IOException;
	
	public Spitter getSpitterByPhone(String phone);
	
	public Spitter getSpitterByName(String userName);
}
