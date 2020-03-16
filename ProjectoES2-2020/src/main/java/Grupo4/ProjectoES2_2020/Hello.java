package Grupo4.ProjectoES2_2020;

public class Hello {

	private final static String HELLO  = "Hello Word";
	private String nome;

	public Hello(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sysHeloo(String extra) {
		System.out.println(HELLO + "by " + nome + "\n" + extra);
	}
	
	public static void main(String[] args) {
		Hello hello = new Hello("Alberto");
		hello.sysHeloo("Teste...");
	}
}
