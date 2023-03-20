package ar1jhonar;

public class JuegoMAtrices {

    public static void main(String[] args) {
        // Programa ejecutable
 	 int prueba[][]= new int [3][3];
         //int prueba[][]={{1,2,3},{4,5,6},{7,8,9}} para crear y rellenar a la vez, 
         //solo si conocemos los valores.
	 //empieza el conatdor en 1 para rellenar
	int start=1;
	//va metiendo numers del 1 al 9 en el array
	for(int i=0; i<prueba.length; i++){
		for(int j=0; j<prueba.length; j++){
			prueba[i][j]=start;
			start++;
		}	
	}
	//esto lo imprime por 
	for(int i=0; i<prueba.length; i++){
		for(int j=0; j<prueba.length; j++){
			System.out.print(prueba[i][j]+"\t");
		}
		System.out.println();
	}
	//ahora metemos 0 en la diagonal
	
	for(int i=0; i<prueba.length; i++){
		prueba[i][i]=0; //sera 0 en prueba[0][0] prueba[1][1] prueba[2][2]
		System.out.println();
	}
	//mostramos otra vez
	//System.out.println();
	for(int x[]: prueba){
		for(int y:x){
		System.out.print(y+"\t");
		}
		System.out.println();
	}       
        
        
    }

}
