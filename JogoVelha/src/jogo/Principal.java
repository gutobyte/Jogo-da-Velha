package jogo;
import java.util.Scanner;


public class Principal {
	
	 public static void jogoCompleto(char jogoAtual[][])
	 {
		 for(int i=0;i<jogoAtual.length;i++)
			{
				System.out.print(" ");
				System.out.println();
				for(int j=0;j<jogoAtual.length;j++) 
				{
					System.out.print(" "+jogoAtual[i][j]);					
				}				
			}
	 }

	
	
	public static void main(String[] args) {
		
		String jogadorX="X";
		String jogadorO="O";
		Marcar m = new Marcar();
		Checagem c = new Checagem();
		Modelo mod = new Modelo();
		Scanner scan = new Scanner(System.in);
		
		
		char jogo[][]= new char[3][3];
		jogo[0][0]='A';
		jogo[0][1]='B';
		jogo[0][2]='C';
		
		jogo[1][0]='D';
		jogo[1][1]='E';
		jogo[1][2]='F';
		
		
		jogo[2][0]='G';
		jogo[2][1]='H';
		jogo[2][2]='I';
		
		mod.exemploJogo();
		
	
		while(c.empate(jogo) == false)
		{
		
		System.out.println();
		System.out.println("PLAYER 1 - "+jogadorX+":");
		m.decisaoMarcarX(jogo);
		jogoCompleto(jogo);
		c.empate(jogo);
		c.ganhadorX(jogo);
		c.ganhadorO(jogo);
		System.out.println();
		
		
			if(c.situacaoJogo==true)
			{
			System.out.println("DEU VELHA");
			break;
			}
			else if(c.ganhadorX(jogo)==true)
			{
				System.out.println("JOGADOR "+ jogadorX+ " GANHOU !!!");
				break;
			}
			else if(c.ganhadorO(jogo)==true)
			{
				System.out.println("JOGADOR "+ jogadorO+ " GANHOU !!!");
				break;
			}
				
		System.out.println();
		System.out.println("PLAYER 2 - "+jogadorO+":");
		m.decisaoMarcarO(jogo);
		jogoCompleto(jogo);
		c.empate(jogo);
		c.ganhadorX(jogo);
		c.ganhadorO(jogo);
		System.out.println();
		
			if(c.situacaoJogo==true)
			{
				System.out.println("DEU VELHA");
				break;
			}
			else if(c.ganhadorX(jogo)==true)
			{
				System.out.println("JOGADOR "+ jogadorX+ " GANHOU !!!");
				break;
			}
			else if(c.ganhadorO(jogo)==true)
			{
				System.out.println("JOGADOR "+ jogadorO+ " GANHOU !!!");
				break;
			}
			
		
		}
		scan.close();
}
}