package com.questao.oito;

public class RespostaQuestaoOito {

	public static void main(String[] args) {
		
		Integer A = new Integer(10256);
		Integer B = new Integer(512);
		Integer C = new Integer(0);
		String[] strA = A.toString().split("");
		String[] strB = B.toString().split("");
		StringBuilder strC = new StringBuilder("");
		Integer maior = Integer.max(strA.length, strB.length);
			for (int i = 0; i < maior; i++) {
				if (i < strA.length) {
					strC.append(strA[i]);
				}
				if (i < strB.length) {
					strC.append(strB[i]);
				}
			}
			C = Integer.parseInt(strC.toString());
			if (C < new Integer(1000000)) {
				System.out.println(C);				
			}
			else
				System.out.println(new Integer(-1));	
	}
	
}
