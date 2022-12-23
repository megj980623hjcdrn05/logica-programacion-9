package nueve;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("gato", "cat");
		diccionario.put("lobo", "wolf");
		diccionario.put("perro", "dog");
		diccionario.put("pulpo", "octopus");
		diccionario.put("anguila", "eel");
		diccionario.put("mantarraya", "Stingray");
		diccionario.put("Medusa", "jellyfish");
		diccionario.put("manzana", "apple");
		diccionario.put("puerta", "door");
		diccionario.put("derecha", "right");
		diccionario.put("izquierda", "left");
		diccionario.put("tiempo", "time");
		diccionario.put("pulsera", "bracelet");
		diccionario.put("ir", "go");
		diccionario.put("brincar", "jump");
		diccionario.put("tener", "have");
		diccionario.put("volar", "fly");
		diccionario.put("mosca", "fly");
		diccionario.put("arbol", "tree");
		diccionario.put("nodo", "node");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("dame la palabra que desea traducir ");
		String word= scanner.nextLine();
		if(diccionario.get(word)==null)
			System.out.println("la palabra no esta en el diccionario");
		else
		System.out.println(diccionario.get(word));

	}

	}

