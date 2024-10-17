/*
 * ALGED - Lista Ex - 1o Sem - Ex19
 *
 *	Controle de qualidade de uma empresa produtora de pregos - Passagem de Par�metros
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex19
{	//Abre classe
	//Declara��o das vari�veis globais
	public	static	int		AMOSTRAS=10;

	public static void main(String Args[])
	{	//Abre m�todo main
		//Declara��o das vari�veis locais
		String	sIO,sTitle;
		double	dC,dD,dCM=0,dDM=0,dAMC=0,dAMD=0;
		int		iI,iAMC=0,iAMD=0;
						
		//Tela inicial
		sTitle="ALGED-Ex19";
		sIO="Controle de qualidade de uma empresa produtora de pregos - Passagem de Par�metros";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Digita amostras
		for(iI=1;iI<=AMOSTRAS;iI++)
		{
			dC=Comprimento(iI);
			dCM+=dC;
			dD=Diametro(iI);
			dDM+=dD;
			//Analisa valores digitados
			if(iI==1)
			{
				iAMD=iI;	dAMD=dD;	iAMC=iI;	dAMC=dC;
			}
			else
			{
				//Maior comprimento
				if(dC>dAMC)
				{
					iAMC=iI;	dAMC=dC;
				}
				//Menor di�metro
				if(dD<dAMD)
				{
					iAMD=iI;	dAMD=dD;
				}
			}
		}
		sTitle="Controle de Qualidade de Amostras - Resultado";
		//Calculo e apresenta��o do valor m�dio
		dDM/=AMOSTRAS;
		sIO="Di�metro m�dio em mm: "+dDM;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		//Calculo e apresenta��o do valor m�dio
		dCM/=AMOSTRAS;
		sIO="Comprimento m�dio em mm: "+dCM;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		//Apresenta��o do maior comprimento
		sIO="Maior Comprimento (pe�a "+iAMC+"): "+dAMC;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		//Apresenta��o do menor di�metro
		sIO="Menor Di�metro (pe�a "+iAMD+"): "+dAMD;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
			
		//Termina execu��o
      System.exit(0);
   }	//Fecha m�todo main

	public static double	Comprimento(int iI)
	{	
		String	sTitle,sIO;
		double	dC;
		
		sTitle="Amostra "+iI+"/"+AMOSTRAS+" - Digite";
		sIO="Valor do Comprimento em mm (C>0):";
		do
		{
			dC=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(dC<=0);
		return	dC;
	}
		
	public static double	Diametro(int iI)
	{
		String	sTitle,sIO;
		double	dD;

		sTitle="Amostra "+iI+"/"+AMOSTRAS+" - Digite";
		sIO="Valor do Di�metro em mm (D>0):";
		do
		{
			dD=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(dD<=0);
		return	dD;
	}

}	//Fecha classe
