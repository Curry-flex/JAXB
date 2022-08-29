package com.jaxb.manipulation.controller;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaxb.manipulation.entity.Data;
import com.jaxb.manipulation.entity.FirstChild;
import com.jaxb.manipulation.entity.Jaxb;
import com.jaxb.manipulation.entity.Parent;
import com.jaxb.manipulation.entity.SecondChild;
import com.jaxb.manipulation.entity.Transactions;



@RestController
@RequestMapping("jaxb")
public class JaxbController {
	
	
	@PostMapping
	   public void jaxManipulation() throws JAXBException
	   {
			 ArrayList<String> numberList = new ArrayList<>();
			    numberList.add("0674416665");
			    numberList.add("0778388105");
			    numberList.add("0738886086");

			    Jaxb c = new Jaxb();

			    c.setId(23);
			    c.setName("Ally");
			    c.setAge(45);
			    c.setAddress("allymtat@gmail.com");
			    c.setMobileNo(numberList);

			    //File file = new File("C:\\Users\\NETIZEN-ONE\\Desktop \\customer.xml");
			    JAXBContext jaxbContext = JAXBContext.newInstance(Jaxb.class);
			    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			    //jaxbMarshaller.marshal(c, file);// this line create customer.xml file in specified path.

			    StringWriter sw = new StringWriter();
			    jaxbMarshaller.marshal(c, sw);
			    String xmlString = sw.toString();
                
			    System.out.println(xmlString);
	   }
	
	
	
	@PostMapping("complex")
	public void jaxComplex() throws JAXBException
	{   FirstChild fc  = new FirstChild();
	    fc.setFname("Halima");
	    fc.setmName("Hamis");
	    fc.setLname("Mtati");
	    
	    SecondChild sc = new SecondChild();
	    sc.setEmail("Halima@gmail.com");
	    sc.setMobile("0674416666");
	    sc.setStreetNo("CHW237");
	    
	    HashSet<Transactions> ts = new HashSet<Transactions>();
	    
	    Transactions txn1 = new Transactions();
	    txn1.setAmount(1000);
	    txn1.setDate("20-07-2022");
	    
	    Transactions txn2 = new Transactions();
	    txn2.setAmount(2000);
	    txn2.setDate("21-07-2022");
	    
	    Transactions txn3 = new Transactions();
	    txn3.setAmount(3000);
	    txn3.setDate("22-07-2022");
	    
	    Transactions txn4 = new Transactions();
	    txn4.setAmount(4000);
	    txn4.setDate("23-07-2022");
	    
	    Data data = new Data();
	    data.setTrxn(ts);
	    
	    ts.add(txn1);
	    ts.add(txn2);
	    ts.add(txn3);
	    ts.add(txn4);
	    
		Parent p = new Parent();
	    p.setFirstChild(fc);
	    p.setSecondChild(sc);
	    p.setData(data);
		
	
		JAXBContext jaxbContext = JAXBContext.newInstance(Parent.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	    //jaxbMarshaller.marshal(c, file);// this line create customer.xml file in specified path.

	    StringWriter sw = new StringWriter();
	    jaxbMarshaller.marshal(p, sw);
	    String xmlString = sw.toString();
        
	    System.out.println(xmlString);
		
	}

}
