package wastedPotentials;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.ToStringConversion;

class firstWastedClass {
	
	  public static void main(String argsp[]) {

	String a;

	a = "[src[main[java,resources],test[java,resources]],Target[Classes,test-classes]]" ;
	Path path = Paths.get("C:\\Images\\Background\\Backgroundkeandar\\..\\..\\Foreground\\Necklace\\..\\Earrings\\..\\Etc");
	Path path1 = Paths.get("D:\\images\\src\\main\\java\\..\\resurce\\..\\..\\test\\java\\..\\resource\\..\\..\\..\\Target\\Classes\\..\\Test-Classes");
	StringBuilder s = new StringBuilder(a.length());
	for(int i=1;i<a.length()-1;i++) {
	if(a.charAt(i)=='[') {
		s.append("\\");
	}
	else if(a.charAt(i)==']') {
		s.append("\\..\\");
		
	}
	else if(a.charAt(i)==',') {
	s.append("\\..\\");
}
	else {
		s.append(a.charAt(i));
	}
	}
	try {
		System.out.println(s);

	    Files.createDirectories(path1);
	} catch (IOException e) {
	    System.err.println("Cannot create directories - " + e);
	}
	
	/*
	int count=0;
	int count1=0;
	int	count2=0;
	
	
	Stack x=new Stack();
	for(int i=0; i<a.length();i++)
	{
		
		if(a.charAt(i)== '[') 
		{	
			
			x.push(i);
			CharSequence FileName=a.subSequence(count, i);			
			File file = new File("c://abc"+ FileName);
			count=i+1;
		}
		
		if(a.charAt(i)== ']')
		{
			count1=i;
			x.pop();
			CharSequence FileName=a.subSequence(count1, i);			
			File file = new File("c://abc"+ FileName);
			
		}
		
		if(a.charAt(i)== ',')
		{
			count2=i;
			CharSequence FileName=a.subSequence(count, i);			
			File file = new File("c://abc"+ FileName);
			count=i+1;
			
		}
		
		
			
		}
	
	//File file = new File("C:/myfile.txt");
	  }
	  
	  static void stack_push() {
		  
		  stack.push(arg0)
	  }
	
*/
	  }
}
