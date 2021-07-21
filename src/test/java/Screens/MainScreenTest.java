package Screens;
import org.junit.Assert;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import org.junit.Test;

import com.caiomarques.core.BaseTest;
import com.caiomarques.screenObjects.MainScreen;


public class MainScreenTest extends BaseTest{
		
		private MainScreen mains = new MainScreen();
		
		@Test
		public void validandoBotaoMenu()  {
			Assert.assertEquals(mains.clicavelMenu(), true); 
		}
		
		@Test
		public void validandoMenuTopicos()  {
			mains.clicarMenu();
			
			Assert.assertEquals(mains.botaoCONTEUDO().getText(), "CONTE�DO"); 
			Assert.assertEquals(mains.botaoSOBRE().getText(), "SOBRE N�S"); 
			Assert.assertEquals(mains.botaoOQFAZEMOS().getText(), "O QUE FAZEMOS"); 
			Assert.assertEquals(mains.botaoFACAPARTE().getText(), "FA�A PARTE"); 
			Assert.assertEquals(mains.botaoPROJETOS().getText(), "PROJETOS"); 
			Assert.assertEquals(mains.botaoCONTATO().getText(), "CONTATO"); 
			Assert.assertEquals(mains.botaoDOAR().getText(), "DOAR"); 
		}
		
		@Test
		public void validandoMenuSubTopicosSobreNos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("SOBRE N�S");
			
			Assert.assertEquals(mains.botaoQUEMSOMOS(), "QUEM SOMOS");
			Assert.assertEquals(mains.botaoTRANSPARENCIA(), "TRANSPAR�NCIA");
		}
		
		@Test
		public void validandoMenuSubTopicosOqueFazemos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("O QUE FAZEMOS");
			
			Assert.assertEquals(mains.botaoATUACAO().getText(), "ATUA��O EM ESCOLAS");
			Assert.assertEquals(mains.botaoCONTEUDOS().getText(), "CONTE�DOS");
			Assert.assertEquals(mains.botaoLIDERES().getText(), "FORMA��O DE L�DERES");
			Assert.assertEquals(mains.botaoCANALYOUTUBE().getText(), "CANAL NO YOUTUBE");
			Assert.assertEquals(mains.botaoPRIVACIDADE().getText(), "POL�TICA DE PRIVACIDADE");
		}
		
		@Test
		public void validandoMenuSubTopicosFacaParte()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("FA�A PARTE");
			
			Assert.assertEquals(mains.botaoDOE().getText(), "DOE!");
			Assert.assertEquals(mains.botaoVOLUNTARIO().getText(), "SEJA UM VOLUNT�RIO");
			Assert.assertEquals(mains.botaoTRABCONOSCO().getText(), "TRABALHE CONOSCO");
			Assert.assertEquals(mains.botaoREPUBLIQUE().getText(), "REPUBLIQUE OS CONTE�DOS");
		}
		
		@Test
		public void validandoMenuSubTopicosProjetos()  {
			mains.clicarMenu();
			mains.clicarOpcaoMenu("PROJETOS");
			
			Assert.assertEquals(mains.botaoACADEMIAINOVA().getText(), "ACADEMIA DE INOVA��O CIDAD�");
			Assert.assertEquals(mains.botaoARTQUINTO().getText(), "ARTIGO QUINTO");
			Assert.assertEquals(mains.botaoCANVASPOLITIC().getText(), "CANVAS DE POLITICAS PUBLICAS");
			Assert.assertEquals(mains.botaoDESPOLARIZE().getText(), "DESPOLARIZE");
			Assert.assertEquals(mains.botaoDIALOGA().getText(), "DIALOGA!");
			Assert.assertEquals(mains.botaoEQUIDADE().getText(), "EQUIDADE");
			Assert.assertEquals(mains.botaoHACKATON().getText(), "HACKATON C�VICO");
			Assert.assertEquals(mains.botaoNAOMECANC().getText(), "N�O ME CANCELA");
		}
}
