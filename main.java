/*
 PRÁCTICA 3: POLINOMIO DE DIRECCIONAMIENTO PARA N DIMENSIONES
 
	FRANCISCO OLVERA HERNÁNDEZ
  SAÚL MALDONADO NAVARRO
  FRANCO STIVEN SOSA LURIA
  GERARDO MIGUEL QUECHOL ZÁRATE
  ELÍAS RODRÍGUEZ CHIMAL
*/
#include<stdio.h>
#include <string.h>
#include <stdlib.h>
#include<math.h>

int main (){
	
  int n;      //Para las n dimensiones del arreglo
	int bytes; 	//Tamaño en bytes del tipo de dato
	int inf; 		//Límite inferior
	int sup; 		//Límite superior
  int dirE; 	//Dirección inicial del arreglo
	
	
	
	printf("\nCalculador de Dirección en un Punto dentro de un Arreglo N-Dimensional\n\n");
	printf("Tamaño del arreglo (N dimensiones): ");
	scanf("%d",&n);
	printf("\nTamaño del tipo de dato(entero,caracter,real,etc) en bytes: ");
	scanf("%d",&bytes);
  printf("\nEscriba la dirección inicial del arreglo: ");
  scanf("%d",&dirE);
	
	//DECLARACIÓN DE LOS ARREGLOS
	int inferiores[n-1];
  int superiores[n-1];
  int rangos[n-1];
  int ks [n-1];
	
  
	//SE LE PIDE AL USUARIO LOS LIMITES INFERIORES Y SUPERIORES
	for(int j=1; j<=n; j++){
		printf("Límite inferior %d: \n",j);
		scanf("%d",&inf); 
		inferiores[j-1] = inf;
    printf("Límite superior %d: \n",j);
		scanf("%d",&sup);
    superiores[j-1] = sup;
		
  }
  
  
  //SE CALCLULAN Y GUARDAN LOS RANGOS
  int res;
  for (int g = 1; g<= n; g++){
    res = (superiores[g-1] - inferiores[g-1]) + 1;
    rangos[g-1] = res;
  }
	
  //POSICIONES A CALCULAR (K'S)
  int k;
  int flag;
	printf("Ingrese las posiciones a calcular\n");
	for(int i=1; i<=n; i++){
    do{
      printf("Dirección k[%d]: ",i);
   		scanf("%d",&k);
    	if(k<=superiores[i-1] || k>=inferiores[i-1]){ //Validación del k que debe estar dentro de los límites inferio y superior
      	ks[i-1] = k;
        flag = 1;
    	}else{
      	printf("La posición no se encuentra dentro de los límites\n");
        flag = 0;
    	}
    }while(flag == 0);
	}
  
  //CALCULAR R MAXIMO
  int rmax = 0;
  for(int xD = 1; xD<=n; xD++){
    
   rmax = rmax*superiores[xD-1];
    
  }
  
  
  
  
  //MENU
  int opcion;
  double pD;
  printf("¿Desea calcular finalmente el polinomio de direccionamiento? \n	1:Sí\n	2:No\n");
  scanf("%d",&opcion);
  if(opcion == 1){ //Uso de toda la información guardada en los arreglos utilizando p.D de n dimensiones
    pD = dirE +[]
  }else if(opcion == 0){
    printf("XD");
  }
  
	
return 0;
}
