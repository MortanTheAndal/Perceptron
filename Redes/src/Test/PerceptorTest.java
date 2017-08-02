package Test;

import Main.Perceptron;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PerceptorTest {
	Perceptron p; 
	List<Integer> in;
	List<Integer> we;
	@Before
	public void setUp() throws Exception {
		p=new Perceptron();
		in = new ArrayList<Integer>();
		we = new ArrayList<Integer>();
	}

	@Test
	public void AndTest() {
		
		in.add(1);
		in.add(1);
		we.add(2);
		we.add(2);
		
		p.setInput(in);
		p.setWeights(we);
		p.setBias(-3);
		
		
		assertEquals(p.output(), 1);
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(0); in.add(1);
		p.setInput(in);
		assertEquals(p.output(), 0); 
		assertNotEquals(p.output(),1);
		
		in.clear();
		in.add(1); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 0);
		assertNotEquals(p.output(),1);
		
		in.clear();
		in.add(0); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 0);
		assertNotEquals(p.output(),1);
	}

	@Test
	public void OrTest(){
		in.add(1); in.add(1);
		we.add(1); we.add(1);
		
		p.setInput(in); 
		p.setWeights(we);
		p.setBias(0);
		
		assertEquals(p.output(), 1);
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(0); in.add(1);
		p.setInput(in);
		assertEquals(p.output(), 1); 
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(1); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 1);
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(0); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 0);
		assertNotEquals(p.output(),1);
	}
	
	@Test 
	public void NANDTest(){
		in.add(1); in.add(1);
		we.add(-2); we.add(-2);
		
		p.setInput(in);
		p.setWeights(we);
		p.setBias(3);
		
		assertEquals(p.output(), 0);
		assertNotEquals(p.output(),1);
		
		in.clear();
		in.add(0); in.add(1);
		p.setInput(in);
		assertEquals(p.output(), 1); 
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(1); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 1);
		assertNotEquals(p.output(),0);
		
		in.clear();
		in.add(0); in.add(0);
		p.setInput(in);
		assertEquals(p.output(), 1);
		assertNotEquals(p.output(),0);
	}
}
