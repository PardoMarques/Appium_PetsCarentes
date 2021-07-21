package com.caiomarques.screenObjects;
import org.openqa.selenium.By;
import com.caiomarques.core.BaseScreen;

import io.appium.java_client.MobileElement;

import static com.caiomarques.core.DriverFactory.getDriver;

public class MainScreen extends BaseScreen{
	
	//Region - Mapeamento
	
		By btnMenu = 		By.xpath("//android.widget.Button[@text='Menu']");
		
		By btnCONTEUDO = 	By.xpath("//android.view.View[@text='CONTE�DO']");
		By btnSOBRE = 		By.xpath("//android.view.View[@text='SOBRE N�S']");
		By btnOQFAZEMOS = 	By.xpath("//android.view.View[@text='O QUE FAZEMOS']");
		By btnFACAPARTE =	By.xpath("//android.view.View[@text='FA�A PARTE']");
		By btnPROJETOS = 	By.xpath("//android.view.View[@text='PROJETOS']");
		By btnCONTATO = 	By.xpath("//android.view.View[@text='CONTATO']");
		By btnDOAR = 		By.xpath("//android.view.View[@text='DOAR AGORA']");
		
		By btnQUEMSOMOS = 		By.xpath("//android.view.View[@text='QUEM SOMOS']");
		By btnTRANSPARENCIA = 	By.xpath("//android.view.View[@text='TRANSPAR�NCIA']");
		
		By btnATUACAO = 		By.xpath("//android.view.View[@text='ATUA��O EM ESCOLAS']");
		By btnCONTEUDOS = 		By.xpath("//android.view.View[@text='CONTE�DOS']");
		By btnLIDERES = 		By.xpath("//android.view.View[@text='FORMA��O DE L�DERES']");
		By btnCANALYOUTUBE = 	By.xpath("//android.view.View[@text='CANAL NO YOUTUBE']");
		By btnPRIVACIDADE = 	By.xpath("//android.view.View[@text='POL�TICA DE PRIVACIDADE']");
		
		By btnDOE = 			By.xpath("//android.view.View[@text='DOE!']");
		By btnVOLUNTARIO = 		By.xpath("//android.view.View[@text='SEJA UM VOLUNT�RIO']");
		By btnTRABCONOSCO = 	By.xpath("//android.view.View[@text='TRABALHE CONOSCO']");
		By btnREPUBLIQUE = 		By.xpath("//android.view.View[@text='REPUBLIQUE OS CONTE�DOS']");
		
		By btnACADEMIAINOVA = 	By.xpath("//android.view.View[@text='ACADEMIA DE INOVA��O CIDAD�']");
		By btnARTQUINTO = 		By.xpath("//android.view.View[@text='ARTIGO QUINTO']");
		By btnCANVASPOLITIC = 	By.xpath("//android.view.View[@text='CANVAS DE POLITICAS PUBLICAS']");
		By btnDESPOLARIZE = 	By.xpath("//android.view.View[@text='DESPOLARIZE']");
		By btnDIALOGA = 		By.xpath("//android.view.View[@text='DIALOGA!']");
		By btnEQUIDADE = 		By.xpath("//android.view.View[@text='EQUIDADE']");
		By btnHACKATHON = 		By.xpath("//android.view.View[@text='HACKATHON C�VICO']");
		By btnNAOMECANC = 		By.xpath("//android.view.View[@text='N�O ME CANCELA']");
			
		By btnOK =	By.xpath("//android.widget.Button[@text='OK']");
	    
		By btnExtVLibras = 	By.xpath("//android.widget.Image[@text='Conte�do acess�vel em libras usando o VLibras Widget com op��es dos Avatares �caro ou Hozana.']");
		By btnExtAcess = 	By.xpath("//android.view.View[@resource-id='real-accessability-btn']");
	
	//EndRegion
		
	//Region - Objetos de tela

		public MobileElement botaoCONTEUDO(){
		    return getDriver().findElement(btnCONTEUDO);
		}
		
		public MobileElement botaoSOBRE(){
		    return getDriver().findElement(btnSOBRE);
		}
		
		public MobileElement botaoOQFAZEMOS(){
		    return getDriver().findElement(btnOQFAZEMOS);
		}
		
		public MobileElement botaoFACAPARTE(){
		    return getDriver().findElement(btnFACAPARTE);
		}
		
		public MobileElement botaoPROJETOS(){
		    return getDriver().findElement(btnPROJETOS);
		}
		
		public MobileElement botaoCONTATO(){
		    return getDriver().findElement(btnCONTATO);
		}
		
		public MobileElement botaoDOAR(){
		    return getDriver().findElement(btnDOAR);
		}
		
		public MobileElement botaoQUEMSOMOS(){
		    return getDriver().findElement(btnQUEMSOMOS);
		}
		
		public MobileElement botaoTRANSPARENCIA(){
		    return getDriver().findElement(btnTRANSPARENCIA);
		}
		
		public MobileElement botaoATUACAO(){
		    return getDriver().findElement(btnATUACAO);
		}
		
		public MobileElement botaoCONTEUDOS(){
		    return getDriver().findElement(btnCONTEUDOS);
		}
		
		public MobileElement botaoLIDERES(){
		    return getDriver().findElement(btnLIDERES);
		}
		
		public MobileElement botaoCANALYOUTUBE(){
		    return getDriver().findElement(btnCANALYOUTUBE);
		}
		
		public MobileElement botaoPRIVACIDADE(){
		    return getDriver().findElement(btnPRIVACIDADE);
		}
		
		public MobileElement botaoDOE(){
		    return getDriver().findElement(btnDOE);
		}
		
		public MobileElement botaoVOLUNTARIO(){
		    return getDriver().findElement(btnVOLUNTARIO);
		}
		
		public MobileElement botaoTRABCONOSCO(){
		    return getDriver().findElement(btnTRABCONOSCO);
		}
		
		public MobileElement botaoREPUBLIQUE(){
		    return getDriver().findElement(btnREPUBLIQUE);
		}
		
		public MobileElement botaoACADEMIAINOVA(){
		    return getDriver().findElement(btnACADEMIAINOVA);
		}
		
		public MobileElement botaoARTQUINTO(){
		    return getDriver().findElement(btnARTQUINTO);
		}
		
		public MobileElement botaoCANVASPOLITIC(){
		    return getDriver().findElement(btnCANVASPOLITIC);
		}
		
		public MobileElement botaoDESPOLARIZE(){
		    return getDriver().findElement(btnDESPOLARIZE);
		}
		
		public MobileElement botaoDIALOGA(){
		    return getDriver().findElement(btnDIALOGA);
		}
		
		public MobileElement botaoEQUIDADE(){
		    return getDriver().findElement(btnEQUIDADE);
		}
		
		public MobileElement botaoHACKATHON(){
		    return getDriver().findElement(btnHACKATHON);
		}
		
		public MobileElement botaoNAOMECANC(){
		    return getDriver().findElement(btnNAOMECANC);
		}

	//EndRegion
		
	//Region - M�todos
	
		public void clicarMenu() {
			clicar(btnMenu);
		}
		
		public boolean clicavelMenu() {
			return obterStatusAtr(btnMenu, "clickable");
		}
		
		public void clicarOK() {
			clicar(btnOK);
		}
		
		public boolean clicavelOK() {
			return obterStatusAtr(btnOK, "clickable");
		}
		
		
		public void clicarOpcaoMenu(String topico) {
			
			switch (topico) {
				case "CONTE�DO":
					clicar(btnCONTEUDO);
					break;
					
				case "SOBRE N�S":
					clicar(btnSOBRE);
					break;
					
				case "O QUE FAZEMOS":
					clicar(btnOQFAZEMOS);
					break;
					
				case "FA�A PARTE":
					clicar(btnFACAPARTE);
					break;
					
				case "PROJETOS":
					clicar(btnPROJETOS);
					break;
	
				case "CONTATO":
					clicar(btnCONTATO);
					break;
	
				case "DOAR AGORA":
					clicar(btnDOAR);
					break;
	
				default:
					System.out.println("T�PICO INV�LIDO");
				   	break;
			}
		}
		
		public void clicarOpcaoMenu(String topico, String subTopico) {
			
			switch (topico) {				
				case "SOBRE N�S":
					clicar(btnSOBRE);
					switch (subTopico) {				
						case "QUEM SOMOS":
							clicar(btnQUEMSOMOS);
							break;
							
						case "TRANSPAR�NCIA":
							clicar(btnTRANSPARENCIA);
							break;
							
						default:
							System.out.println("OP��O INV�LIDA");
						   	break;
					}
					break;
					
				case "O QUE FAZEMOS":
					clicar(btnOQFAZEMOS);
					switch (subTopico) {				
						case "ATUA��O EM ESCOLAS":
							clicar(btnATUACAO);
							break;
							
						case "CONTE�DOS":
							clicar(btnCONTEUDOS);
							break;
							
						case "FORMA��O DE L�DERES":
							clicar(btnLIDERES);
							break;
							
						case "CANAL NO YOUTUBE":
							clicar(btnCANALYOUTUBE);
							break;
							
						case "POL�TICA DE PRIVACIDADE":
							clicar(btnPRIVACIDADE);
							break;
							
						case "SOBRE N�S":
							clicar(btnSOBRE);
							break;
							
						default:
							System.out.println("OP��O INV�LIDA");
						   	break;
					}
							
					break;
	
				case "FA�A PARTE":
					clicar(btnFACAPARTE);
					switch (subTopico) {				
						case "DOE!":
							clicar(btnDOE);
							break;
							
						case "SEJA UM VOLUNT�RIO":
							clicar(btnVOLUNTARIO);
							break;
							
						case "TRABALHE CONOSCO":
							clicar(btnTRABCONOSCO);
							break;
							
						case "REPUBLIQUE OS CONTE�DOS":
							clicar(btnREPUBLIQUE);
							break;
							
						default:
							System.out.println("OP��O INV�LIDA");
						   	break;
					}
					break;
	
				case "PROJETOS":
					clicar(btnPROJETOS);
					switch (subTopico) {				
						case "ACADEMIA DE INOVA��O CIDAD�":
							clicar(btnACADEMIAINOVA);
							break;
							
						case "ARTIGO QUINTO":
							clicar(btnARTQUINTO);
							break;
							
						case "CANVAS DE POLITICAS PUBLICAS":
							clicar(btnCANVASPOLITIC);
							break;
							
						case "DESPOLARIZE":
							clicar(btnDESPOLARIZE);
							break;
						case "DIALOGA!":
							clicar(btnDIALOGA);
							break;
							
						case "EQUIDADE":
							clicar(btnEQUIDADE);
							break;
							
						case "HACKATHON C�VICO":
							clicar(btnHACKATHON);
							break;
							
						case "N�O ME CANCELA":
							clicar(btnNAOMECANC);
							break;
							
						default:
							System.out.println("OP��O INV�LIDA");
						   	break;
					}
					break;
				
				default:
					System.out.println("OP��O INV�LIDA");
				   	break;
			}
		}
		
	//EndRegion

}
