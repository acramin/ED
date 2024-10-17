/*
 * ALGED - Lista Ex - 1o Sem - Ex13
 *
 *	Controle de qualidade de uma empresa produtora de pregos - Vari�veis Globais
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex13
{	//Abre classe
	//Declara��o das vari�veis globais
	public	static	int		iI,iAMC,iAMD,AMOSTRAS=10;
	public	static	String	sIO,sTitle;
	public	static	double	dC,dD,dCM=0,dDM=0,dAMC,dAMD;

	public static void main(String Args[])
	{	//Abre m�todo main
						
		//Tela inicial
		sTitle="ALGED-Ex13";
		sIO="Controle de qualidade de uma empresa produtora de pregos - Vari�veis Globais";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Chamada dos m�todos
		for(iI=1;iI<=AMOSTRAS;iI++)
		{
			Digita_Comprimento();
			Digita_Diametro();
			Armazena_Amostra();
		}
		
		//Mostra m�dias
		Diametro_medio();
		Comprimento_medio();
		Maior_comprimento();
		Menor_diametro();
		
		//Termina execu��o
      System.exit(0);
   }	//Fecha m�todo main

	public static void Digita_Comprimento()
	{	//Abre m�todo Digita_Comprimento
		sTitle="Amostra "+iI+"/"+AMOSTRAS+" - Digite";
		sIO="Valor do Comprimento em mm (C>0):";
		do
		{
			dC=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(dC<=0);
		dCM+=dC;
	}	//Fecha m�todo Digita_Comprimento
	
	public static void Digita_Diametro()
	{	//Abre m�todo Digita_Di�metro
		sTitle="Amostra "+iI+"/"+AMOSTRAS+" - Digite";
		sIO="Valor do Di�metro em mm (D>0):";
		do
		{
			dD=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(dD<=0);
		dDM+=dD;
	}	//Fecha m�todo Digita_Di�metro

	public static void Diametro_medio()
	{	//Abre m�todo Di�metro_m�dio
		//Calculo do valor m�dio
		dDM/=AMOSTRAS;
		sTitle="Controle de Qualidade de Amostras - Resultado";
		sIO="Di�metro m�dio em mm: "+dDM;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Di�metro_m�dio

	public static void Comprimento_medio()
	{	//Abre m�todo Comprimento_m�dio
		//Calculo do valor m�dio
		dCM/=AMOSTRAS;
		sTitle="Controle de Qualidade de Amostras - Resultado";
		sIO="Comprimento m�dio em mm: "+dCM;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Comprimento_m�dio
	
	public static void Armazena_Amostra()
	{	//Abre m�todo Armazena_Amostra
		//Valores iniciais de di�metro e comprimento
		if(iI==1)
		{
			iAMD=iI;
			dAMD=dD;
			iAMC=iI;
			dAMC=dC;
		}
		else
		{
			//Maior comprimento
			if(dC>dAMC)
			{
				iAMC=iI;
				dAMC=dC;
			}
			//Menor di�metro
			if(dD<dAMD)
			{
				iAMD=iI;
				dAMD=dD;
			}
		}
	}	//Fecha m�todo Armazena_Amostra

	public static void Maior_comprimento()
	{	//Abre m�todo Maior_comprimento
		sTitle="Controle de Qualidade de Amostras - Resultado";
		sIO="Maior Comprimento (pe�a "+iAMC+"): "+dAMC;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Maior_comprimento

	public static void Menor_diametro()
	{	//Abre m�todo Menor_di�metro
		sTitle="Controle de Qualidade de Amostras - Resultado";
		sIO="Menor Di�metro (pe�a "+iAMD+"): "+dAMD;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Menor_di�metro
		
}	//Fecha classe
