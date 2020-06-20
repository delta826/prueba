package proyecto_ref;

public class Colection {
	AVLTree A;

	public Colection() {
		this.A = new AVLTree();
		Document x = new Document("El Quijote", "Miguel de Cervantes Saavedra","Oveja Negra", "Bloque 1");

		Document a = new Document("El Quijote", "Miguel de Cervantes Saavedra","Oveja Negra", "Bloque 1");
		Document b = new Document("Harry Potter", "J.K Rowling","Oveja Negra", "Bloque 1");
		Document c = new Document("El señor de los Anillos", "J.R.R Tolkien","Oveja Negra", "Bloque 1");
		Document d = new Document("El Alquimista", "Paulo Coelho","Oveja Negra", "Bloque 1");
		Document e = new Document("El Código da Vinci", "Dan Brown","Oveja Negra", "Bloque 1");
		Document g = new Document("Crepúsculo", "Stephenie Meyer","Oveja Negra", "Bloque 1");
		Document f = new Document("Lo que el viento se llevó", "Miguel de Cervantes Saavedra","Oveja Negra", "Bloque 1");
		Document h = new Document("Citas del Presidente", "Mao Tse-Tung","Oveja Negra", "Bloque 1");
		Document i = new Document("El diario de Ana Frank ", "Anna Frank","Oveja Negra", "Bloque 1");
		Document j = new Document("El enigma de la habitación 622", "DICKER, JOËL","Oveja Negra", "Bloque 1");
		Document k = new Document("A propósito de nada", "ALLEN, WOODY","Oveja Negra", "Bloque 1");
		Document l = new Document("Los Juegos del Hambre", "COLLINS SUZANNE","Oveja Negra", "Bloque 1");
		Document m = new Document("La nena", "MOLA, CARMEN","Oveja Negra", "Bloque 1");
		Document n = new Document("Mil besos prohibidos", "ÓNEGA, SONSOLES","Oveja Negra", "Bloque 1");
		Document o = new Document("La madre de Frankenstein", "GRANDES, ALMUDENA","Oveja Negra", "Bloque 1");
		Document p = new Document("Y Julia retó a los dioses", "POSTEGUILLO, SANTIAGO","Oveja Negra", "Bloque 1");
		Document q = new Document("A corazón abierto", "LINDO, ELVIRA","Oveja Negra", "Bloque 1");
		Document r = new Document("El Quijote", "Miguel de Cervantes Saavedra","Oveja Negra", "Bloque 1");
		
		Document aa = new Document("Lo que el viento se llevó ", "Miguel de Cervantes Saavedra","Oveja Negra", "Bloque 1");
		Document ba = new Document("Citas del Presidente ", "Mao Tse-Tung","Oveja Negra", "Bloque 1");
		Document ca = new Document("El diario de Ana Frank   ", "Anna Frank","Oveja Negra", "Bloque 1");
		Document da = new Document("El enigma de la habitación 3622", "DICKER, JOËL","Oveja Negra", "Bloque 1");
		Document ea = new Document("A propósito de nada ", "ALLEN, WOODY","Oveja Negra", "Bloque 1");
		Document fa = new Document("Los Juegos del Hambre ", "COLLINS SUZANNE","Oveja Negra", "Bloque 1");
		
		A.insert(x);
		A.insert(a);
		A.insert(b);
		A.insert(c);
		A.insert(d);
		A.insert(e);
		A.insert(f);
		A.insert(g);
		A.insert(h);
		A.insert(i);
		A.insert(j);
		A.insert(k);
		A.insert(l);
		A.insert(m);
		A.insert(n);
		A.insert(o);
		A.insert(p);
		A.insert(q);
		A.insert(r);
		A.insert(x);
		A.insert(x);
		A.insert(j);
		A.insert(k);
		A.insert(l);
		A.insert(d);
		A.insert(fa);
		
		A.insert(aa);
		A.insert(ba);
		A.insert(ca);
		A.insert(da);
		A.insert(ea);
	}    
}
