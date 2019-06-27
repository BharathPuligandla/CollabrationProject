package com.bharath.colabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.colabapi.model.Blog;

@RestController
public class BlogController 
{
@RequestMapping("/getblogs")
public List<Blog> addBlog()
{
	List<Blog> bloglist=new ArrayList<Blog>();
	Blog blog1=new Blog();
	blog1.setBlogName("bharath");
	blog1.setBlogOwner("bharath");
	blog1.setBlogTitle("bharath");
	Blog blog2=new Blog();
	blog2.setBlogName("nani");
	blog2.setBlogOwner("nani");
	blog2.setBlogTitle("nani");
	bloglist.add(blog1);
	bloglist.add(blog2);
	return bloglist;
	
}
}
