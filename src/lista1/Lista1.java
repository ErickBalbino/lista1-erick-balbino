package lista1;

public class Lista1 {
	public static void main(String[] args) {
		int A = 12;
		int B = 8;

		// ITEM 1
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("n�mero n�o v�lido");
			}
		}

		// ITEM 2
		if (A < 10) {
			System.out.println("A < 10");
		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 3
		if (A == 10) {
			System.out.println("A == 10");
		}

		if (A + B == 20) {
			System.out.println("A + B == 20");
		}

		if (B == 10) {
			System.out.println("B == 10");
		}

		// ITEM 4
		if (A > 10 || A + B == 20) {
			System.out.println("n�mero v�lido");
		} else if (A == B) {
			System.out
					.println("A � igual B; A e B s�o diferentes de 10; A � menor que 10");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 5
		if (A > 10 || A + B == 20) {
			System.out.println("n�mero v�lido");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 6
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}

		// ITEM 7
		if (A > 10 || A + B == 20) {
			System.out.println("n�meros v�lidos");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 8
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("n�mero n�o v�lido");
			}
		}

		// ITEM 9
		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 10
		if (A > 10) {

		} else {
			System.out.println("n�mero menor que 10");
		}

		if (A + B == 20) {

		} else {
			System.out.println("n�mero diferente de 20");
		}

		// ITEM 11
		if (A > 10) {

		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 12
		if (A > 10 || A + B == 20) {
			System.out.println("A > 10 ou A + B == 20");
		} else {
			System.out.println("n�meros n�o v�lidos");
		}

		System.out
				.println("Sejam bem-vindos � disciplina de T�cnicas de Programa��o");

		// ITEM 13
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("n�meros n�o v�lidos");
			}
		} else {
			System.out.println("n�meros n�o v�lidos");
		}

		// ITEM 14
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("n�mero n�o v�lido");
			}
		}

		// ITEM 15
		if (A < 10) {
			System.out.println("A < 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else if (A + B != 20) {
			System.out.println("n�mero n�o v�lido");
		}

		// ITEM 16
		if (A == 10) {
			System.out.println("A == 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");

				if (B == 10) {
					System.out.println("B == 10");
				}
			}
		}
		
		// ITEM 17
		if (A > 10 || A + B == 20) {
            System.out.println("n�mero v�lido");
        } else if (A == B) {
            System.out.println("A � igual B");
        } else if (A != 10 && B != 10 && A < 10) {
            System.out.println("A � menor que 10");
        } else {
            System.out.println("n�mero n�o v�lido");
        }
		
		// ITEM 18
		if (A > 10 || A + B == 20) {
            System.out.println("n�mero v�lido");
        } else {
            System.out.println("n�mero n�o v�lido");
        }
		
		// ITEM 19
		if (A > 10) {
            System.out.println("A > 10");
        } else {
            System.out.println("A <= 10");
        }
        
        if (A + B == 20) {
            System.out.println("A + B == 20");
        } else {
            System.out.println("A + B != 20");
        }
        
        // ITEM 20
        if (A > 10 || A + B == 20) {
            System.out.println("n�meros v�lidos");
        } else {
            System.out.println("n�mero n�o v�lido");
        }
        
        System.out.println("Sejam bem-vindos � disciplina de T�cnicas de Programa��o");
	}
}
