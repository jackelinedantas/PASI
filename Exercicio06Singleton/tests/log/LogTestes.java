package log;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class LogTestes {

	@Test
	public void testGravarMensagem() {
		Log log = Log.getInstance();
		log.gravar("ProjAvSoftI");

		assertEquals("ProjAvSoftI;\n", log.mostrarMensagens());
		log.limpar();
	}

	@Test
	public void testGravarMensagens() {
		Log log = Log.getInstance();
		log.gravar("DesSistCorp");
		log.gravar("ProjAvSoftII");
		log.gravar("SistDist");

		assertEquals("DesSistCorp;\nProjAvSoftII;\nSistDist;\n", log.mostrarMensagens());
		log.limpar();
	}

	@Test
	public void testSingleton() {
		Log log1 = Log.getInstance();
		log1.gravar("gravando alguma coisa!");

		Log log2 = Log.getInstance();
		log2.gravar("gravando mais coisas!");

		assertEquals("gravando alguma coisa!;\ngravando mais coisas!;\n", log1.mostrarMensagens());

		log1.limpar();
	}

	@Test
	public void testLimpar() {
		Log log = Log.getInstance();
		log.gravar("limpando geral!");

		log.limpar();

		assertEquals("", log.mostrarMensagens());
	}

}
