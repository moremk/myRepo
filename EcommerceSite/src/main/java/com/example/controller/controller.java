package com.example.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.*;
import com.example.repository.Repository;

@Controller
public class controller {
	
	@Autowired
	private Repository repo;
	
	@GetMapping("/home")
	public String img(Model model)
	{
		List<Image> im=repo.findAll();
        model.addAttribute("im",im);
		return "home";
	}

	
	@PostMapping("/imgupload")
	public String img(@RequestParam MultipartFile img)
	{
        Image im=new Image();
        im.setImg(img.getOriginalFilename());
        
        repo.save(im);
        if(im!=null)
        {
        	try {
        		File saveFile=new ClassPathResource("static/img").getFile();
        		Path path=Paths.get(saveFile.getAbsolutePath()+File.separator+img.getOriginalFilename());
        		Files.copy(img.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        }
        
		return "redirect:/home";
		
	}
	
}
