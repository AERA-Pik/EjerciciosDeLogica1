package main;


import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Main {  
	
	//metodo main
    public static void main(String args[]) {
    	int opcion;
    	System.out.println("Hola bienvenido por favor revisa la documentacion para saber que hace cada opcion");
    	System.out.println("Selecciona el numero de programa que deseas usar");
    	System.out.println("1.	A contar lápices ");
    	System.out.println("2.	Lectura y escritura");
    	System.out.println("3.	Bisiesto sencillo");
    	System.out.println("4.	Matriz diagonal");
    	System.out.println("5.	Cola Bancaria de la suerte");
    	
    	Scanner in = new Scanner(System.in);
    	opcion = in.nextInt();
    	
    	switch (opcion) {
            case 1: contarLapices();
                    break;
            case 2: lecturaYEscritura();
                    break;
            case 3: bisiestoSencillo();
                    break;
            case 4: matrizDiagonal();
                    break;   
            case 5: colaBancariaSuerte();
            		break; 
            default: System.out.println("Opcion Invalida");
                     break;
        }
    	in.close();     
    }
    
    //metodo para resolver el problema 1
	public static void contarLapices() {		
	    int lapices[], nn, kk; 
	    int contadorDeLapices = 0;
	    	
	    Scanner in = new Scanner(System.in);
	    System.out.println("Ingrese la cantidad de lapices");
	    nn = in.nextInt();
	    System.out.println("Ingrese el numero de los lapices que desea contar");
	    kk = in.nextInt();
	    lapices = new int[nn];
	    
	    System.out.println("Ingrese los lapices");
	    for(int i = 0; i < nn; i++) {
	    	lapices[i] = in.nextInt();
	    }
	    
	    for (int i = 0; i < nn; i++) {
	        if (lapices[i] == kk) {
	        	contadorDeLapices++;
	        	}
	        }
	    if(contadorDeLapices == 0) {
	    	System.out.println("No hay lapices con el numero " + kk);    
	    } else if(contadorDeLapices == 1) {
	    	System.out.println("Hay 1 lapiz con el numero " + kk);
	    } else {
	    	System.out.println("Hay " + contadorDeLapices + " lapices con el numero " + kk);
	    }	   
	}
	
	
    //metodo para resolver el problema 2
	public static void lecturaYEscritura() {
		int minutos, segundos;
		System.out.println("Ingresa la cantidad de minutos que deseas convertir");
		Scanner in = new Scanner(System.in);
		minutos = in.nextInt();
		if (minutos <= 0 || minutos > 60) {
		    System.out.println("Cantidad invalida");
		    return;  
		}
		segundos = minutos * 60;
		
		System.out.println(minutos + " minutos es equivalente a " + segundos);			
	}
	
	
    //metodo para resolver el problema 3
	public static void bisiestoSencillo() {
		int anio;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa el año que deseas verificar");
		anio = in.nextInt();
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("S");
		else
			System.out.println("N");
	}
	
    //metodo para resolver el problema 4
	public static void matrizDiagonal() {
		int n, matriz[][];
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa el tamaño de la matriz cuadrada");
		n = in.nextInt();
		
		System.out.println("Ingresa los numeros de la matriz");
		matriz = new int[n][n];	
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		
		boolean esIgual = true;
		int i = 0;
		int j = 1;
		while (j < n && esIgual == true){			
			if (matriz[i][i] != matriz[j][j]) {
				esIgual = false;
			}
			i++;
			j++;		
		}
		
		if (esIgual == true) {
			System.out.println("SI");
		} else {
		    System.out.println("NO");
		}
		
	}
	
    //Metodo para resolver el problema 5
		public static void colaBancariaSuerte() {
			int ee, ii;
			char evento, ll;
			List<Cliente> colaDeClientes = new ArrayList<Cliente>();
			
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce la cantidad de eventos");
			ee = in.nextInt();
			if (ee < 1 || ee > 50000) {
			    System.out.println("Cantidad Invalida");
			    return;
			}
			
			for (int i = 1; i <= ee; i++) {
			    System.out.println("Introduce el tipo de evento " + (i));
			    evento = in.next().toUpperCase().charAt(0);
			    
			    switch (evento) {
	    	        case 'C':
	    	        	System.out.println("Introduce el nombre cliente y la prioridad");
	    	        	colaDeClientes.add(new Cliente(in.next(), in.nextInt()));
	    	        	System.out.println("Clientes Actuales: " + colaDeClientes.toString());
	    	        	break;
	    	        	
	    	        case 'S':   
	    	        	System.out.println("Introduce la letra del sorteo");
	    	        	ll = in.next().toUpperCase().charAt(0);    	        	
	    	        	System.out.println("Introduce la prioridad que se va a sumar");
	    	        	ii = in.nextInt();
	    	        	for (int j = 1; j < colaDeClientes.size(); j++) {
	    	        		if (colaDeClientes.get(j).NN.charAt(0) == ii) {
	    	        			colaDeClientes.get(j).PP += ii;
	    	        			System.out.println("Clientes Actuales: " + colaDeClientes.toString());
	    	        		}
	    	        	}    	        	
	    	        	break;
	    	        	
	    	        case 'A':
	    	        	int valMax = 0;
	    	            int indexValMax = -1;
	    	            for (int j = 0; j < colaDeClientes.size(); j++) {
	    	                if(colaDeClientes.get(j).PP > valMax) {
	    	                	valMax = colaDeClientes.get(j).PP;
	    	                	indexValMax = j;
	    	                }	    	                	    	                 
	    	            }
	    	            System.out.println("Se atendio a " + colaDeClientes.get(indexValMax).NN);
	    	            colaDeClientes.remove(indexValMax);
	    	            System.out.println("Clientes Actuales: " + colaDeClientes.toString());
	    	            break;
	    	            
	    	        default: System.out.println("Opcion Invalida");
	    	        return;
	    	        }
			}
			
		}
		
	}