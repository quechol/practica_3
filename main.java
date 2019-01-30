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
	int inf; 	//Límite inferior
	int sup; 	//Límite superior
	int dirE; 	//Dirección inicial del arreglo
	
	
	
	printf("\nCalculador de Dirección en un Punto dentro de un Arreglo N-Dimensional\n\n");
	printf("Tamaño del arreglo (N dimensiones): ");
	scanf("%d",&n);
	printf("\nTamaño del tipo de dato(entero, caracter, real, etc) en bytes: ");
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
	
	
	//SE CALCULAN Y GUARDAN LOS RANGOS
	int res;
	for (int g = 1; g<= n; g++){
		res = (superiores[g-1] - inferiores[g-1]) + 1;
		rangos[g-1] = res;
		printf("Rango %d: %d \n",g,rangos[g-1]);
	}
	
	//POSICIONES A CALCULAR (K'S)
	int k;
	int flag;
	printf("Ingrese las posiciones a calcular\n");
	for(int i=1; i<=n; i++){
		do{
			printf("Dirección k[%d]: ",i);
			scanf("%d",&k);
			if(k<=superiores[i-1] || k>=inferiores[i-1]){ //Validación del k que debe estar dentro de los límites inferior y superior
				ks[i-1] = k;
				flag = 1;
			}else{
				printf("La posición no se encuentra dentro de los límites\n");
				flag = 0;
			}
		}while(flag == 0);
	}
	
//POLINOMIO DE DIRECCIONAMIENTO PARA N DIMENSIONES: si el n=4
/*  pd(E[k1,k2,…,kn])=  dirE+[r1*r2*r3*…*rn-1*(kn - infn)     +       r1*r2*r3*…*rn-2*(kn-1 - infn-1)     +…+    r1*(k2 - inf2)   +   (k1 - inf1)] * T */
	/*100 + [r1*r2*r3*(k4 - inf4) +  r1*r2*(k3 - inf3)  +  r1*(k2 - inf2) +  (k1 - inf1)] * 4								*/
	
	
//LA IDEA ES CALCULAR PRIMERO TODOS LOS PARÉNTESIS E IRLOS GUARDANDO DE DERECHA A IZQUIERDA EN UN ARREGLO
//Y LUEGO RECORRER ESE ARREGLO PARA MULTIPLICAR APROPIADAMENTE CADA RANGO, EN CASO DEL PRIMERO SE MULTIPLICA SOLO UN 1
	
	//MENU
	int opcion;
	double pD;
	int parentesis[n-1]; //Arreglo donde se guardan los valores de los paréntesis
	int resultados[n-1]; //Arreglo donde se guardan los resultados de la multiplicación de los paréntesis con los rangos
	
	printf("¿Desea calcular finalmente el polinomio de direccionamiento? \n	1:Sí\n	2:No\n");
	scanf("%d",&opcion);
	if(opcion == 1){
		for(int m=0; m<=n-1; m++){
			parentesis[m] = ks[m] - inferiores[m];
			if(m == 0){ //Sólo pasará una vez
				resultados[m] = parentesis[m];
			}else{
				for(int r=0; r<m ; r++){ //Multiplicación de los rangos
					while(r != (n-1)){
						
					}
					
				}
				resultados[m] = parentesis[m] * rangos[m];
			}
		}
	}else if(opcion == 0){
		printf("Fin del programa");
	}
	
	//CALCULO final
	
	
	
	return 0;
}




