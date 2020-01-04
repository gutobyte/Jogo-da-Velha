import java.util.Scanner;

public class JogoDaVelha {
	
	static boolean checar=true,empt=false;
	
	public static void empate(boolean checagem, char[][]jogo3)
	{
		empt=checagem;
		
		if(jogo3[0][0]!='A' && jogo3[0][1]!='B' && jogo3[0][2]!='C' && jogo3[1][0]!='D'&& jogo3[1][1]!='E'&&jogo3[1][2]!='F'&&jogo3[2][0]!='G'&&jogo3[2][1]!='H'&&jogo3[2][2]!='I' && checar==true)
		{
			empt=true;
		}
		
		
	}
	
	public static String ganhadorX()
	{
		String player1=" PARABÉNS!!! PLAYER 1 VENCEU!!!";
		
		return String.format(player1);
	}
	public static String ganhadorO()
	{
		String player2="PARABÉNS!!! PLAYER 2 VENCEU!!!";
		
		return String.format(player2);
	}
	
	public static void checagem(boolean check,char[][]jogo2)
	
	{
		
		checar = check;
		
		
		if(jogo2[0][0]=='X' && jogo2[0][1]=='X' && jogo2[0][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[1][0]=='X' && jogo2[1][1]=='X' && jogo2[1][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[2][0]=='X' && jogo2[2][1]=='X' && jogo2[2][2]=='X')
		{
			checar=false;;
		}
		else if(jogo2[1][0]=='X' && jogo2[1][1]=='X' && jogo2[1][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[2][0]=='X' && jogo2[2][1]=='X' && jogo2[2][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][0]=='X' && jogo2[1][0]=='X' && jogo2[2][0]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][1]=='X' && jogo2[1][1]=='X' && jogo2[2][1]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][2]=='X' && jogo2[1][2]=='X' && jogo2[2][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][0]=='X' && jogo2[1][1]=='X' && jogo2[2][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][2]=='X' && jogo2[1][1]=='X' && jogo2[2][0]=='X')
		{
			checar=false;
		}
		
		//checagem do player2=o
		
		else if(jogo2[0][0]=='O' && jogo2[0][1]=='O' && jogo2[0][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[1][0]=='O' && jogo2[1][1]=='O' && jogo2[1][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[2][0]=='O' && jogo2[2][1]=='O' && jogo2[2][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[1][0]=='O' && jogo2[1][1]=='O' && jogo2[1][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[2][0]=='O' && jogo2[2][1]=='O' && jogo2[2][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[0][0]=='O' && jogo2[1][0]=='O' && jogo2[2][0]=='O')
		{
			checar=false;
		}
		else if(jogo2[0][1]=='O' && jogo2[1][1]=='O' && jogo2[2][1]=='O')
		{
			checar=false;
		}
		else if(jogo2[0][2]=='O' && jogo2[1][2]=='O' && jogo2[2][2]=='O')
		{
			checar=false;
		}
		else if(jogo2[0][0]=='O' && jogo2[1][1]=='O' && jogo2[2][2]=='X')
		{
			checar=false;
		}
		else if(jogo2[0][2]=='O' && jogo2[1][1]=='O' && jogo2[2][0]=='O')
		{
			checar=false;
		}
		
		
	}
	
	public static char[][] mode_Atual(char matrizjogo[][])
	{
		
		char jogo[][] = matrizjogo;

		for(int i=0;i<matrizjogo.length;i++)
		{
			System.out.print(" ");
				System.out.println();
		for(int j=0;j<matrizjogo.length;j++)
		{
			System.out.print(" "+matrizjogo[i][j]);
		}

		}
		return jogo;
	}
	
	
	public static char[][] modelo_Padrao() {
		
		char matriz[][]= new char [3][3];
		matriz[0][0]='A';
		matriz[0][1]='B';
		matriz[0][2]='C';
		matriz[1][0]='D';
		matriz[1][1]='E';
		matriz[1][2]='F';
		matriz[2][0]='G';
		matriz[2][1]='H';
		matriz[2][2]='I';
		
		
		
		for(int i=0;i<matriz.length;i++)
		{
			System.out.print(" ");
				System.out.println();
		for(int j=0;j<matriz.length;j++)
		{
			System.out.print(" "+matriz[i][j]);
		}

		}
			
		return matriz;
	} 
	

	public static void main(String[] args) {
		
		boolean em_andamento=true;
		
		char decisao, decisao02;
		char matrizGame[][] = new char[3][3];
		matrizGame[0][0]='A';
		matrizGame[0][1]='B';
		matrizGame[0][2]='C';
		matrizGame[1][0]='D';
		matrizGame[1][1]='E';
		matrizGame[1][2]='F';
		matrizGame[2][0]='G';
		matrizGame[2][1]='H';
		matrizGame[2][2]='I';
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("BEM VINDO AO JOGO DA VELHA");
		
		System.out.println("PLAYER 1 = 'X'              PLAYER 2 = 'O");
			
		System.out.println("MODELO: AS LETRAS DEFINEM ONDE É MARCADO O 'X' OU 'O'");
		modelo_Padrao();
		
		while(checar==true)
		{
			
			
			
		System.out.println("\n");
		System.out.println("PLAYER 1 - 'X':");
		System.out.println("ESCOLHA A POSIÇÃO");
		decisao=scan.next().charAt(0);
		
		
		if(decisao=='A' && matrizGame[0][0]=='A')
		{
			
			matrizGame[0][0]='X';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorX());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		    
		  
		}
		else if(decisao=='B' && matrizGame[0][1]=='B') 
		{
			
			matrizGame[0][1]='X';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorX());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		  
		}
		else if(decisao=='C'&& matrizGame[0][2]=='C')
		{
			
			matrizGame[0][2]='X';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorX());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		    
		}
		else if(decisao=='D'&& matrizGame[1][0]=='D')
		{
			
			matrizGame[1][0]='X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		
		}
		else if(decisao=='E'&& matrizGame[1][1]=='E')
		{
			
			matrizGame[1][1]='X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		
		}
		else if(decisao=='F'&& matrizGame[1][2]=='F')
		{
			
			matrizGame[1][2]= 'X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
			
		}
		else if(decisao=='G'&& matrizGame[2][0]=='G')
		{
			
			matrizGame[2][0]= 'X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		
		}
		else if(decisao=='H'&& matrizGame[2][1]=='H') 
		{
			
			matrizGame[2][1]= 'X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
			
		}
		else if(decisao=='I'&& matrizGame[2][2]=='I')
		{
			
			matrizGame[2][2]='X';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
				System.out.println(ganhadorX());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
			
		}
		else
		{
			System.out.println("O QUADRANTE QUE VOCÊ PRETENDE MARCAR JA ESTÁ OCUPADO PELA MARCAÇÃO DE OUTRO JOGADOR OU VOCÊ DIGITOU UMA LETRA QUE NÃO CORRESPONDE A NENHUM QUADRANTE, JOGADA PERDIDA!!");
		}
		System.out.println();
		System.out.println("PLAYER 2 - 'O':");
		
		System.out.println("ESCOLHA A POSIÇÃO");
		decisao02=scan.next().charAt(0);
		
		
		if(decisao02=='A' && matrizGame[0][0]=='A')
		{
			
			matrizGame[0][0]='O';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		}
		else if(decisao02=='B' && matrizGame[0][1]=='B') 
		{
			
			matrizGame[0][1]='O';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		}
		else if(decisao02=='C'&& matrizGame[0][2]=='C')
		{
			
			matrizGame[0][2]='O';
		    mode_Atual(matrizGame);
		    checagem(em_andamento, matrizGame);
		    empate(empt, matrizGame);
		    if(checar==false)
		    {
		    	System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
		    else if(empt==true)
		    {
		    	System.out.println("\n");
		    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
		    	break;
		    }
		}
		else if(decisao02=='D'&& matrizGame[1][0]=='D')
		{
			
			matrizGame[1][0]='O';
			mode_Atual(matrizGame);	
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else if(decisao02=='E'&& matrizGame[1][1]=='E')
		{
			
			matrizGame[1][1]='O';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else if(decisao02=='F'&& matrizGame[1][2]=='F')
		{
			
			matrizGame[1][2]= 'O';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else if(decisao02=='G'&& matrizGame[2][0]=='G')
		{
			
			matrizGame[2][0]= 'O';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else if(decisao02=='H'&& matrizGame[2][1]=='H') 
		{
			
			matrizGame[2][1]= 'O';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else if(decisao02=='I'&& matrizGame[2][2]=='I')
		{
			
			matrizGame[2][2]='O';
			mode_Atual(matrizGame);
			checagem(em_andamento, matrizGame);
			empate(empt, matrizGame);
			if(checar==false)
		    {
				System.out.println("\n");
		    	System.out.println(ganhadorO());
		    	break;
		    }
			  else if(empt==true)
			    {
			    	System.out.println("\n");
			    	System.out.println("SEM GARANHADORES JOGO EMPATADO");
			    	break;
			    }
		}
		else
		{
			System.out.println("O QUADRANTE QUE VOCÊ PRETENDE MARCAR JA ESTÁ OCUPADO PELA MARCAÇÃO DE OUTRO JOGADOR OU VOCÊ DIGITOU UMA LETRA QUE NÃO CORRESPONDE A NENHUM QUADRANTE, JOGADA PERDIDA!!!");
		}
		
				
		}
	scan.close();
	}

}

