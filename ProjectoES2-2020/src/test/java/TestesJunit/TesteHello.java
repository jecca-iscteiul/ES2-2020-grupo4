package TestesJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Grupo4.ProjectoES2_2020.Hello;

class TesteHello {

	private Hello hello;
	
	@Before
	public void ini() {
		hello = new Hello("ola");
	}
	
	@Test
	void test() {
		hello.getNome().equals("ola");
	}

}
