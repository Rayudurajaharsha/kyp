package webdevs.kyp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdevs.kyp.entity.Mobiles;
import webdevs.kyp.repo.mobilerepo;

@Service
public class Kypservice {

	@Autowired
	mobilerepo mbrp;
	
	public Mobiles savedata(Mobiles mb) {
		return mbrp.save(mb);
	}
	public List<Mobiles> getall() {
		return  mbrp.findAll();
	}
}
