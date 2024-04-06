package com.blackcoffer.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.repository.Repository;
import com.blackcoffer.service.Services;

@Service
public class ServiceImpl implements Services {

	@Autowired
	private Repository repository;
	
	@Override
	public List<String> getIntensity() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getIntensity();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getLikelihood() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getLikelihood();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getRelevance() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getRelevance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getYear() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getYear();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getCountry() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getCountry();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getTopic() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getTopic();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	@Override
	public List<String> getRegion() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getRegion();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<String> getCity() 
	{
		List<String> list = new ArrayList<>();
		try
		{
			list = repository.getCity();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}
