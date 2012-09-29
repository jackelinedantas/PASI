package gerDocs;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.io.File;
import java.io.IOException;

public abstract class Documento {
	private String nome;
	private String profissao;
	private String email;

	public Documento(String nome, String profissao, String email) {
		this.nome = nome;
		this.profissao = profissao;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public String getEmail() {
		return email;
	}

	public File criarArquivo(String nome) {
		File arq = new File(nome);

		try {
			arq.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arq;
	}

	protected String escrever(String st) throws IOException {
		return st;
	}

}