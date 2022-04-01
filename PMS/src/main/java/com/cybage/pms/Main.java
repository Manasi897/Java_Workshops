package com.cybage.pms;

import java.util.List;
import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.service.ProductSer;
import com.cybage.service.ProductSerImpl;
import com.cybage.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductSer productService=new ProductSerImpl();
		 Scanner s=new Scanner(System.in);
	        int choice;
	        System.out.println("Enter your choice:");
	        choice=s.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	int n=productService.addProduct();
	        	if(n>0)
	        	{
	        		System.out.println("Product Inserted");
	        	}
	        	else
	        	{
	        		System.out.println("Insertion Failed");
	        	}
	        	break;
	        case 2:
	        	List<Product> pList=productService.getAllProduct();
	        	if(pList.isEmpty())
	        	{
	        		System.out.println("List is empty");
	        	}
	        	else
	        	{
	        		List.forEach(System.out::println);
	        	}
	        	break;
	        case 3:
	        	boolean result=productService.deleteProduct();
	        	if(result)
	        	{
	        		System.out.println("Product deleted successfully");
	        	}
	        	else
	        	{
	        		System.out.println("Product not deleted");
	        	}
	        	break;
	        case 4:
	        	System.out.println("Exit");
	        	
	        }
	       

	}

}
