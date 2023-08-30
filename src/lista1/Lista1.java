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
				System.out.println("número não válido");
			}
		}

		// ITEM 2
		if (A < 10) {
			System.out.println("A < 10");
		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
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
			System.out.println("número válido");
		} else if (A == B) {
			System.out
					.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		} else {
			System.out.println("número não válido");
		}

		// ITEM 5
		if (A > 10 || A + B == 20) {
			System.out.println("número válido");
		} else {
			System.out.println("número não válido");
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
			System.out.println("números válidos");
		} else {
			System.out.println("número não válido");
		}

		// ITEM 8
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}

		// ITEM 9
		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}

		// ITEM 10
		if (A > 10) {

		} else {
			System.out.println("número menor que 10");
		}

		if (A + B == 20) {

		} else {
			System.out.println("número diferente de 20");
		}

		// ITEM 11
		if (A > 10) {

		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}

		// ITEM 12
		if (A > 10 || A + B == 20) {
			System.out.println("A > 10 ou A + B == 20");
		} else {
			System.out.println("números não válidos");
		}

		System.out
				.println("Sejam bem-vindos à disciplina de Técnicas de Programação");

		// ITEM 13
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("números não válidos");
			}
		} else {
			System.out.println("números não válidos");
		}

		// ITEM 14
		if (A > 10) {
			System.out.println("A > 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("número não válido");
			}
		}

		// ITEM 15
		if (A < 10) {
			System.out.println("A < 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else if (A + B != 20) {
			System.out.println("número não válido");
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
            System.out.println("número válido");
        } else if (A == B) {
            System.out.println("A é igual B");
        } else if (A != 10 && B != 10 && A < 10) {
            System.out.println("A é menor que 10");
        } else {
            System.out.println("número não válido");
        }
		
		// ITEM 18
		if (A > 10 || A + B == 20) {
            System.out.println("número válido");
        } else {
            System.out.println("número não válido");
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
            System.out.println("números válidos");
        } else {
            System.out.println("número não válido");
        }
        
        System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}
}
