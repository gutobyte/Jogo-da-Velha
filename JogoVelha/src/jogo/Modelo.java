package jogo;

public class Modelo {
	
	public void exemploJogo()
	{
		char modelo[][]= new char[3][3];
		modelo[0][0]='A';
		modelo[0][1]='B';
		modelo[0][2]='C';
		
		modelo[1][0]='D';
		modelo[1][1]='E';
		modelo[1][2]='F';
		
		
		modelo[2][0]='G';
		modelo[2][1]='H';
		modelo[2][2]='I';
		
		System.out.println("MODELO DO JOGO:");
		
		for(int i=0;i<modelo.length;i++)
		{
			System.out.print(" ");
			System.out.println();
			
			for(int j=0;j<modelo.length;j++) 
			{
				System.out.print(" "+modelo[i][j]);
				
				
			}
			
			
		}
	}

}
